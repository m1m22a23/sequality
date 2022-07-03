package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAve() {
    Calculate calculate = new Calculate();
    double expected = 55;
    assertEquals(expected, calculate.ave(2, 3), 0);
  }

  @Test
  public void testToSum() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculate.to_sum(2, 3), 0);
  }

  @Test
  public void testOdd() {
    Calculate calculate = new Calculate();
    boolean expected = true;
    assertEquals(expected, calculate.odd(1));
  }

  @Test
  public void testEven() {
    Calculate calculate = new Calculate();
    boolean expected = false;
    assertEquals(expected, calculate.odd(2));
  }

  @Test
  public void testOddSum() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.odd_sum(1, 10));
  }

  @Test
  public void testEvenSum() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.even_sum(1, 10));
  }
}
