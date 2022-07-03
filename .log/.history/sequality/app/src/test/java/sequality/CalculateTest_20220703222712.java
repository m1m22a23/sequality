package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected1_sum = 5;
    double expected1_ave = 5.5;
    assertEquals(expected1_sum, calculate.sum(2, 3));
    assertEquals(expected1_ave, calculate.sum(2, 3)/2.0);
  }
}
