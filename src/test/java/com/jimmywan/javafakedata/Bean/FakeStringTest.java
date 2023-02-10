package com.jimmywan.javafakedata.Bean;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class FakeStringTest {

    @Test
    void getColor() {
        String color = FakeString.getColor();
        System.out.println(color);
    }

    @Test
    void getName() throws IOException {
        String usName = FakeString.getUsLastName();
        System.out.println(usName);
    }

    @Test
    void getFirstName() throws IOException {
        String string = FakeString.getFirstName();
        System.out.println(string);
    }

    @Test
    void getLastName() throws IOException {
        String string = FakeString.getLastName();
        System.out.println(string);
    }

    @Test
    void getUsFirstName() throws IOException {
        String string = FakeString.getUsFirstName();
        System.out.println(string);
    }

    @Test
    void getUsLastName() throws IOException {
        String usName = FakeString.getUsLastName();
        System.out.println(usName);
    }

    @Test
    void getUsName() throws IOException {
        String usName = FakeString.getUsName();
        System.out.println(usName);
    }

    @Test
    void readFile() throws IOException {
        String fileName= "src/main/java/com/jimmywan/javafakedate/Data/NamesDatabases/LastName/us.txt";
        String string = FakeString.readFile(fileName);
        System.out.println(string);
    }


    @Test
    void getPassword() {
        String usName = FakeString.getPassword();
        System.out.println(usName);
    }

    @Test
    void getEmail() {
        String string = FakeString.getEmail();
        System.out.println(string);
    }


    @Test
    void getTelPhoneNumber() {
        String string = FakeString.getTelPhoneNumber();
        System.out.println(string);
    }





    @Test
    void getInternetURL() {
        String string = FakeString.getInternetURL();
        System.out.println(string);
    }

    @Test
    void getTencentQQCode() {
        String string = FakeString.getTencentQQCode();
        System.out.println(string);
//        for (int i = 0; i < 10; i++) {
//            String string = FakeString.getTencentQQCode();
//            System.out.println(string);
//        }

    }

    @Test
    void getPostcode_us() {
        String string = FakeString.getPostcode_us();
        System.out.println(string);
    }

    @Test
    void getPostcode_cn() {
        String string = FakeString.getPostcode_cn();
        System.out.println(string);
    }


    @Test
    void getIpv4() {
        String string = FakeString.getIpv4();
        System.out.println(string);
    }
    @Test
    void getIpv6() {
        String string = FakeString.getIpv6();
        System.out.println(string);
    }

    @Test
    void getUsername() {
        String string = FakeString.getUsername();
        System.out.println(string);
    }






}