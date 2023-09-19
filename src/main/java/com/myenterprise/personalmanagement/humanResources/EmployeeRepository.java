package com.myenterprise.personalmanagement.humanResources;

import com.myenterprise.personalmanagement.humanResources.entity.EmployeeIdentification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeIdentification, UUID> {
  List<EmployeeIdentification> findAll();
}
