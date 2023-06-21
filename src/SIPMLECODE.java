import java.util.*;


public class SIPMLECODE {
    public static void main(String[] args) {
        Date startDate = new Date();
        Date endDate = new Date(System.currentTimeMillis() + 86400000); // Adding one day to the start date
        Reservation reservation = new Reservation("R001", startDate, endDate, 2);

        System.out.println("Reservation ID: " + reservation.getReservationId());
        System.out.println("Start Date: " + reservation.getStartDate());
        System.out.println("End Date: " + reservation.getEndDate());
        System.out.println("Number of Guests: " + reservation.getNumberOfGuests());
        System.out.println("Reservation Confirmed? " + reservation.isConfirmed());

        reservation.confirmReservation();

        System.out.println("Reservation Confirmed? " + reservation.isConfirmed());

        reservation.cancelReservation();

        System.out.println("Reservation Confirmed? " + reservation.isConfirmed());
    }
}
class Reservation {
     String reservationId;
     Date startDate;
     Date endDate;
     int numberOfGuests;
     boolean isConfirmed;

    public Reservation(String reservationId, Date startDate, Date endDate, int numberOfGuests) {
        this.reservationId = reservationId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfGuests = numberOfGuests;
        this.isConfirmed = false;
    }

    public String getReservationId() {
        return reservationId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void confirmReservation() {
        isConfirmed = true;
        System.out.println("Reservation confirmed.");
    }

    public void cancelReservation() {
        isConfirmed = false;
        System.out.println("Reservation cancelled.");
    }

    // Additional methods and behaviors
}
class DataStructureExample {
    public static void main(String[] args) {
        // ArrayList Example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList Example
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("LinkedList: " + linkedList);

        // HashMap Example
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("bhaiyu", 25);
        hashMap.put("bittu", 30);
        hashMap.put("bhavesh", 35);
        System.out.println("HashMap: " + hashMap);

        // PriorityQueue Example
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(50);
        priorityQueue.add(30);
        priorityQueue.add(70);
        System.out.println("PriorityQueue: " + priorityQueue);
    }
}


class college {
    public static void main(String[] args) {
        student s1 = new student("sonuchoure", 2345, "mechanical", 21);
        student s2=new student("anuj",567,"IT",23);
        faculty f1=new faculty(32,"mechanical","blackwhite",345,"manojtiwarisir");
        List<faculty> l4=new ArrayList<faculty>();
        List<student> l1 = new ArrayList<student>();
        List<student> l2 = new ArrayList<student>();
        l2.add(s2);
        l1.add(s1);
        l4.add (f1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l4);
    }


}

class student {
    String name;
    double id;
    String Department;
    int age;

    student(String n, double id, String d, int a) {
        this.name = n;
        this.Department = d;
        this.id = id;
        this.age = a;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ",Department='" + Department + '\'' +
                ",id=" + id + '\'' +
                ",age=" + age + '\'' +
                '}';
    }
}
class faculty {
    int age;
    String name;
    String DEPARTMENT;
    String dresscolour;
    double officeroomnumber;

    faculty(int a, String d, String dc, double orn, String name) {

        this.age = a;
        this.name = name;
        this.DEPARTMENT = d;
        this.dresscolour = dc;
        this.officeroomnumber = orn;


    }

    @Override
    public String toString() {
        return "faculty{" +
                "name='" + name + '\'' +
                ",age='" + age + '\'' +
                ",DEPARTMENT='" + DEPARTMENT + '\'' +
                ", dresscolour='" + dresscolour + '\'' +
                ",officeroomnumber='" + officeroomnumber + '\'' +
                '}';
    }
}
