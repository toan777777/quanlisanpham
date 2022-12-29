package Quanli_sanpham.methol;

import Quanli_sanpham.model.Category;
import Quanli_sanpham.model.Drinks;

import java.util.Scanner;

public class DrinksManager extends ProductManager{
    ProductManager productManager= new ProductManager();
    Scanner scanner= new Scanner(System.in);
    public Drinks creatDrinks(){
        System.out.println(" id producct");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nameProduct");
        String name = scanner.nextLine();
        System.out.println(" priceProduct");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println(" số lượng quantity");
        int quantity = scanner.nextInt();
//        CategoryManager categoryManager = null;
        Category category = productManager.creatCategor();
        System.out.println(" enter volume");
        scanner.nextLine();
        int volumemm= Integer.parseInt(scanner.nextLine());
        System.out.println(" enter botterType");
        String botter=scanner.nextLine();

        Drinks dinks= new Drinks(id,name,price,quantity,category,volumemm,botter);
        return dinks;
    }

}
