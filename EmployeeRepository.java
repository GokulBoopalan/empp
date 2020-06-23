package com.Employee.EmployeeDatabase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
