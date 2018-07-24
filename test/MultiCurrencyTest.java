import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiCurrencyTest {

    @Test
    public void MultiplicationTest() {
        Dollar five  = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);

        product = five.times(3);
        assertEquals(15, product.amount);
    }



}
j8uujjuiimimiijiijmk