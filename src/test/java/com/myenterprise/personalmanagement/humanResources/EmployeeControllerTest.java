package com.myenterprise.personalmanagement.humanResources;

import com.myenterprise.personalmanagement.humanResources.entity.EmployeeResume;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class EmployeeControllerTest {
  @Autowired
  private MockMvc mock;

  @MockBean
  private EmployeeService service;

  private EmployeeResume employeeResume1 =
      new EmployeeResume("michel","durand",23,"logistique","magasinier");

  private EmployeeResume employeeResume2 =
      new EmployeeResume("jean","chambier",36,"production","usineur");

  @Test
  void givenTwoEmployeesWhenGetAllEmployeesThenReturnListOfTwoEmployeesWithStatus200() throws Exception {
    when(service.getAllEmployees()).thenReturn(List.of(employeeResume1,employeeResume2));

    mock.perform(get("/employees"))
        .andExpect(status().isOk())
        .andExpect(content().json(
            "[{\"firstName\":\"michel\",\"lastName\":\"durand\",\"registerNumber\":23," +
                "\"department\":\"logistique\",\"job\":\"magasinier\"},"+

                "{\"firstName\":\"jean\",\"lastName\":\"chambier\",\"registerNumber\":36,\"department\":\"production\"," +
                "\"job\":\"usineur\"}]"
        ));
  }

  @Test
  void givenNoEmployeeWhenGetAllEmployeesThenReturnAnEmptyListWithStatus204() throws Exception {
    when(service.getAllEmployees()).thenReturn(List.of());

    mock.perform(get("/employees"))
        .andExpect(status().isNoContent())
        .andExpect(content().json("[]"));
  }
}
