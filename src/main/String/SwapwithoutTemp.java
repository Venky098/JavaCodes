//swap two numbers without temp
class Main {
    public static void main(String[] args) {
      String a = "Hellos";
    String b = "World";
        
        
        a= a+b;
        
     
        b= a.substring(0,a.length()-b.length());
        
          // System.out.println(a.length()-b.length());
           
           a = a.substring(b.length());
           
           System.out.println( " a is "+a);
           System.out.println(" b is "+b);
       
    }
}
