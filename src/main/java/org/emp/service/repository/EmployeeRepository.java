package org.emp.service.repository;

import org.emp.service.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * @author prade on 31-05-2023
 */
public interface EmployeeRepository  extends MongoRepository<Employee, Long> {

}
