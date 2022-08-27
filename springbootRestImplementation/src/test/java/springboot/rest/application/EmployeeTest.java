package springboot.rest.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import springboot.rest.application.model.Employee;
import springboot.rest.application.repository.EmployeeRepository;
import springboot.rest.application.service.EmployeeService;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;

public class EmployeeTest extends ApplicationTests{

    @Autowired
    private EmployeeService employeeService;

    @MockBean
    private EmployeeRepository employeeRepository;

    @Test
    public void getEmployeeByIdTest() {
        Employee employeeExpected = new Employee();
        employeeExpected.setEmail("adulis.abun@gmail.com");
        employeeExpected.setFirstName("adulis");
        when(employeeRepository.findAll()).thenReturn(Stream
                .of(employeeExpected).collect(Collectors.toList()));

         Assertions.assertEquals(2, employeeService.getAllEmployees().size());
    }

}
