package com.sample;

import java.util.Locale;
/**
 * Jmockit demo
 */
public class HelloJmockit {
    public String sayHello() {
        Locale locale = Locale.getDefault();
        if (locale.equals(Locale.JAPANESE)) {
            return "こんにちは、JMockit!";
        } else {
            return "Hello，JMockit!";
        }
    }
}
