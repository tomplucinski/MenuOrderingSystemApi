package com.menuorderingsystem.menuorderingsystem;

import static org.assertj.core.api.Assertions.assertThat;

import com.menuorderingsystem.web.GreetingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GreetingControllerTest {

    @Autowired
    private GreetingController greetingController;

    @Test
    void getGreeting() {
        assertThat(greetingController).isNotNull();
    }
}
