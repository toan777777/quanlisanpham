package Quanli_sanpham;

import Quanli_sanpham.methol.DrinksManager;
import Quanli_sanpham.methol.ProductManager;
import Quanli_sanpham.model.Drinks;
import Quanli_sanpham.model.Product;

import java.util.Scanner;

public class TEST {
   static Scanner scanner = new Scanner(System.in);
  static DrinksManager drinksManager= new DrinksManager();
  public static   ProductManager productManager = new ProductManager();
    public static void main(String[] args) {

        int choi=-1;
      do  {
            System.out.println("1: add");
            System.out.println(" 2 show");
            System.out.println("3: edit");
          System.out.println("4: edit");
          System.out.println(" 5: hiển thị theo loại");
          System.out.println(" 6: tìm giá min- max");
          System.out.println("7: hiển thị drink theo loại chai đựng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.show();
                    break;
                case 3:

                    productManager.edit();
                    break;
                case 4:
                    drinksManager.edit();
                    break;
                case 5:
                    productManager.showdrinkbyBottetype();
                    break;
                case 6:
                    productManager.timkiemminmax();
                    break;
                case 7:
                    productManager.showdrinkbyBottetype();
                    break;
                default:
                    System.out.println(" thoát");
            }
        }while (choi!=0);
    }
}
