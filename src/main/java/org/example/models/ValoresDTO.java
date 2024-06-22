package org.example.models;

public class ValoresDTO {
    private ValoresDTO(){}

    private static String userName;
    private static String productoName;

    public static String getUserName() {
        return userName;
    }
    public static void setUserName(String userName) {
        ValoresDTO.userName = userName;
    }

    public static String getProductoName() {
        return productoName;
    }
    public static void setProductoName(String productoName) {
        ValoresDTO.productoName = productoName;
    }



}
