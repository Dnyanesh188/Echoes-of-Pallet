package com.artgalarysystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artgalarysystem.entity.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category, Integer> {

	List<Category> findByStatusIn(List<String> status);

	Long countByStatusIn(List<String> status);

}
