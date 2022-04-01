package com.springboot.locations_deployment.Location;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
	
   @Autowired
   private LocationService locationService;
  
   
   //Generic Mapping
   @GetMapping("getAllLocations/{id}/{name}")  
   private List<Location> allLocations()   
   {  
   return locationService.allLocations();  
   }  
   @GetMapping("/getLocation/{id}/{name}")  
   private Optional<String> getDatabaseRow(@PathVariable("id") String id, @PathVariable("name") String name)   
   {   
	   return Optional.ofNullable(locationService.getLocationById(id));  
   }
   
   @PostMapping("/insertLocation/{id}/{name}")  
	public String insertDatabaseRow(@PathVariable("id") String id, @PathVariable("name") String name) {
	   return locationService.insert(name);
	}
   
   @PostMapping("/updateLocation/{id}/{name}")  
	public String updateDatabaseRow(@PathVariable("id") String id, @PathVariable("name") String name) {
	   return locationService.update(id, name);
	}
   
   @RequestMapping(value = "/deleteLocation/{id}/{name}",method=RequestMethod.DELETE)  
	public String deleteDatabaseRow(@PathVariable("id") String id, @PathVariable("name") String name) {
	   	return locationService.delete(id, name);
	}
   
   //JSON Post Mapping

   @GetMapping("getAllLocations")  
   private List<Location> getAllLocations()   
   {  
   return locationService.allLocations();  
   } 
   @GetMapping("/locations/{id}")  
   private String getLocationById(@PathVariable("id") String id)   
   {  
   return locationService.getLocationById(id);  
   }
   
   @PostMapping("/locationsInsertObject")
   private Location insertLocationWithObject(@RequestBody Location location)   
   {  
   return locationService.insertLocation(location);
   }
   @PostMapping("/locationsUpdateObject")
   private Location updateLocationWithObject(@RequestBody Location location)   
   {  
   return locationService.updateLocationWithObject(location);
   } 
}
