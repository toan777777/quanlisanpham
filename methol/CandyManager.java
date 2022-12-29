package Quanli_sanpham.methol;

import Quanli_sanpham.model.Candy;
import Quanli_sanpham.model.Category;

import java.util.Scanner;

public class CandyManager {

    Scanner scanner = new Scanner(System.in);

    public Candy creat(ProductManager productManager) {
        System.out.println(" id candy");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nameProduct");
        String name = scanner.nextLine();
        System.out.println(" priceProduct");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println(" số lượng quantity");
        int quantity = scanner.nextInt();
        Category category = productManager.creatCategor();

        System.out.println("nhập weight");
        scanner.nextLine();
        int weight= Integer.parseInt(scanner.nextLine());
        Candy candy= new Candy(id,name,price,quantity,category,weight);
        return candy;
    }
}
