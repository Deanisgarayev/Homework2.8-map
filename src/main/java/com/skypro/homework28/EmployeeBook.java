package com.skypro.homework28;

import java.util.Objects;

public class EmployeeBook {

        private String firstname;

        private String surname;


        public EmployeeBook(String firstname, String surname) {
            this.firstname = firstname;
            this.surname = surname;
        }

        public String getFirstname() {
            return this.firstname;
        }
        public String getSurname() {
            return this.surname;
        }
        public String getFullName(){
            return firstname + " " + surname;
        }


        @Override
        public String toString() {
            return firstname + " Имя " + surname + "фамилия";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EmployeeBook employee = (EmployeeBook) o;
            return firstname.equals(employee.firstname) && surname.equals(employee.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstname, surname);
        }

    }


