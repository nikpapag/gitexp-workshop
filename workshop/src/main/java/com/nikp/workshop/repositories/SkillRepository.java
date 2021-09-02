package com.nikp.workshop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nikp.workshop.entities.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {
	public List<Skill> findByLabel(String label);
}