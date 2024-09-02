package net.javaguides.ems_backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import net.javaguides.ems_backend.dto.EmployeeDto;
import net.javaguides.ems_backend.service.EmployeeService;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    // Build Add Employee REST API
    public ResponseEntity<EmployeeDto> createEmployee(EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee,HttpStatus.CREATED);
    }

}
