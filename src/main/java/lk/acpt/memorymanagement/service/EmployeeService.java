package lk.acpt.memorymanagement.service;

import lk.acpt.memorymanagement.dto.EmployeeDto;

import java.util.ArrayList;

public interface EmployeeService {
    boolean saveEmployee(EmployeeDto employeeDto);
    boolean updateEmployee(EmployeeDto employeeDto);
    boolean deleteEmployee(int id);
    ArrayList<EmployeeDto> getAllEmployee();
}
