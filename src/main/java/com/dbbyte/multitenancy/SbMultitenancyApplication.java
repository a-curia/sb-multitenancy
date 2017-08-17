package com.dbbyte.multitenancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * step_1
 * we have to exclude the default configuration, because we want to provide 
 * our multi tenant the data source configuration
 *
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SbMultitenancyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMultitenancyApplication.class, args);
	}
}
