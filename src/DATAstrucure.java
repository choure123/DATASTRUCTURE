import java.util.ArrayList;
import java.util.List;

public class DATAstrucure {

    public static void main(String[] args) {
        Actors a1 = new Actors("Shahrukh Khan", "Pathan", "Fan", "mumbai", 50, 97);
        Actors a2 = new Actors("Akshay Kumar", "Gabbar", "Many", "Canada", 100, 120);
        //hash value of the address
        List<Actors> l1 = new ArrayList<Actors>();
        // in list l1 what type of object will be stored? actors type we have to create actor objects
        l1.add(a1);
        l1.add(a2);
        System.out.println(l1);


    }
}

class Actors {
    String name;
    String popularMovie;
    String flopMovie;
    String location;
    int movies;
    int age;

    Actors(String n, String p, String f, String l, int m, int a) {
        this.name = n;
        this.popularMovie = p;
        this.flopMovie = f;
        this.location = l;
        this.movies = m;
        this.age = a;
    }

    @Override
    public String toString() {
        return "Actors{" +
                "name='" + name + '\'' +
                ", popularMovie='" + popularMovie + '\'' +
                ", flopMovie='" + flopMovie + '\'' +
                ", location='" + location + '\'' +
                ", movies=" + movies +
                ", age=" + age +
                '}';
    }
}
//Data structure is a way to store and organize data

/*public class StudentGenericDemo {
    public static void main(String[] args) {
        GenericStudent<String , String , Integer , Integer> s1 = new GenericStudent<String , String , Integer , Integer>("Arpit", "Sahu",  001, 211111111);
        System.out.println(s1.getFirstname());
        GenericStudent<String , String , Integer , Integer> s1 = new GenericStudent<>("Arpit", "Sahu", 1, 211111111);
        System.out.println(s1);
    }
}
class GenericStudent<FirstName ,LastName ,RollNo, PhoneNumber>{
@@ -31,5 +31,12 @@ public PhoneNumber getPHoneNumber() {
    public RollNo getRollno() {
        return r;
    }

    @Override
    public String toString() {
        return "Name: "+ f + ", title: " + l + ", RollNo:  " + r + ", Phone Number: " + p  ;
    }
    }
 */

