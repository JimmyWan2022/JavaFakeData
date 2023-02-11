package com.jimmywan.javafakedata.Bean;

import java.io.IOException;
import java.util.Random;

public class FakePerson {

    private String name;
    private int sex;//0: girl,1:boy
    private String homeLocation;
    private String nation;
    private int salary;
    public static FakePerson getFakePerson() throws IOException {
        FakePerson fakePerson = new FakePerson();
        fakePerson.setName(FakeString.getUsName());
        fakePerson.setNation(FakeString.getNation());
        fakePerson.setSex(new java.util.Random().nextBoolean() ? 1 : 0);
        fakePerson.setSalary(new java.util.Random().nextInt(1000000000));
        fakePerson.setHomeLocation(FakeString.getNation());
        return fakePerson;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getHomeLocation() {
        return homeLocation;
    }

    public void setHomeLocation(String homeLocation) {
        this.homeLocation = homeLocation;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }




}
