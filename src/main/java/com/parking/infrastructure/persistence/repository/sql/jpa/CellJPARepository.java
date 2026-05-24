package com.parking.infrastructure.persistence.repository.sql.jpa;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.infrastructure.persistence.repository.sql.jpa.entity.CellJPAEntity;

@Repository
public interface CellJPARepository extends JpaRepository<CellJPAEntity, UUID> {

}
