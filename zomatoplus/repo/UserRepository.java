package com.thinkxfactor.zomatoplus.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}

