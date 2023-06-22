public class TYPECASTING {
    //upcasting
    public static void main(String[] args) {
        int i=50;
        double d=(double) i;
        //explicit upcasting//
        System.out.println(d);
        Integer i2=(int) d;
        // explicit convertion of uper value to lower value
        System.out.println(i2);
        // int i3 = d.intValue() ;
        //        Integer i2 =d.intValue();
    }
}
class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog is barking.");
    }

    public void fetch() {
        System.out.println("Dog is fetching.");
    }
}

class upcasting {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Creating a Dog object

        // Upcasting the Dog object to an Animal reference
        Animal animal = dog;

        animal.makeSound(); // Calls the makeSound() method from Dog class
        // Output: Dog is barking.

        // animal.fetch(); // This will give a compilation error
        // Because the Animal reference doesn't have access to the fetch() method
    }
}

class Animal1 {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Dog1 extends Animal {
    public void makeSound() {
        System.out.println("Dog is barking.");
    }

    public void fetch() {
        System.out.println("Dog is fetching.");
    }
}

class downcasting{
    public static void main(String[] args) {
        Animal animal = new Dog(); // Creating a Dog object and upcasting to Animal

        animal.makeSound(); // Calls the makeSound() method from Dog class
        // Output: Dog is barking.

        // Downcasting the Animal object back to Dog
        Dog dog = (Dog) animal;

        dog.makeSound(); // Calls the makeSound() method from Dog class
        // Output: Dog is barking.

        dog.fetch(); // Accessing the fetch() method specific to Dog class
        // Output: Dog is fetching.

        // Attempting to downcast an Animal object to Cat (which is not valid)
        // Cat cat = (Cat) animal; // This will throw a ClassCastException at runtime
    }
}

