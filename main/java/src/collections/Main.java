package collections;

public class Main {

  public static void main(String[] args) {
    // 1D Arrays :
    String[] fruits = {"banana", "oranges", "apples"};
    int[] numbers = new int[] {1, 2, 3, 4, 5, 6};

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Array element  is " + numbers[i]);
      System.out.println("Iteration number " + i);

    }

    for (String fruit : fruits){
      System.out.println(fruit);
    }


    // 2D Arrays

    int[][] digits = { {10,15,20 }, {50,75,100 },{85,65,45 } };

    for (int i = 0; i < digits.length; i++) {
      System.out.println("Row number "+i);
      for (int j = 0; j < digits[i].length; j++) {
        System.out.println(digits[i][j]);
      }

    }


    for(int[] innerArray : digits){
      for (int x : innerArray ){
        System.out.println(x);
      }
    }

    }

  }

