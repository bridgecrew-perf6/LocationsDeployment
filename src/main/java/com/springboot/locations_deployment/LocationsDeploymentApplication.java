package com.springboot.locations_deployment;

import com.springboot.locations_deployment.Location.LocationRepository;
import com.springboot.locations_deployment.configurations.SpringPropertiesConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocationsDeploymentApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(LocationsDeploymentApplication.class, args);
	}
	
	@Autowired
	SpringPropertiesConfiguration databasePropertiesConfiguration;

	@Autowired
	LocationRepository locationRepository;
	@Override
	public void run(String...args){
		System.out.println(databasePropertiesConfiguration);
		System.out.println(locationRepository.findAll());
        
    }
}
