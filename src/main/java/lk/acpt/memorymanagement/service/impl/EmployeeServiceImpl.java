package lk.acpt.memorymanagement.service.impl;

import lk.acpt.memorymanagement.Entity.Employee;
import lk.acpt.memorymanagement.db.Database;
import lk.acpt.memorymanagement.dto.EmployeeDto;
import lk.acpt.memorymanagement.service.EmployeeService;

import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public boolean saveEmployee(EmployeeDto employeeDto) {
        Database.employees.add(new Employee(employeeDto.getId_num(),employeeDto.getName(),employeeDto.getAddress(),employeeDto.getPosition()));
        return true;
    }

    @Override
    public boolean updateEmployee(EmployeeDto employeeDto) {
        for (int i=0; i< Database.employees.size(); i++){
            if (Database.employees.get(i).getId_num() == employeeDto.getId_num()){
                Database.employees.get(i).setName(employeeDto.getName());
                Database.employees.get(i).setAddress(employeeDto.getAddress());
                Database.employees.get(i).setPosition(employeeDto.getPosition());

                return true;
            }
        }
        return false;

    }

    @Override
    public boolean deleteEmployee(int id) {
        for (int i=0; i < Database.employees.size(); i++){
            if (Database.employees.get(i).getId_num() == id){
                Database.employees.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<EmployeeDto> getAllEmployee() {
        ArrayList<EmployeeDto> all_employees = new ArrayList<>();
        for (int i=0; i < Database.employees.size(); i++){
            all_employees.add(new EmployeeDto(Database.employees.get(i).getId_num(),Database.employees.get(i).getName(), Database.employees.get(i).getAddress(),Database.employees.get(i).getPosition()));
        }
        return all_employees;
    }


}
//fixing bugs
