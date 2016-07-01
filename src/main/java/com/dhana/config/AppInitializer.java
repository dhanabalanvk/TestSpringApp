/**
 * 
 */
package com.dhana.config;

import javax.sql.DataSource;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.dhana.Application;

/**
 * @author DhanabalanV
 *
 */
@Configuration
public class AppInitializer extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
	
	@Bean
	 public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.3.175.2:3306/sivam");
        dataSource.setUsername("adminSU4sCUv");
        dataSource.setPassword("ihb-uiahj564");
        return dataSource;
    }
}
