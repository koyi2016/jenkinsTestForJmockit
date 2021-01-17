package com.sample;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ColorSample2Test {

    @Test
    public void testGetColor1() {
        ColorSample2 c1 = new ColorSample2();
        String t1 = c1.getColor(3);
        assertThat(t1,is("赤"));
    }
    @Test
    public void testGetColor2() {
        ColorSample2 c1 = new ColorSample2();
        String t1 = c1.getColor(4);
        assertThat(t1,is("青"));
    }
    @Test
    public void testGetColor3() {
        ColorSample2 c1 = new ColorSample2();
        String t1 = c1.getColor(5);
        assertThat(t1,is("3or4を入力して下さい"));
    }
}
