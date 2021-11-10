# SpringBoot_Demo

Spring boot project, with dependencies of Spring Web, Spring Data JPA and PostgreSQL Driver
Connect to PostgreSQL database, with table employee
java.com.example.demom.employee.Employee
  declare Employee class and create table in database using @Entity
java.com.example.demom.employee.EmployeeRepository
  translate into SQL statements using @Query
java.com.example.demom.employee.EmployeeController
  create CRUB functions: create employee, read all employees, update employee by id, name and email, delete employee by id
java.com.example.demom.employee.EmployeeService
  implementation of CRUB functions
