package com.example.zorro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OsdemoApplication implements CommandLineRunner {
	@Autowired
	private OsConfig myConfig;
	
	
	public static void main(String[] args) {
		SpringApplication.run(OsdemoApplication.class, args);
		
	}
	
	public void run(String... args) throws Exception {
        System.out.println("Profile: " + myConfig.getProfile());
        System.out.println("Port: " + myConfig.getPort());
        System.out.println("Database: " + myConfig.getDatabase());
        System.out.println("DB URL: " + myConfig.getDatasource_url());
        System.out.println("DB user: " + myConfig.getDatasource_user());
        System.out.println("DB DriverClassName: " + myConfig.getDatasource_driver_class());
        
        
    }
}
