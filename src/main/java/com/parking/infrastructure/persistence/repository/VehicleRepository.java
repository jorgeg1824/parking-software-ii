package com.parking.infrastructure.persistence.repository;

import java.util.List;
import java.util.UUID;

import com.parking.infrastructure.persistence.repository.entity.VehicleEntity;

public interface VehicleRepository {
	
	void create(VehicleEntity entity);
	
	void update(UUID id, VehicleEntity entity);
	
	void delete(UUID id);
	
	List<VehicleEntity> findAll();
	
	List<VehicleEntity> findByFilter(VehicleEntity filter);
	
	VehicleEntity findById(UUID id);

}
