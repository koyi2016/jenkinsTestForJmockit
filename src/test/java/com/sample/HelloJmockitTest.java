package com.sample;

import mockit.Expectations;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertTrue;

/**
 * HelloJmockitのテスト
 */
public class HelloJmockitTest {

    @Test
    public void testSayHello() {
        new Expectations(Locale.class) {
            {
                Locale.getDefault();
                result = Locale.JAPANESE;
            }
        };

        assertTrue("こんにちは、JMockit!".equals((new HelloJmockit()).sayHello()));
    }
}