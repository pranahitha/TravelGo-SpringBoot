package com.travelgo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travelgo.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{

}
