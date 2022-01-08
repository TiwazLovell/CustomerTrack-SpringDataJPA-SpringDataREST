package springboot.hibernate.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.hibernate.crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
