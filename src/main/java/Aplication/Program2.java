package Aplication;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        //  List<Seller> list = departmentDao.findByDepartment(department);

        System.out.println("=== Test 1: department findbyID ===");
        Department dep = departmentDao.findById(3);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }
        System.out.println("\n=== TEST 3: department insert =====");
        Department novodep = new Department(null, "Roupas");
        departmentDao.insert(novodep);
        System.out.println("Inserted! New id = " + novodep.getId());

        System.out.println("\n=== TEST 4: department update =====");
        dep = departmentDao.findById(6);
        dep.setName("Papelaria");
        departmentDao.update(dep);
        System.out.println("Update complete");
    }
}