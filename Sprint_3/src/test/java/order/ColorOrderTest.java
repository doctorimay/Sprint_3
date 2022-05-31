package order;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(Parameterized.class)
public class ColorOrderTest {

    private static OrderMake orderMake;
    private final List<String> color;
    private final int expectedCode;
    private static int track;


    public ColorOrderTest(List<String> color, int expectedCode) {
        this.color = color;
        this.expectedCode = expectedCode;
    }

    @Parameterized.Parameters
    public static Object[][] getOrderData() {
        return new Object[][]{
                {List.of("BLACK"), 201},
                {List.of("GREY"), 201},
                {List.of("BLACK", "GREY"), 201},
                {List.of(""), 201}
        };
    }


    @Test         // Тест направлен на создание заказа с цветом
    public void canMakeOrderWithColorTest() {
        orderMake = new OrderMake();
        Order order = Order.getOrder();
        track = OrderMake.make(order);

        assertNotNull(track);
        assertNotEquals(0, track);

    }
}
