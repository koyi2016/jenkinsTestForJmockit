package com.sample;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class ColorSample1Test {

    @Test
    public void testGetColor1() {
        ColorSample1 c1 = new ColorSample1();
        String t1 = c1.getColor(1);
        assertThat(t1,is("赤"));
    }
    @Test
    public void testGetColor2() {
        ColorSample1 c1 = new ColorSample1();
        String t1 = c1.getColor(2);
        assertThat(t1,is("青"));
    }
    @Test
    public void testGetColor3() {
        ColorSample1 c1 = new ColorSample1();
        String t1 = c1.getColor(3);
        assertThat(t1,is("1or2を入力して下さい"));
    }
}
