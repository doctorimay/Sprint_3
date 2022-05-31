package order;


import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;


public class OrderTest {

    private static OrderMake orderMake;
    private int track;

    @After
    public void teardown() {
        OrderMake.cancel(track);
    }

    @Test              // Создание нового заказа без выбора цвета
    public void canMakeOrderTest() {
        orderMake = new OrderMake();
        Order order = Order.getOrder();
        track = OrderMake.make(order);
        assertNotNull(track);
        assertNotEquals(0, track);
    }

}
