package com.skypro.homework28;

import java.util.Collection;

public interface EmployeeInterface {
        EmployeeBook add(String firstname, String surname);

        EmployeeBook remove(String firstname, String surname);

        EmployeeBook find(String firstname, String surname);

        Collection<EmployeeBook> findAll();

}
