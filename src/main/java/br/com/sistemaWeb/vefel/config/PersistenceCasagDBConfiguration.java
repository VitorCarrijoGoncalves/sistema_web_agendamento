package br.com.sistemaWeb.vefel.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;

//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
  //      entityManagerFactoryRef = "entityManagerFactory",
    //    basePackages = { "br.com.sistemaWeb.vefel.bd_casag.repository" }
//)
//public class PersistenceCasagDBConfiguration {

  //  @Primary
    //@Bean(name = "casag")
    //@ConfigurationProperties("bdcasag.datasource")
    //public DataSourceProperties firstDataSourceProperties(){
      //  return new DataSourceProperties();
    //}

    //@Bean
    //@Primary
    //@ConfigurationProperties("bdcasag.datasource.configuration")
    //public HikariDataSource firstDataSource() {
      //  return firstDataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    //}

    //@Primary
    //@Bean(name = "entityManagerFactory")
    //public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder) {
      //  return builder
        //        .dataSource(firstDataSource())
          //      .packages("br.com.sistemaWeb.vefel.bdcasag")
            //    .persistenceUnit("casagUnit")
              //  .build();
    //}

    //@Primary
    //@Bean(name = "transactionManager")
    //public PlatformTransactionManager transactionManager(
      //      final @Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
        //return new JpaTransactionManager(entityManagerFactory);
    //}


//}
