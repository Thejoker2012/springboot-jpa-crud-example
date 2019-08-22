package br.com.iago.springbootjpacrudexample.repository;

import br.com.iago.springbootjpacrudexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
