package p2;

import first_package.Calc;

public class Main {

  public static void main(String[] args) {
    Calc c = new Calc();
    c.setX(10);
   // System.out.println(c.getX()); has protected access modifier
  }
}
