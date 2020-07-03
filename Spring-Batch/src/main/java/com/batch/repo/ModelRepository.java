package com.batch.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.batch.model.Model;
@Repository
public interface ModelRepository extends JpaRepository<Model, Integer> {

	@Query("SELECT e FROM Model e WHERE e.pinCode = :pinCode")
	public List<Model> getByPincode( @Param("pinCode") String pincode);




}
