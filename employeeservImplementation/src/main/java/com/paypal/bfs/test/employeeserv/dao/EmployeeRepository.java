package com.paypal.bfs.test.employeeserv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paypal.bfs.test.employeeserv.entity.EmployeeTable;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeTable,Integer> {
}
