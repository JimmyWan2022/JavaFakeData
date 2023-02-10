package com.jimmywan.javafakedata.utils;

import com.jimmywan.javafakedata.Bean.FakeCar;
import com.jimmywan.javafakedata.Bean.FakeCompany;
import com.jimmywan.javafakedata.Bean.FakePerson;

public class JavaFakeData {

    public static FakeCar FakeCar(){
        return new FakeCar();
    }

    public static FakeCompany FakeCompany(){
        return new FakeCompany();
    }

    public static FakePerson FakePerson(){
        return new FakePerson();
    }

//    public static String Name(){
//        return "asdasd";
//    }
//
//    public static String Email(){
//        return "asdasd";
//    }
//     public static String Phone(){
//        return "asdasd";
//    }
//     public static String Color(){
//        return "asdasd";
//    }
//     public static String Company(){
//        return "asdasd";
//    }
//    public static String JobTitle(){
//        return "asdasd";
//    }
//    public static String CurrencyShort(){
//        return "asdasd";
//    }

}
