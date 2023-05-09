package PhamVanThanh.example.PhamVanThanh_Tuan02_BT3.service;

import PhamVanThanh.example.PhamVanThanh_Tuan02_BT3.model.Employee;

import java.util.List;



public interface EmployeeService {
    List <Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}