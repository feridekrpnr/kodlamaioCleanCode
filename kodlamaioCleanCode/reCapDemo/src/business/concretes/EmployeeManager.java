package business.concretes;

import business.abstracts.IEmployeeService;
import dataAccess.abstracts.IEmployeeDal;
import entities.concretes.Employee;

import java.util.List;

public class EmployeeManager implements IEmployeeService {

    IEmployeeDal iEmployeeDal;

    public EmployeeManager(IEmployeeDal iEmployeeDal2) {
        this.iEmployeeDal = iEmployeeDal;
    }

    @Override
    public List<Employee> getAll() {
        return iEmployeeDal.getAll();
    }
}
