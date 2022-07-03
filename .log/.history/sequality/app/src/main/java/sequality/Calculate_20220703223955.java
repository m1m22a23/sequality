package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(int x, int y) {
    return this.sum(x, y) / 2.0;
  }

  public int to_sum(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum = this.sum(sum, i);
    }
    return sum;
  }

  public double to_ave(int x, int y) {
    double num = y - x + 1;
    return this.to_sum(x, y) / num;
  }

  public boolean odd(int x) {
    if (x % 2 == 1) {
      return true;
    } else {
      return false;
    }
  }

  public int odd_sum(int x)
}
