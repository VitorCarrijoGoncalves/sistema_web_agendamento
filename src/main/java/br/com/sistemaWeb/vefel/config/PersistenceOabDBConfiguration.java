package br.com.sistemaWeb.vefel.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
//import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
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
@EnableJpaRepositories(basePackages = "br.com.sistemaWeb.vefel.bd_oab.repository",
        entityManagerFactoryRef = "oabEntityManagerFactory",
        transactionManagerRef= "oabTransactionManager"
)
public class PersistenceOabDBConfiguration {

    @Bean(value = "brconselho")
    @ConfigurationProperties("database2.datasource")
    public DataSourceProperties secondDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("database2.datasource.configuration")
       public BasicDataSource secondDataSource() {
        return secondDataSourceProperties().initializeDataSourceBuilder().type(BasicDataSource.class).build();
    }

    @Bean(name = "oabEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean brConselhoEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(secondDataSource())
                .packages("br.com.oab.esa.bd2")
                .persistenceUnit("brConselhoUnit")
                .build();
    }

    @Bean(name = "oabTransactionManager")
    public PlatformTransactionManager brConselhoTransactionManager(
            @Qualifier("oabEntityManagerFactory") EntityManagerFactory oabEntityManagerFactory) {
        return new JpaTransactionManager(oabEntityManagerFactory);
    }

}