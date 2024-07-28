import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(Parameterized.class)
public class IngredientTest {

    Ingredient ingredient;
    private IngredientType type;
    private String name;
    private float price;

    public IngredientTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] ingredients() {
        return new Object[][]{
                {SAUCE, "Колбаски", 100F},
                {FILLING, "Кетчуп", 200F}
        };
    }

    @Before
    public void setUp() {
        ingredient = new Ingredient(type, name, price);
    }

    @Test
    public void checkGetPrice() {
        float expectedPrice = price;
        float actualPrice = ingredient.getPrice();
        assertEquals(expectedPrice, actualPrice, 0.0);
    }

    @Test
    public void checkGetName() {
        String expectedName = name;
        String actualName = ingredient.getName();
        assertEquals(expectedName, actualName);
    }
}
