2.public class Hello{  
    public static void main(String args[]){  
     System.out.println("Hello World");  
    }  
}

3.public class Datatypes {
    public static void main(String args[]) {
      int a=10;
      float b=25.67867f;
      double c=893;
      char d='T';
      String e="Java" ;

      System.out.println("int is "+a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
    }
}

4.public class SizeOfDataTypes {

    public static void main(String[] args) {


        System.out.println("Character " + Character.BYTES+" Bytes");
        System.out.println("Byte " + Byte.BYTES+" Bytes");
        System.out.println("Integer " + Integer.BYTES+" Bytes");
        System.out.println("Long " + Long.BYTES+" Bytes");
        System.out.println("Short " + Short.BYTES+" Bytes");
        System.out.println("Double " + Double.BYTES+" Bytes");
        System.out.println("Float " + Float.BYTES+" Bytes");
    }
}

5.public class Java {
public static void main(String[] args) {
    System.out.println("\nJava Version: "+System.getProperty("java.version"));
    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
    System.out.println("Java Home: "+System.getProperty("java.home"));
    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
 }
}