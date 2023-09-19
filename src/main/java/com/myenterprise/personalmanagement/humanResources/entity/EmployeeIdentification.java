package com.myenterprise.personalmanagement.humanResources.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class EmployeeIdentification {
  @Id
  private UUID id;
  private String firstName;
  private String lastName;
  private String address;
  private String insuranceNumber;
  private int registerNumber;
  private String department;
  private String job;
  private int seniority;
  private String contractStartAt;
  private double dailyPackage;

  public EmployeeIdentification() {
  }

  public EmployeeIdentification(UUID id, String firstName, String lastName, String address, String insuranceNumber, int registerNumber, String department, String job, int seniority, String contractStartAt, double dailyPackage) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.insuranceNumber = insuranceNumber;
    this.registerNumber = registerNumber;
    this.department = department;
    this.job = job;
    this.seniority = seniority;
    this.contractStartAt = contractStartAt;
    this.dailyPackage = dailyPackage;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getInsuranceNumber() {
    return insuranceNumber;
  }

  public void setInsuranceNumber(String insuranceNumber) {
    this.insuranceNumber = insuranceNumber;
  }

  public int getRegisterNumber() {
    return registerNumber;
  }

  public void setRegisterNumber(int registerNumber) {
    this.registerNumber = registerNumber;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public int getSeniority() {
    return seniority;
  }

  public void setSeniority(int seniority) {
    this.seniority = seniority;
  }

  public String getContractStartAt() {
    return contractStartAt;
  }

  public void setContractStartAt(String contractStartAt) {
    this.contractStartAt = contractStartAt;
  }

  public double getDailyPackage() {
    return dailyPackage;
  }

  public void setDailyPackage(double dailyPackage) {
    this.dailyPackage = dailyPackage;
  }
}
