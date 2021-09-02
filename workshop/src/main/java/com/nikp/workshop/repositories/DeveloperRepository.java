package com.nikp.workshop.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nikp.workshop.entities.Developer;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {

}