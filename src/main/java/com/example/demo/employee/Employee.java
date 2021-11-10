package com.example.demo.employee;

import javax.persistence.*;

@Entity
@Table
public class Employee {
    @Id
    @SequenceGenerator(
            name="employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private Long departmentId;
    private String department;
    @Transient
    private Integer age;
    public Employee(){
    }
    public Employee(Long id, String name, String email, Long departmentId, String department, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.departmentId = departmentId;
        this.department = department;
        this.age = age;
    }

    public Employee(String name, String email, Long departmentId, String department, Integer age) {
        this.name = name;
        this.email = email;
        this.departmentId = departmentId;
        this.department = department;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", departmentId=" + departmentId +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}
