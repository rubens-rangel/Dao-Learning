package Aplication;

import Entities.Department;
import Entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        System.out.println(obj);

        Seller seller = new Seller(21, "bob", "boob@email.com", new Date(), 3000.0, obj);
        System.out.println(seller);
    }
}
