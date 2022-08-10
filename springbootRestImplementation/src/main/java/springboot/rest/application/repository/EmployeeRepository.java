package springboot.rest.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.rest.application.model.Employee;

/*JpaRepository - it has both @Repository and @Transaction so we don't need to add @Repository or @Transaction*/
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
