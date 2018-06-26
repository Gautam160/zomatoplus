package com.thinkxfactor.zomatoplus.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.model.Items;

public interface ItemsRepository extends JpaRepository<Items,Long>{

}