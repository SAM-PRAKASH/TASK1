package com.CRUDOperation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.CRUDOperation.Entity.EmpEntity;

public interface EmpRepository extends JpaRepository<EmpEntity, Long> {

	@Query(value ="select name from emp_entity ",nativeQuery = true)
	List<String> get3Names();
	
	//for JPA Query
	@Query(value ="select id,email from EmpEntity where name= :name")
	List<String> getNameOf(String name);

	
}
