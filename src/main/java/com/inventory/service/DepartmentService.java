package com.inventory.service;

import com.inventory.entity.Department;
import java.util.List;

public interface DepartmentService {
    List<Department> getAll();
    Department getById(Long id);
}
