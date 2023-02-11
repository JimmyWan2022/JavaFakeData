package com.jimmywan.javafakedata.Bean;

import java.io.IOException;
import java.util.Random;

public class FakeHouse {
    private String location;
    private FakePerson owner;
    private int price;

    public static FakeHouse getFakeHouse() throws IOException {
        FakeHouse fakeHouse=new FakeHouse();
        fakeHouse.setOwner(FakePerson.getFakePerson());
        fakeHouse.setPrice(new Random().nextInt(1000000000));
        fakeHouse.setLocation(FakeString.getNation());
        return fakeHouse;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public FakePerson getOwner() {
        return owner;
    }

    public void setOwner(FakePerson owner) {
        this.owner = owner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
