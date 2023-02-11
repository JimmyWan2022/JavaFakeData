package com.jimmywan.javafakedata.Bean;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class FakeCompany {
    private String name;
    private String url;
    private FakePerson owner;
    private String location;
    private FakePerson CEO;
    private String description;
    private Date createTime;
    private List<FakePerson> shareholders;

//    private Image image;

    public static FakeCompany getFakeCompany() throws IOException {
        FakeCompany fakeCompany = new FakeCompany();
        fakeCompany.setName(FakeString.getRandomString(10));
        fakeCompany.setUrl(FakeString.getInternetURL());
        fakeCompany.setOwner(FakePerson.getFakePerson());
        fakeCompany.setLocation(FakeString.getNation());
        fakeCompany.setCEO(FakePerson.getFakePerson());
        fakeCompany.setDescription(FakeString.getRandomString(20));
        fakeCompany.setCreateTime(new Date());
        List<FakePerson> fakePersonList = new ArrayList<>();
        int randI=new Random().nextInt(15);
        for (int i = 0; i < randI; i++) {
            fakePersonList.add(FakePerson.getFakePerson());
        }
        fakeCompany.setShareholders(fakePersonList);
        return fakeCompany;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public FakePerson getOwner() {
        return owner;
    }

    public void setOwner(FakePerson owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public FakePerson getCEO() {
        return CEO;
    }

    public void setCEO(FakePerson CEO) {
        this.CEO = CEO;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<FakePerson> getShareholders() {
        return shareholders;
    }

    public void setShareholders(List<FakePerson> shareholders) {
        this.shareholders = shareholders;
    }

//    public Image getImage() {
//        return image;
//    }
//
//    public void setImage(Image image) {
//        this.image = image;
//    }


    public  static  String getFakeCompanyJson(){
        return "";
    }
}
