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
        int sum1 = calculate.sum(2, 3);
        double ave1 = sum1 / 2;
        System.out.println("Sum of 2 and 3 is " + sum1 + "." + "Average is " + String.format("%.1f", ave1));
        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            sum2 = calculate.sum(sum2, i);
        }
        double ave2 = sum2 / 10;
        System.out.println("Sum of 1 to 10 is " + sum2 + "." + "Average is " + String.format("%.1f", ave2));
    }
}
