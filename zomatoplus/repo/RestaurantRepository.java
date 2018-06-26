package com.thinkxfactor.zomatoplus.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long>{
	
	

}
