package com.skypro.homework28;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
@Service
public class EmployeeInterfaceImpl implements EmployeeInterface {
    private final List<EmployeeBook> employeeBookList;

    public EmployeeInterfaceImpl() {
        this.employeeBookList = new ArrayList<>();
    }

    @Override

    public EmployeeBook add(String firstname, String surname) {
        EmployeeBook employeeBook = new EmployeeBook(firstname, surname);
        if (employeeBookList.contains(employeeBook)) {
            throw new EmployeeAlreadyAddedException();
        }
        employeeBookList.add(employeeBook);
        return employeeBook;
    }

    @Override
    public EmployeeBook remove(String firstname, String surname) {
        EmployeeBook employeeBook = new EmployeeBook(firstname, surname);
        if (employeeBookList.contains(employeeBook)) {
            employeeBookList.remove(employeeBook);
            return employeeBook;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public EmployeeBook find(String firstname, String surname) {
        EmployeeBook employeeBook = new EmployeeBook(firstname, surname);
        if (employeeBookList.contains(employeeBook)) {
            return employeeBook;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<EmployeeBook> findAll() {
        return Collections.unmodifiableList(employeeBookList);
    }

}
