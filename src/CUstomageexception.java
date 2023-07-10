public class CUstomageexception {
    public void checkAge(int i) throws InvalidAgeException {
        if (i <= 13 ){
            throw new InvalidAgeException("Age is below 13");
        }else{
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        CUstomageexception c = new CUstomageexception();
        try{
            c.checkAge(12);
        }catch (InvalidAgeException e){
            e.printStackTrace();
        }
        System.out.println("Thank You");
    }
}
    //custom exception must extend to a exception class and we must use a constructor to initialize
    class InvalidAgeException extends Exception{
        public InvalidAgeException (String s){
            super(s);
        }
    }
