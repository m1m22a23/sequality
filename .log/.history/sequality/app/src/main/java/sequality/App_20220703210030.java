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
        int sum = calculate.sum(2, 3);
        System.out.println("Sum of 2 and 3 is "+ sum + ".");
    }
}
