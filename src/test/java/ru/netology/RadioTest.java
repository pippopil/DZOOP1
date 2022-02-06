package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    Radio radio1 = new Radio(20);


    @Test
    public void createRadio() {
        String expected = "Radiola";
        assertNull(radio1.getName());
        radio1.setName(expected);
        assertEquals(expected, radio1.getName());
    }

    //Станции
    @Test
    public void shouldChangeAmountRadioStation() {
        radio1.setAmountRadioStation(5);
        assertEquals(5, radio1.getAmountRadioStation());
    }

    @Test
    public void shouldCurrentRadioStation() {
        radio1.setCurrentRadioStation(5);
        assertEquals(5, radio1.getCurrentRadioStation());
    }

    @Test
    public void validateChangeFields() {
        radio1.setCurrentRadioStation(0);
        assertEquals(0, radio1.getCurrentRadioStation());
        radio1.setCurrentRadioStation(6);
        assertEquals(6, radio1.getCurrentRadioStation());

    }

    @Test
    public void changeOverLastRadioStation() {
        radio1.setCurrentRadioStation(19);
        radio1.pressNextStation();
        assertEquals(0, radio1.getCurrentRadioStation());
    }

    @Test
    public void changeUnderInitialRadioStation() {
        radio1.setCurrentRadioStation(0);
        radio1.pressPrevStation();
        assertEquals(19, radio1.getAmountRadioStation() - 1);

    }

    @Test
    public void nextRadioStation() {
        radio1.setCurrentRadioStation(5);
        radio1.pressNextStation();
        assertEquals(6, radio1.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        radio1.setCurrentRadioStation(5);
        radio1.pressPrevStation();
        assertEquals(4, radio1.getCurrentRadioStation());
    }


    @Test
    public void UnderInitialRadioStation() {
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void OverInitialRadioStation() {
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());

    }

    //Звук
    @Test
    public void UnderInitialVolume() {
        radio1.setCurrentVolume(-1);
        assertEquals(0, radio1.getCurrentVolume());
    }


    @Test
    public void OverInitialVolume() {
        radio1.setCurrentVolume(101);
        assertEquals(0, radio1.getCurrentVolume());
    }


    @Test
    public void volumeOverMax() {

        radio1.setCurrentVolume(100);
        radio1.pressPlusVolume();
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void volumeUnderMin() {

        radio1.getCurrentVolume();
        radio1.pressMinusVolume();
        assertEquals(0, radio1.getMinVolume());
    }

    @Test
    public void minusVolume() {
        radio1.setCurrentVolume(67);
        radio1.pressMinusVolume();
        assertEquals(66, radio1.getCurrentVolume());
    }

    @Test
    public void plusVolume() {
        radio1.setCurrentVolume(67);
        radio1.pressPlusVolume();
        assertEquals(68, radio1.getCurrentVolume());
    }

}