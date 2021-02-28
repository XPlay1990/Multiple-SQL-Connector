package com.sql.sqlconnector.config

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.annotation.EnableTransactionManagement
import javax.persistence.EntityManagerFactory
import javax.sql.DataSource


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    entityManagerFactoryRef = "db2EntityManagerFactory",
    transactionManagerRef = "db2TransactionManager",
    basePackages = ["com.sql.sqlconnector.db2.data"]
)
class DB2Config {
    @Bean(name = ["db2DataSource"])
    @ConfigurationProperties(prefix = "spring.datasource2")
    fun db2DataSource(): DataSource {
        return DataSourceBuilder.create().build()
    }

    @Bean(name = ["db2EntityManagerFactory"])
    fun entityManagerFactory(
        builder: EntityManagerFactoryBuilder,
        @Qualifier("db2DataSource") dataSource: DataSource?
    ): LocalContainerEntityManagerFactoryBean {
        return builder
            .dataSource(dataSource)
            .packages("com.sql.sqlconnector.db2.data.entities")
            .persistenceUnit("db2")
            .build()
    }

    @Bean(name = ["db2TransactionManager"])
    fun db2TransactionManager(
        @Qualifier("db2EntityManagerFactory") db2EntityManagerFactory: EntityManagerFactory?
    ): PlatformTransactionManager {
        return JpaTransactionManager(db2EntityManagerFactory!!)
    }
}