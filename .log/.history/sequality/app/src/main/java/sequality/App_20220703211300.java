/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        System.out.println(new App().getGreeting());

        //2と3の和と平均
        int sum1 = calculate.sum(2, 3);
        double ave1 = sum1 / 2;
        System.out.println("Sum of 2 and 3 is " + sum1 + "." + "Average is " + String.format("%.1f", ave1));

        //1から10までの和と平均
        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            sum2 = calculate.sum(sum2, i);
        }
        double ave2 = sum2 / 10;
        System.out.println("Sum of 1 to 10 is " + sum2 + "." + "Average is " + String.format("%.1f", ave2));

        //1から10までの奇数の和と偶数の和
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                sum3 = calculate.sum(sum3, i);
            } else {
                sum4 = calculate.sum(sum4, i);
            }
        }
        System.out.println("Sum of odd of 1 to 10 is " + sum3 + "." + "Sum of even is " + sum4);
    }
}
