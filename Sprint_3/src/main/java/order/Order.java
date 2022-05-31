package order;

import lombok.Data;


import java.util.List;



    public  @Data class Order {
    private String firstName = "Джонни";
    private String lastName = "Сильверхенд";
    private String address = "Голова ВИ";
    private String metroStation = "Партизанская";
    private String phone = "+79852678777";
    private int rentTime = 4;
    private String deliveryDate = "2022-06-06";
    private String comment = "блаблабла, уничтожать арасаку";
    private List<String> color;

    public static Order getOrder() {
        return new Order();
    }
}


