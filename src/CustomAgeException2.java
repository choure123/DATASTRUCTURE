public class CustomAgeException2 {
    public void checkAge1(int i)throws NameNotFoundException  {
        if(i < 18){
            throw new NameNotFoundException("Age is below 18 pasword cannot be sent");
        }
        else{
            System.out.println("Password is sent to your email");
        }
    }

    public static void main(String[] args) {
        CustomAgeException2 c1 = new CustomAgeException2();
        try{
            c1.checkAge1(12);
        }catch(NameNotFoundException e){
            e.printStackTrace();
        }
    }
}

class NameNotFoundException extends Exception{
    public NameNotFoundException(String s){
        super(s);
    }
}

