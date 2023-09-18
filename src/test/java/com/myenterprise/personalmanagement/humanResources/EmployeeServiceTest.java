package com.myenterprise.personalmanagement.humanResources;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EmployeeServiceTest {
  private EmployeeRepository repository= mock(EmployeeRepository.class);

  private EmployeeIdentification employee1 =
      new EmployeeIdentification(UUID.fromString("7dc8a468-562a-11ee-8c99-0242ac120002"),"michel",
          "durand","1,rue de la paix 75000 Paris","1850576341112378",23,
          "logistique","magasinier",3,"01/01/2020",80.64);

  private EmployeeIdentification employee2 =
      new EmployeeIdentification(UUID.fromString("7dc8a468-562a-11ee-8c99-0242ac120002"),"jean",
          "chambier","10,rue de la concorde 75000 Paris","1900576341165478",36,
          "production","usineur",1,"01/01/2022",80.64);

  private EmployeeResume employeeResume1 =
      new EmployeeResume("michel","durand",23,"logistique","magasinier");

  private EmployeeResume employeeResume2 =
      new EmployeeResume("jean","chambier",36,"production","usineur");

  private EmployeeService service = new EmployeeService(repository);

  @Test
  void givenTwoEmployeesWhenGetAllThenReturnListOfTwoEmployeesResume(){
    when(repository.findAll()).thenReturn(List.of(employee1,employee2));

    List<EmployeeResume> list = service.getAllEmployees();

    assertThat(list.size()).isEqualTo(2);

    assertThat(list.get(0).getFirstName()).isEqualTo(employeeResume1.getFirstName());
    assertThat(list.get(0).getLastName()).isEqualTo(employeeResume1.getLastName());
    assertThat(list.get(0).getRegisterNumber()).isEqualTo(employeeResume1.getRegisterNumber());
    assertThat(list.get(0).getDepartment()).isEqualTo(employeeResume1.getDepartment());
    assertThat(list.get(0).getJob()).isEqualTo(employeeResume1.getJob());

    assertThat(list.get(1).getFirstName()).isEqualTo(employeeResume2.getFirstName());
    assertThat(list.get(1).getLastName()).isEqualTo(employeeResume2.getLastName());
    assertThat(list.get(1).getRegisterNumber()).isEqualTo(employeeResume2.getRegisterNumber());
    assertThat(list.get(1).getDepartment()).isEqualTo(employeeResume2.getDepartment());
    assertThat(list.get(1).getJob()).isEqualTo(employeeResume2.getJob());
  }

  @Test
  void givenNoEmployeeWhenGetAllThenReturnEmptyList() {
    when(repository.findAll()).thenReturn(List.of());

    List<EmployeeResume> list = service.getAllEmployees();

    assertTrue(list.isEmpty());

  }

}
