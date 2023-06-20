public class LIBRARY {
    public static void main(String[] args) {
        theramayaan rm1 = new theramayaan("ramayan", "valmikki", true);
        System.out.println(rm1);
        rm1.reading();
        javabook rm2 = new javabook("javacore", "Bert Bates", true);
        System.out.println(rm2);
        rm2.reading();
        htmlbook rm3 = new htmlbook("htmlbasic", "meta",false);
        System.out.println(rm3);
        rm3.reading();
        StrengthofMaterials rm4=new StrengthofMaterials( "textbook","rkbansal" ,true);
        System.out.println(rm4);
        rm4.reading();
        mathsbook12th rm5=new mathsbook12th( "metrix","rsagrawal", true);
        System.out.println(rm5);
        rm5.reading();
        HappyPlace rm6=new HappyPlace("bookoflover","emilyhenry",true);
        System.out.println(rm6);
        rm6.reading();
    }
}

interface book {
    public void reading();
}

class theramayaan implements book {
    String title;
    String author;

    boolean isAvailable;


    public theramayaan(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;

        this.isAvailable = isAvailable;
    }

    @Override
    public void reading() {
        System.out.println("book is reading");

    }

    @Override
    public String toString() {
        return "theramayaan{" +
                "title='" + title + '\'' +
                ",author='" + author + '\'' +
                ",isAvailable='" + isAvailable + '\'' +
                '}';

    }
}

class javabook implements book {
    String title;
    String author;

    boolean isAvailable;


    public javabook(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;

        this.isAvailable = isAvailable;
    }

    @Override
    public void reading() {
        System.out.println("book is reading");

    }

    @Override
    public String toString() {
        return "theramayaan{" +
                "title='" + title + '\'' +
                ",author='" + author + '\'' +
                ",isAvailable='" + isAvailable + '\'' +
                '}';

    }
}

class htmlbook implements book {
    String title;
    String author;

    boolean isAvailable;

    public htmlbook(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;

        this.isAvailable = isAvailable;
    }


    @Override
    public void reading() {
        System.out.println("book is reading");

    }

    @Override
    public String toString() {
        return "theramayaan{" +
                "title='" + title + '\'' +
                ",author='" + author + '\'' +
                ",isAvailable='" + isAvailable + '\'' +
                '}';

    }
}
class StrengthofMaterials implements book{
    String title;
    String author;

    boolean isAvailable;

    public StrengthofMaterials(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;

        this.isAvailable = isAvailable;
    }


    @Override
    public void reading() {
        System.out.println("book is reading");

    }

    @Override
    public String toString() {
        return "StrengthofMaterials{" +
                "title='" + title + '\'' +
                ",author='" + author + '\'' +
                ",isAvailable='" + isAvailable + '\'' +
                '}';

    }
}

class mathsbook12th implements book{
    String title;
    String author;

    boolean isAvailable;

    public  mathsbook12th(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;

        this.isAvailable = isAvailable;
    }


    @Override
    public void reading() {
        System.out.println("book is reading");

    }

    @Override
    public String toString() {
        return " mathsbook12th{" +
                "title='" + title + '\'' +
                ",author='" + author + '\'' +
                ",isAvailable='" + isAvailable + '\'' +
                '}';

    }
}
class HappyPlace implements book{
    String title;
    String author;

    boolean isAvailable;

    public  HappyPlace(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;

        this.isAvailable = isAvailable;
    }


    @Override
    public void reading() {
        System.out.println("book is reading");

    }

    @Override
    public String toString() {
        return " HappyPlace{" +
                "title='" + title + '\'' +
                ",author='" + author + '\'' +
                ",isAvailable='" + isAvailable + '\'' +
                '}';

    }
}

}