package com.tdea.parcial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTests {

    @Test
    public void ShouldNigth() {
        int hour =5;
        assertEquals("Night",Utils.getTimeOfDay(hour));
    }

    @Test
    public void ShouldMorning() {
        int hour =10;
        assertEquals("Morning",Utils.getTimeOfDay(hour));
    }

    @Test
    public void ShouldAfternoon() {
        int hour =17;
        assertEquals("Afternoon",Utils.getTimeOfDay(hour));
    }

    @Test
    public void ShouldEvening() {
        int hour =22;
        assertEquals("Evening",Utils.getTimeOfDay(hour));
    }

    @Test
    public void ShouldInvalidHour() {
        int hour =33;
        assertEquals("Invalid hour",Utils.getTimeOfDay(hour));
    }

}
