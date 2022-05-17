package courier;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class CourierRegisterWithoutDataTest {
    private CourierClient courierClient;


    @Test
    public void canCourierRegisterWithoutNecessarilyDataTest() {
        courierClient = new CourierClient();
        Courier courier = Courier.getRandomLogin();
        String createWithoutData = courierClient.createWithoutData(courier);

        assertNotNull(createWithoutData);

    }
}
