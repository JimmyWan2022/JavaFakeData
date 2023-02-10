package com.jimmywan.javafakedata;

import com.jimmywan.javafakedata.Bean.FakeString;
import org.junit.jupiter.api.Test;

import java.io.IOException;

//@SpringBootTest
class JavafakedateApplicationTests {

    @Test
    void contextLoads() throws IOException {
        String usLastName = FakeString.getUsLastName();
        System.out.println(usLastName);
    }

}
