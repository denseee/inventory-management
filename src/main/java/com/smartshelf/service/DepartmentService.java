package com.smartshelf.service;

import java.util.List;

import com.smartshelf.entity.Department;

public interface DepartmentService {
    List<Department> getAll();
    Department getById(Long id);
}
