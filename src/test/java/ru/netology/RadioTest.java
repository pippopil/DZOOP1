package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio1 = new Radio();
    Radio radio = new Radio("Radiola", 100, 0, 67, 9, 0, 5);


    @Test
    public void createRadio() {
        String expected = "Radiola";
        assertNull(radio1.getName());
        radio1.setName(expected);
        assertEquals(expected, radio1.getName());
    }

    //Станции
    @Test
    public void validateChangeFields() {
        assertEquals(0, radio1.getCurrentRadioStation());
        radio1.setCurrentRadioStation(4);
        assertEquals(4, radio1.getCurrentRadioStation());
    }

    @Test
    public void changeOverLastRadioStation() {
        Radio radio = new Radio("Radiola", 100, 0, 67, 9, 0, 9);
        radio.pressNextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void changeUnderInitialRadioStation() {
        radio1.pressPrevStation();
        assertEquals(9, radio1.getCurrentRadioStation());

    }

    @Test
    public void nextRadioStation() {
        radio.pressNextStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        radio.pressPrevStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void UnderInitialRadioStation() {
        radio1.setCurrentRadioStation(-1);
        assertEquals(0, radio1.getCurrentRadioStation());
    }


    @Test
    public void OverInitialRadioStation() {
        radio1.setCurrentRadioStation(10);
        assertEquals(0, radio1.getCurrentRadioStation());
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
        Radio radio = new Radio("Radiola", 100, 0, 101, 9, 0, 9);
        radio.getCurrentVolume();
        radio.pressPlusVolume();
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void volumeUnderMin() {
        Radio radio = new Radio("Radiola", 100, 0, -1, 9, 0, 9);
        radio.getCurrentVolume();
        radio.pressMinusVolume();
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void minusVolume() {
        radio.pressMinusVolume();
        assertEquals(66, radio.getCurrentVolume());
    }

    @Test
    public void plusVolume() {
        radio.pressPlusVolume();
        assertEquals(68, radio.getCurrentVolume());
    }

}