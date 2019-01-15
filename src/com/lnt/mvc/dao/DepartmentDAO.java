package com.lnt.mvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lnt.mvc.model.Department;



public interface DepartmentDAO {


    public void createDepartment(Department department);

    public void updateDepartment(Department department);

    public void deleteDepartment(int id);

    public List<Department> getAllDepartments();
    
    public Department getDeptById(int id);

}
