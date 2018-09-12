package com.example.shahir.bookyourmealserver.Common;

import com.example.shahir.bookyourmealserver.Model.User;

public class Common {
    public static User currentUser;

    public  static  final  String UPDATE = "Update";
    public  static  final  String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 71;

    public  static  String convertCodeToStatus(String code){
        if(code.equals("0")) return "ORDER RECEIVED";
        else if(code.equals("1")) return "LOOKING FOR YOUR TABLE";
        else return "TABLE BOOKED";

    }
}
