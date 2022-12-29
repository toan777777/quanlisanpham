package Quanli_sanpham.methol;

import Quanli_sanpham.model.Candy;
import Quanli_sanpham.model.Category;
import Quanli_sanpham.model.Drinks;
import Quanli_sanpham.model.Product;

import java.util.*;

import static Quanli_sanpham.TEST.productManager;

public class ProductManager {
    //    Product p=new Drinks();
    Scanner scanner = new Scanner(System.in);
    CategoryManager categoryManager = new CategoryManager();
    List<Product> listProduct = new ArrayList<>();


    public ProductManager() {
        listProduct.add(new Product(1, "bim bim", 3, 4, categoryManager.listCatergory.get(0)));
        listProduct.add(new Product(2, "sfs", 2, 4, categoryManager.listCatergory.get(1)));
    }

    public void creattt() {
        System.out.println(" 1: add product");
        System.out.println(" 2: add drinks");
        System.out.println(" 3: add candy");
        int choi = Integer.parseInt(scanner.nextLine());
        switch (choi) {
            case 1:
                Product p = creaProduct();
                listProduct.add(p);
                break;
            case 2:
                DrinksManager drinksManager = new DrinksManager();
                Drinks d = drinksManager.creatDrinks();
                listProduct.add(d);
                break;
            case 3:
                CandyManager candyManager = new CandyManager();
                Candy c = candyManager.creat(productManager);
                listProduct.add(c);
                break;

        }

    }

    public Product creaProduct() {
        System.out.println(" id producct");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nameProduct");
        String name = scanner.nextLine();
        System.out.println(" priceProduct");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println(" số lượng quantity");
        int quantity = Integer.parseInt(scanner.nextLine());
        Category category = creatCategor();
        Product product = new Product(id, name, price, quantity, category);
//        listProduct.add(product);
        return product;


    }

    public void add() {
        creattt();
//        listProduct.add(product);
    }

    public void show() {
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(listProduct.get(i));
        }
    }

    public void edit() {
        System.out.println(" nhập id muốn sửa");
//        scanner.nextLine();
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                listProduct.get(i).setId(Integer.parseInt(scanner.nextLine()));
            } else {
                System.out.println(" không tồn tại");
            }

        }
    }

    public Category creatCategor() {
        System.out.println(" nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        Category category = null;
        for (int i = 0; i < categoryManager.listCatergory.size(); i++) {
            if (categoryManager.listCatergory.get(i).getId() == id) {
                category = categoryManager.listCatergory.get(i);
                check = true;

            }
        }
        if (!check) {
            category = categoryManager.creatCategory();
        }
        return category;

    }

    // max giá và min giá
    public void maxprice() {
        double max = listProduct.get(0).getPrice();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getPrice() > max) {
                max = listProduct.get(i).getPrice();
            }
            System.out.println(max);
        }
    }
    public void showdrinkbyBottetype() {

//        for (int i = 0; i < listProduct.size(); i++) {
//            if( listProduct.get(i).getb)
//        }
//        boolean check= false;


        for (Product product : listProduct) {
            if (product instanceof Drinks) {
//               check=true;
                System.out.println(product);
            }
        }
    }

    //    tìm kiếm theo  khoảng giá( làm lại hoàn chỉnh)
    public void seachBYprice(double maxprice, double minprice) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (minprice < listProduct.get(i).getPrice() && maxprice > listProduct.get(i).getPrice()) {
                System.out.println(listProduct.get(i));
            } else {
                System.out.println(" không có");
            }
        }
    }

    public void timkiemminmax() {
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });

        System.out.println(listProduct.get(0));
//        System.out.println(listProduct.get(listProduct.size()-1));
        System.out.println("Sản phẩm có giá thấp nhất: ");
        for (Product p : listProduct) {
            if (p.getPrice() == listProduct.get(0).getPrice())
                System.out.println(p);
        }
        System.out.println("Các sản phẩm có giá cao nhất: ");
        for (Product p : listProduct) {
            if (p.getPrice() == listProduct.get(listProduct.size() - 1).getPrice())
                System.out.println(p);
        }
    }
    public void showDrinkBybottetype(){
        System.out.println(" nhập loại chai cần tìm");
        String bottetye= scanner.nextLine();
        for (int i = 0; i < listProduct.size(); i++) {
            if( listProduct.get(i) instanceof Drinks){
                if(((Drinks) listProduct.get(i)).getBottleType().equalsIgnoreCase(bottetye)){
                    System.out.println(bottetye);
                }
            }
        }
    }


}
