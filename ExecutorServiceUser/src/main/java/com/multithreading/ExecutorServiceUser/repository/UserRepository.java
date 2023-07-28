package com.multithreading.ExecutorServiceUser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multithreading.ExecutorServiceUser.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
