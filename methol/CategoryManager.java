package Quanli_sanpham.methol;

import Quanli_sanpham.model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoryManager {
    List<Category> listCatergory = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    int id = 0;

    public CategoryManager() {
//        this.listCatergory = listCatergory;
        listCatergory.add(new Category(1, "kẹo candy"));
        listCatergory.add(new Category(2, "nước cam"));
    }

    public Category creatCategory() {
        id++;
        System.out.println(" enter name Category");
        String name = scanner.nextLine();
        Category category = new Category(id, name);
        return category;
    }

    public void showCatergory() {
        for (int i = 0; i < listCatergory.size(); i++) {
            System.out.println(listCatergory.get(i));
        }
    }

    public void addCatergory() {
        Category category = creatCategory();
        listCatergory.add(category);
    }

    public int findID(int id) {
        for (int i = 0; i < listCatergory.size(); i++) {
            if (listCatergory.get(i).getId() == id) {
                return 1;
            }
        }
        return -1;
    }

    public void edit() {
        System.out.println(" enter id want edit");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listCatergory.size(); i++) {
            if (listCatergory.get(i).getId() == id) {
                listCatergory.get(i).setName(scanner.nextLine());
            }
        }


    }

    public void deleteCatergory() {
        System.out.println(" enter id want delete");
        int id = Integer.parseInt(scanner.nextLine());
        if (id > 0 || id > listCatergory.size()) {
            System.out.println("không tìm thấy");
        } else {
            listCatergory.remove(id);
        }
    }
}
