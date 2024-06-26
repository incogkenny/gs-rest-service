package com.example.restservice;

public class Employee {
    private int employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String title;

    /**
     * Parameterized Constructor to assign the values to the properties of the entity
     */
    public Employee(int employee_id, String first_name, String last_name, String email, String title) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.title = title;
    }

    @Override
    public String toString() {

        return "Employee [id="
                + employee_id + ", firstName="
                + first_name + ", lastName="
                + last_name + ", email="
                + email + "]";


    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
