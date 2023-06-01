package org.emp.service.controller;

import lombok.AllArgsConstructor;
import org.emp.service.model.Employee;
import org.emp.service.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

/**
 * @author prade on 31-05-2023
 */
@RequestMapping("/employeeService/")
@RestController
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping("createEmployee")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("getById")
    public Employee getEmployeeById(long id){
        return employeeService.getEmployeeById(id);
    }
}
