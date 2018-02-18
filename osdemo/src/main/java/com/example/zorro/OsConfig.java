package com.example.zorro;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
	@EnableConfigurationProperties
	@ConfigurationProperties
	public class OsConfig {
	
	@Value("${spring.profiles}")
	String profile;
	
	@Value("${server.port}")
	String port;
	
	@Value("${spring.jpa.database}")
	String database;
	
	@Value("${spring.datasource.url}")
	String datasource_url;
	
	@Value("${spring.datasource.username}")
	String datasource_user;
	
	@Value("${spring.datasource.driver-class-name}")
	String datasource_driver_class;
	
	
	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getDatasource_url() {
		return datasource_url;
	}

	public void setDatasource_url(String datasource_url) {
		this.datasource_url = datasource_url;
	}

	public String getDatasource_user() {
		return datasource_user;
	}

	public void setDatasource_user(String datasource_user) {
		this.datasource_user = datasource_user;
	}

	public String getDatasource_driver_class() {
		return datasource_driver_class;
	}

	public void setDatasource_driver_class(String datasource_driver_class) {
		this.datasource_driver_class = datasource_driver_class;
	}


	 
	}


