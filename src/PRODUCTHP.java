import java.util.ArrayList;

public class PRODUCTHP {
    public static void main(String[] args) {
        laptop1 hp=new laptop1(840,"black",5678,14000,"i5window");
        printerh hpo=new printerh( 985,"blue",5670,35000,"p5i");

        ArrayList<laptop1>l1=new ArrayList<>();
        ArrayList<printerh>l2=new ArrayList<>();
        l1.add(hp);
        l2.add(hpo);
        System.out.println(l1);
        System.out.println(l2);


    }
}
interface hpproduct {
    public void produt();
}
class laptop1 implements hpproduct {
    int model_number;
    String colour;
    int productid;
    double price;
    String description;

    public laptop1(int mn, String c, int pid, double p, String d) {
        this.colour = c;
        this.description = d;
        this.price = p;
        this.model_number = mn;
        this.productid = pid;

    }

    @Override
    public void produt() {
        System.out.println("hp product");

    }

    @Override
    public String toString() {
        return "laptop1{" +
                ",colour='" + colour + '\'' +
                ", description='" + description + '\'' +
                ",price= '" + price + '\'' +
                ",productid='" + productid + '\'' +
                '}';


    }
}
class printerh implements hpproduct{
    int model_number;
    String colour;
    int productid;
    double price;
    String description;

    public printerh(int mn, String c, int pid, double p, String d) {
        this.colour = c;
        this.description = d;
        this.price = p;
        this.model_number = mn;
        this.productid = pid;

    }

    @Override
    public void produt() {
        System.out.println("hp product");

    }

    @Override
    public String toString() {
        return "printerh{" +
                ",colour='" + colour + '\'' +
                ", description='" + description + '\'' +
                ",price= '" + price + '\'' +
                ",productid='" + productid + '\'' +
                '}';


    }
}

