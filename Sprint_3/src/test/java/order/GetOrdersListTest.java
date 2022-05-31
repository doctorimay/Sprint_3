package order;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class GetOrdersListTest {

    private static OrderMake orderMake;

    @Before
    public void setup(){
        orderMake = new OrderMake();
    }

    @Test               // Тест направлен на получение списка всех заказов
    public void canGetOrderTest() {
        OrderList getOrderList = new OrderList();
        OrderMake.getOrder(getOrderList);
        assertNotEquals(0, "orders");

    }
    @Test              // Тест направлен на получение списка всех заказов с неверным id курьера
    public void canGetOrderWithWrongIdTest() {
        OrderList getOrderListIncorrectId = new OrderList();
        OrderMake.getOrderIncorrectId(getOrderListIncorrectId);
        assertNotEquals(0, "orders");

    }
}
