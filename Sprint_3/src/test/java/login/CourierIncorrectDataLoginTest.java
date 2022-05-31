package login;

import courier.Courier;
import courier.CourierClient;
import courier.CourierCredentials;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class CourierIncorrectDataLoginTest {
    private CourierClient courierClient;


    @Test // Тест проверяет авторизацию курьера с неверными данными
    public void canLoginWithoutCorrectData() {
        courierClient = new CourierClient();
        Courier courier = Courier.getRandom();
        String loginWithIncorrectData = courierClient.loginWithIncorrectData(CourierCredentials.from(courier));
        assertNotNull(loginWithIncorrectData);
    }
}






