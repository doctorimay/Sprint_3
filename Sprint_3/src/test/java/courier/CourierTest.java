package courier;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;


public class CourierTest {

    private CourierClient courierClient;
    private int courierId;

    @Before
    public void setup() {
        courierClient = new CourierClient();
    }
    Courier courier = Courier.getRandom();

    @After
    public void teardown() {
        courierClient.delete(courierId);
    }


    @Test               // Тест направлен на регистрацию нового курьера
    public void canCreateCourierTest() {
        boolean created = courierClient.create(courier);
        CourierCredentials creds = CourierCredentials.from(courier);
        courierId = courierClient.login(creds);
        assertTrue(created);
        assertNotEquals(0, courierId);

    }

    @Test              // Тест направлен на проверку невозможности регистрации одинаковых курьеров
    public void canCreateSameCourierTest() {
        boolean created = courierClient.create(courier);
        CourierCredentials creds = CourierCredentials.from(courier);
        courierId = courierClient.login(creds);
        assertTrue(created);
        assertNotEquals(0, courierId);
        courierClient.createDouble(courier);
    }
}

