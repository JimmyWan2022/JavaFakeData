package com.jimmywan.javafakedata.Bean;

import java.awt.*;
import java.util.Date;
import java.util.List;

public class FakeCompany {
    private String name;
    private String url;
    private FakePerson owner;
    private String location;
    private FakePerson CEO;
    private String description;
    private Date createTime;
    private List<FakePerson> shareholders;

    private Image image;

    public static FakeCompany getFakeCompany(){
        return  null;
    }
    public  static  String getFakeCompanyJson(){
        return "";
    }
}
