package com.skypro.homework28;

public interface EmployeeInterface {
        Employee add(String firstname, String surname);

        Employee remove(String firstname, String surname);

        Employee find(String firstname, String surname);

        Collection<Employee>  findAll();

}
