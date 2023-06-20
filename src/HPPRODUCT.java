

public class HPPRODUCT {
    public static void main(String[] args) {
        laptop hp1 = new laptop(456, 840, 00351, 1, 2307, 12, 1.5000);
        printer hp2 = new printer(567, 678, 4567, 5678, 567, 23456, 5.67);
        ink hp3 = new ink(456.5, 788, 900, 67, 234, 77889, 678);
        wirelessmouse hp4 = new wirelessmouse(345, 5667, 78, 678, 55677, 3455, 456);
        keyboard hp5 = new keyboard(456, 678, 89, 67, 8, 78, 898);
        workbackpack hp6 = new workbackpack(456, 840, 00351, 1, 2307, 12, 1.5000);
        bluetoothspeaker hp7 = new bluetoothspeaker(456, 840, 00351, 1, 2307, 12, 1.5000);
        pendrive hp8 = new pendrive(456.5, 788, 900, 67, 234, 77889, 678);
        chargerlaptop hp9 = new chargerlaptop(456.5, 788, 900, 67, 234, 77889, 678);
        USBhub hp10 = new USBhub(456, 840, 00351, 1, 2307, 12, 1.5000);
        System.out.println(hp10);
        System.out.println(hp2);
        System.out.println(hp1);
        System.out.println(hp3);
        System.out.println(hp4);
        System.out.println(hp6);
        System.out.println(hp7);
        System.out.println(hp8);
        System.out.println(hp9);
        hp3.produt();
        hp1.produt();
        hp2.produt();
        hp4.produt();
        hp5.produt();
        hp6.produt();
        hp7.produt();
        hp8.produt();
        hp9.produt();
        hp10.produt();
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

class printer implements hpproduct1 {
    int model;
    int productid;


    int description;
    double price;
    double manufacturer;

    int quantityinStock;

    double imgeurl;

    public printer(double imgeurl, int productid, int model, int quantityinStock, int description, double price, double manufacturer) {

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
        return "printer{" +

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

class ink implements hpproduct1 {
    int model;
    int productid;


    int description;
    double price;
    double manufacturer;

    int quantityinStock;

    double imgeurl;

    public ink(double imgeurl, int productid, int model, int quantityinStock, int description, double price, double manufacturer) {

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
        return "ink{" +

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

class wirelessmouse implements hpproduct1 {
    int model;
    int productid;


    int description;
    double price;
    double manufacturer;

    int quantityinStock;

    double imgeurl;

    public wirelessmouse(double imgeurl, int productid, int model, int quantityinStock, int description, double price, double manufacturer) {

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
        return "wirelessmouse{" +

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

class keyboard implements hpproduct1 {
    int model;
    int productid;


    int description;
    double price;
    double manufacturer;

    int quantityinStock;

    double imgeurl;

    public keyboard(double imgeurl, int productid, int model, int quantityinStock, int description, double price, double manufacturer) {

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
        return "keyboard{" +

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


class workbackpack implements hpproduct1 {
    int model;
    int productid;


    int description;
    double price;
    double manufacturer;

    int quantityinStock;

    double imgeurl;

    public workbackpack(double imgeurl, int productid, int model, int quantityinStock, int description, double price, double manufacturer) {

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
        return "workbackpack{" +

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

class bluetoothspeaker implements hpproduct1 {
    int model;
    int productid;


    int description;
    double price;
    double manufacturer;

    int quantityinStock;

    double imgeurl;

    public bluetoothspeaker(double imgeurl, int productid, int model, int quantityinStock, int description, double price, double manufacturer) {

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
        return "bluetoothspeaker{" +

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

class pendrive implements hpproduct1 {
    int model;
    int productid;


    int description;
    double price;
    double manufacturer;

    int quantityinStock;

    double imgeurl;

    public pendrive(double imgeurl, int productid, int model, int quantityinStock, int description, double price, double manufacturer) {

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
        return "pendrive{" +

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

class chargerlaptop implements hpproduct1 {
    int productid;

    int model;
    int description;
    double price;
    double manufacturer;

    int quantityinStock;

    double imgeurl;

    public chargerlaptop(double imgeurl, int productid, int model, int quantityinStock, int description, double price, double manufacturer) {

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
        return "chargerlaptop{" +

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

class USBhub implements hpproduct1 {
    int productid;

    int model;
    int description;
    double price;
    double manufacturer;

    int quantityinStock;

    double imgeurl;

    public USBhub(double imgeurl, int productid, int model, int quantityinStock, int description, double price, double manufacturer) {

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
        return "USBhub{" +

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