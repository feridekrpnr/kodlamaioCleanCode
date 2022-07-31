package business.abstracts;

import entities.concretes.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAll();
}
