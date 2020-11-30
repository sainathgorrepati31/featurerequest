package com.feature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feature.entity.Feature;
import com.feature.service.FeatureService;

@RestController
public class FeatureRestController {
	
	@Autowired
	private FeatureService service;

	@GetMapping("/listfeatures")
	@CrossOrigin(origins = "http://localhost:4200")
	public Iterable<Feature> listFeatures(){
		return service.listFeatures();
	}

	@PostMapping("/addfeature")
	@CrossOrigin(origins = "http://localhost:4200")
	public Feature addFeature(@RequestBody Feature feature){
		return service.addFeature(feature);
	}
	
}
