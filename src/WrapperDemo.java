public class WrapperDemo {
    public static void main(String[] args) {
    int i = 10;
    float f = 10.0f;
    double d = 10.0;
    long l = 10000000;
    short s = 12;
    boolean b = true;
    char c  = 'a';
    byte by = 10;

    //boxing : The procees of converting the raw data to its respective object
    Integer intObj = i;
    Float floatObj = f;
    Double doubleObj = d;
    Long longObj = l;
    Short shortObj = s;
    Boolean booleanObj = b;
    Character charObj = c;
    Byte byteObj = by;



    System.out.println(intObj);
    System.out.println(floatObj);
    System.out.println(doubleObj);
    System.out.println(longObj);
    System.out.println(shortObj);
    System.out.println(booleanObj);
    System.out.println(charObj);
    System.out.println(byteObj);

    //unboxing : Converting object data to raw data
    int iv = intObj;
    float fv = floatObj;
    double dv = doubleObj;
    long lv = longObj;
    short sv = shortObj;
    boolean bv = booleanObj;
    char cv = charObj;
    byte byv = byteObj;

    System.out.println(iv);
    System.out.println(fv);
    System.out.println(dv);
    System.out.println(lv);
    System.out.println(sv);
    System.out.println(bv);
    System.out.println(cv);
    System.out.println(byv);

}
}


