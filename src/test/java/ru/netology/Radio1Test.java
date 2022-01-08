package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Radio1Test {

    Radio1 radio = new Radio1();

    @Test
    public void createRadio() {
        String expected = "Uzer";
        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    public void validateChangeFields() {
        assertEquals(0, radio.currentRadioStation);
        radio.setCurrentRadioStation(4);
        assertEquals(4, radio.currentRadioStation);
    }

    @Test
    public void changeOverLastRadioStation() {
        radio.setCurrentRadioStation(9);
        radio.pressNextStation();
        assertEquals(0, radio.currentRadioStation);
    }

    @Test
    public void changeUnderInitialRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.pressPrevStation();
        assertEquals(9, radio.currentRadioStation);

    }

    @Test
    public void nextRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.pressNextStation();
        assertEquals(7, radio.currentRadioStation);
    }

    @Test
    public void prevRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.pressPrevStation();
        assertEquals(5, radio.currentRadioStation);
    }

    @Test
    public void UnderInitialRadioStation() {
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.currentRadioStation);
    }


    @Test
    public void OverInitialRadioStation() {
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.currentRadioStation);
    }

    @Test
    public void UnderInitialVolume() {
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.currentVolume);
    }


    @Test
    public void OverInitialVolume() {
        radio.setCurrentVolume(11);
        assertEquals(0, radio.currentVolume);
    }


    @Test
    public void volumeOverMax() {
        radio.currentVolume = 11;
        radio.pressPlusVolume();
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    public void volumeUnderMin() {
        radio.currentVolume = -1;
        radio.pressMinusVolume();
        assertEquals(0, radio.getMinVolume());

    }

    @Test
    public void plusVolume() {
        radio.setCurrentVolume(4);
        radio.pressPlusVolume();
        assertEquals(5, radio.currentVolume);
    }

    @Test
    public void minusVolume() {
        radio.setCurrentVolume(4);
        radio.pressMinusVolume();
        assertEquals(3, radio.currentVolume);
    }
}