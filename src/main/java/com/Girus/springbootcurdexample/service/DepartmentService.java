package com.Girus.springbootcurdexample.service;


import com.Girus.springbootcurdexample.entity.Department;

import java.util.List;

public interface DepartmentService {

        //method
        //interface no implementation
        public Department saveDepartment(Department department);



    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);


    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);
}

