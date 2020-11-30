package com.feature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feature.entity.Feature;
import com.feature.repository.FeatureRepo;

@Service
public class FeatureService {
	
	@Autowired
	private FeatureRepo repo;
	
	public Iterable<Feature> listFeatures(){
		return repo.findAll();
	}
	
	public Feature addFeature(Feature feature){
		List<Feature> existingFeatures = repo.findByClientOrderByClientPriority(feature.getClient());
		Feature prevFeature = null;
		for(Feature feat : existingFeatures) {
			if(feat.getClientPriority() >= feature.getClientPriority()) {
				if( (prevFeature == null && feature.getClientPriority() != feat.getClientPriority()) || 
						(prevFeature != null && prevFeature.getClientPriority() != feat.getClientPriority())) {
					break;
				}
				feat.setClientPriority(feat.getClientPriority()+1);
				repo.save(feat);
				prevFeature = feat;
			}
		}
		return repo.save(feature);
	}

}
