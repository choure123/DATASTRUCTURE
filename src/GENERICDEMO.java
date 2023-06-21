public class GENERICDEMO {
    public static void main(String[] args) {
        GenericStudent<String , String , Integer , Integer> s1 = new GenericStudent<String , String , Integer , Integer>("Arpit", "Sahu",  001, 211111111);
        System.out.println(s1.getFirstname());
    }
}
class GenericStudent<FirstName ,LastName ,RollNo, PhoneNumber>{
    private final FirstName f;
    private final LastName l;
    private final RollNo r;
    private final PhoneNumber p;
    GenericStudent(FirstName f , LastName l , RollNo r , PhoneNumber p){
        this.f = f;
        this.l = l;
        this.r = r;
        this.p = p;
    }

    public FirstName getFirstname() {
        return f;
    }

    public LastName getLastname() {
        return l;
    }

    public PhoneNumber getPHoneNumber() {
        return p;
    }

    public RollNo getRollno() {
        return r;
    }
}
//We generally don't use generic classes


