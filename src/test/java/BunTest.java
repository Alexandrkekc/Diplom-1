import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {
    Bun bun = new Bun("Булочка-лакомка", 399);

    @Test
    public void getNameCheck() {
        String expectedName = "Булочка-лакомка";
        assertEquals(expectedName, bun.getName());
    }

    @Test
    public void getPriceCheck() {
        float expectedPrice = 399;
        assertEquals(expectedPrice, bun.getPrice(), 0.0);
    }
}