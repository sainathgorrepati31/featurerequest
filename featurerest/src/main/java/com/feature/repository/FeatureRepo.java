package com.feature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.feature.entity.Feature;

public interface FeatureRepo extends CrudRepository<Feature, Integer>{
	List<Feature> findByClientOrderByClientPriority(String client);
}
