package com.myenterprise.personalmanagement.humanResources;

import com.myenterprise.personalmanagement.humanResources.entity.EmployeeIdentification;
import com.myenterprise.personalmanagement.humanResources.entity.EmployeeResume;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

  private final EmployeeRepository repository;

  public EmployeeService(EmployeeRepository repository) {
    this.repository = repository;
  }

  public List<EmployeeResume> getAllEmployees(){
    List<EmployeeIdentification>list=repository.findAll();
    List<EmployeeResume> result = new ArrayList<>();

    for(EmployeeIdentification e :list){
     result.add( new EmployeeResume(e.getFirstName(),e.getLastName(),e.getRegisterNumber(),e.getDepartment(),e.getJob()));
    }
    return result;
  }
}
