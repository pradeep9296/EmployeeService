package org.emp.service.service;

import lombok.AllArgsConstructor;
import org.emp.service.exception.EmployeeCreateException;
import org.emp.service.exception.EmployeeNotFoundException;
import org.emp.service.model.Employee;
import org.emp.service.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.emp.service.model.RESPONSE.CANNOT_CREATE_EMPLOYEE;
import static org.emp.service.model.RESPONSE.EMPLOYEE_NOT_FOUND;

/**
 * @author prade on 31-05-2023
 */
@Service
@AllArgsConstructor
public class EmployeeService {
    private EmployeeRepository repository;

    SequenceGeneratorService sequenceGeneratorService;

    public Employee createEmployee(Employee employee){
        employee.setId(sequenceGeneratorService.generateSequence(Employee.SEQUENCE_NAME));
        return Optional.ofNullable(repository.save(employee))
                .orElseThrow(() -> new EmployeeCreateException(CANNOT_CREATE_EMPLOYEE.getValue(), CANNOT_CREATE_EMPLOYEE.getMessage() + employee.getName()));
    }

    public Employee getEmployeeById(long id){
        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(EMPLOYEE_NOT_FOUND.getValue(), EMPLOYEE_NOT_FOUND.getMessage()));
    }
}
