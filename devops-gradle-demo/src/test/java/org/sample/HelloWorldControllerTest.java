package org.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <p>
 * todo
 * </p>
 *
 * @author Fox
 * @since 2024/2/20 14:42
 */
@SpringBootTest
public class HelloWorldControllerTest {
    @Autowired
    private HelloWorldController helloWorldController;
    @Test
    public void testSayHello() {
        assertEquals("Really appreciate your star, that's the power of our life.", helloWorldController.sayHello());
    }
}