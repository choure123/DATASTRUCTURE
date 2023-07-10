import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ForEachDemo {


    public static void main(String[] args) {
        Items i1 = new Items("Shirt", "1500", "zara");
        Items i2 = new Items("Watch", "3000", "Fasttrack");
        Items i3 = new Items("Shoes", "3500", "H&M");
        Items i4 = new Items("Iphone", "150000", "Apple");
        Items i5 = new Items("1dr", "3000", "Puma");
        Items i6 = new Items("Literide", "1899", "Puma");
        Items i7 = new Items("Coffee", "450", "NesCafe");
        Items i8 = new Items("Pavallion", "50000", "HP");
        Items i9 = new Items("Cloudfoam", "2500", "Adidas");
        Items i10 = new Items("earphone", "4000", "realme");

        HashMap<String, Items> list1 = new HashMap<>();
        list1.put(i1.productName, i1);
        list1.put(i2.productName, i2);
        list1.put(i3.productName, i3);
        list1.put(i4.productName, i4);
        list1.put(i5.productName, i5);
        list1.put(i6.productName, i6);
        list1.put(i7.productName, i7);
        list1.put(i8.productName, i8);
        list1.put(i9.productName, i9);
        list1.put(i10.productName, i10);

        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        int counter = 0;
        //We convert our map into a set and we take a set element as reference
        for (Map.Entry<String, Items> i : list1.entrySet()) {
            if (i.getValue().brand.equalsIgnoreCase(value)) {
                System.out.println(i.getValue());
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Number of element found = " + counter);
        }
    }
}

class Items {
    String productName;
    String productPrice;
    String brand;

    public Items(String productName, String productPrice, String brand) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Items{" +
                "productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
