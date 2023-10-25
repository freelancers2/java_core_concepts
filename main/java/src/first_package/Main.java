package first_package;

public class Main {

  public static void main(String[] args) {
    // DataType variable_name = value ( constructor ) ;
    Calc m = new Calc();
   // String phrase = "Hello Omar";
   // String phrase1 = new String();
     // m.x = 5; x has private access modifier
    m.setX(12);
    int y = m.add(8, 9);
    System.out.println(m.getX());
    System.out.println("8 + 9 = " + y);


  }
}
