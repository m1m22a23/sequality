/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    Calculate calculate = new Calculate();
    System.out.println(new App().getGreeting());

    // 2と3の和と平均
    int sum1 = calculate.sum(2, 3);
    double ave1 = calculate.ave(2, 3);
    System.out.println("Sum of 2 and 3 is " + sum1 + ". " + "Average is " + String.format("%.1f", ave1) + ".");

    // 1から10までの和と平均
    int sum2 = calculate.to_sum(1, 10);
    double ave2 = calculate.to_ave(1, 10);
    System.out.println("Sum of 1 to 10 is " + sum2 + ". " + "Average is " + String.format("%.1f", ave2) + ".");

    // 1から10までの奇数の和と偶数の和
    int sum3 = calculate.odd_sum(1, 10);
    int sum4 = calculate.even_sum(1, 10);
    System.out.println("Sum of odd of 1 to 10 is " + sum3 + ". " + "Sum of even is " + sum4 + ".");
  }
}
