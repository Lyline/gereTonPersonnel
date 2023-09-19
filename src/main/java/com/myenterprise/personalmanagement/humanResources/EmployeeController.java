package com.myenterprise.personalmanagement.humanResources;

import com.myenterprise.personalmanagement.humanResources.entity.EmployeeResume;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {
  private final EmployeeService service;

  public EmployeeController(EmployeeService service) {
    this.service = service;
  }

  @GetMapping("/employees")
  public ResponseEntity getAllEmployeesView(){
    List<EmployeeResume> result= service.getAllEmployees();

    if(result.isEmpty()){
      return new ResponseEntity(List.of(),HttpStatus.NO_CONTENT);
    }

    return new ResponseEntity(result, HttpStatus.OK);
  }
}
