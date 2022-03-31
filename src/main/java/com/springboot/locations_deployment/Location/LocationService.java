package com.springboot.locations_deployment.Location;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
	
	//database
	@Autowired  
	LocationRepository locationRepository;

	public Location insertLocation(Location location) {
		System.out.println(location.toString());
		return locationRepository.save(location);
	}
	
	public Location updateLocationWithObject(Location location) {
		System.out.println(location.toString());
		return locationRepository.save(location);
	}
	
	public List<Location> allLocations(){
		List<Location> locations = new ArrayList<Location>();  
		locationRepository.findAll().forEach(location -> locations.add(location));  
		return locations;  
	} 
		
	public String getLocationById(String id){ 
		try {
			return locationRepository.findById(id).get().toString();
		}
		catch(Exception e) {
			return "Cannot find a location with id: "+ id;
		}
	}  
		
	public Location insert( String name) {
		Location location = new Location(name);
		return locationRepository.save(location);
	}
		
	public String update(String id, String name) {
		try {
			Location locationFromDb = locationRepository.findById(id).get();
			locationFromDb.setName(name);				
			return locationRepository.save(locationFromDb).toString();
		}
		catch(Exception e) {
			return "Cannot update a row with id " + id;
		}
	}

	public String delete(String id, String name) {
		try {
			locationRepository.deleteById(id);
			return "Deleted Object";
		}
		catch(Exception e) {
			return "No such Object";
		}
	}
}