package first_package;

public class Calc {

  private int x;
  private int y;

  protected int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public   int add(int x, int y){
    return x+y;
  }
    }
