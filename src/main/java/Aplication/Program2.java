package Aplication;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Test 1: seller findbyID ===");
        Department dep = departmentDao.findById(3);


        System.out.println(dep);

    }
}
