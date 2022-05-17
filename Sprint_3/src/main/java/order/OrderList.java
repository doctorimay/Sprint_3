package order;


import lombok.Data;


public class OrderList {

    public @Data static class getOrderList {
        private int courierId = 1;
        private String nearestStation = "";
        private int limit = 0;
        private int page = 0;
    }

    public @Data static class getOrderListIncorrectId {
        private int courierId = 000001;
        private String nearestStation = "";
        private int limit = 0;
        private int page = 0;
        public static OrderList getOrderListIncorrectId() {
            return new OrderList();
        }
    }
}
