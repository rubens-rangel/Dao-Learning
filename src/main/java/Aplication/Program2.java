package Aplication;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;


import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

      //  List<Seller> list = departmentDao.findByDepartment(department);

        System.out.println("=== Test 1: seller findbyID ===");
        Department dep = departmentDao.findById(3);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: seller findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj: list) {
            System.out.println(obj);
        }
    }
}
