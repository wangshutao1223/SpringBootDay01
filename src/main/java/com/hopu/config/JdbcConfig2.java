package com.hopu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig2 {

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        return  dataSource;
    }
}
