package login;

import courier.Courier;
import courier.CourierClient;
import courier.CourierCredentials;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;


public class CourierLoginTest {

    private CourierClient courierClient;
    private int courierId;

    @Before
    public void setup(){
        courierClient = new CourierClient();
    }
    @After
    public void teardown() {
        courierClient.delete(courierId);
    }


    @Test             // Тест на успешную авторизацию курьера
    public void canCourierLoginWithCorrectDataTest() {
        Courier courier = Courier.getRandom();
        boolean created = courierClient.create(courier);
        CourierCredentials creds = CourierCredentials.from(courier);
        courierId = courierClient.login(creds);
        assertTrue(created);
        assertNotEquals(0, courierId);
    }

    @Test         // Тест на авторизацию курьера без пароля
    public void canCourierLoginWithoutNecessarilyFieldTest() {
        Courier courier = Courier.getRandom();
        boolean created = courierClient.create(courier);
        CourierCredentials creds = CourierCredentials.from(courier);
        courierId = courierClient.login(creds);
        courier.setPassword("");
        courier.setFirstName("");
        courierClient.loginWithoutData(CourierCredentials.from(courier));
        assertTrue(created);
        assertNotEquals(0, courierId);

    }
}
