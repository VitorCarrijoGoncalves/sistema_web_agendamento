package br.com.sistemaWeb.vefel.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "oabEntityManagerFactory",
        transactionManagerRef = "oabTransactionManager",
        basePackages = { "br.com.sistemaWeb.vefel.bd_oab.repository" }
)
public class PersistenceOabDBConfiguration {

    @Autowired
    Environment env;

    @Bean(name = "oabDataSource")
    @ConfigurationProperties(prefix = "bdoab.datasource")
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("bdoab.datasource.driver-class-name"));
        dataSource.setUrl(env.getProperty("bdoab.datasource.url"));
        dataSource.setUsername(env.getProperty("bdoab.datasource.username"));
        dataSource.setPassword(env.getProperty("bdoab.datasource.password"));

        return dataSource;
    }

    @Bean(name = "oabEntityManagerFactory")
    @ConfigurationProperties(prefix = "bdoab.datasource.configuration")
    public LocalContainerEntityManagerFactoryBean
    oabEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("dataSource") DataSource dataSource
    ) {
        return builder
                .dataSource(dataSource)
                .packages("br.com.sistemaWeb.vefel.bd_oab")
                .persistenceUnit("bdOabUnit")
                .build();
    }

    @Bean(name = "oabTransactionManager")
    public PlatformTransactionManager oabTransactionManager(
            @Qualifier("oabEntityManagerFactory") EntityManagerFactory
                    oabEntityManagerFactory
    ) {
        return new JpaTransactionManager(oabEntityManagerFactory);
    }
}
