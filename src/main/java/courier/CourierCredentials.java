package courier;

import lombok.Data;

public @Data class CourierCredentials {
        private String login;
        private String password;

        public CourierCredentials(String login,String password) {
            this.login = login;
            this.password = password;
        }

        public CourierCredentials(Courier courier) {
        this.login = courier.getLogin();
        this.password = courier.getPassword();
    }
        public static CourierCredentials from (Courier courier) {
            return new CourierCredentials(courier);
        }
}
