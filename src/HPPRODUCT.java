import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HPPRODUCT {
    public static void main(String[] args) {
        laptop hp1 = new laptop(456, 840, 00351, 1, 2307, 12, 1.5000);

        System.out.println(hp1);
        hp1.produt();
    }
}

interface hpproduct1 {
    public void produt();

}

class laptop implements hpproduct1 {
    int model;
    int productid;


    int description;
    double price;
    double manufacturer;

    int quantityinStock;

    double imgeurl;

    public laptop(double imgeurl, int productid, int model, int quantityinStock, int description, double price, double manufacturer) {

        this.imgeurl = imgeurl;
        this.description = description;
        this.price = price;
        this.manufacturer = manufacturer;
        this.model = model;
        this.quantityinStock = quantityinStock;


        this.productid = productid;

    }

    @Override
    public void produt() {
        System.out.println("hp product");

    }

    @Override
    public String toString() {
        return "laptop{" +

                " , imgeurl= ' " + imgeurl + '\'' +
                ", descripyion= ' " + description + '\'' +
                ", price = ' " + price + '\'' +
                " , manufacturer = ' " + manufacturer + '\'' +
                " , model=' " + model + '\'' +
                ", quantityinstock=' " + quantityinStock + '\'' +


                "' productid='" + productid + '\'' +
                '}';


    }
}
