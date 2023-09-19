package com.myenterprise.personalmanagement.humanResources.entity;

public class EmployeeResume {
  private String firstName;
  private String lastName;
  private int registerNumber;
  private String department;
  private String job;

  public EmployeeResume(String firstName, String lastName, int registerNumber, String department, String job) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.registerNumber = registerNumber;
    this.department = department;
    this.job = job;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getRegisterNumber() {
    return registerNumber;
  }

  public String getDepartment() {
    return department;
  }

  public String getJob() {
    return job;
  }
}
