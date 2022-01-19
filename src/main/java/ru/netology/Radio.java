package ru.netology;

public class Radio {
    private String name;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int maxAmountRadioStation = 9;
    private int minAmountRadioStation = 0;
    private int currentRadioStation;

    public Radio(String name, int maxVolume, int minVolume, int currentVolume, int maxAmountRadioStation, int minAmountRadioStation, int currentRadioStation) {
        this.name = name;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
        this.maxAmountRadioStation = maxAmountRadioStation;
        this.minAmountRadioStation = minAmountRadioStation;
        this.currentRadioStation = currentRadioStation;
    }


    public Radio() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;

    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxAmountRadioStation) {
            return;
        }
        if (currentRadioStation < minAmountRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void pressNextStation() {
        if (currentRadioStation >= maxAmountRadioStation) {
            setCurrentRadioStation(minAmountRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }


    public void pressPrevStation() {
        if (currentRadioStation <= minAmountRadioStation) {
            setCurrentRadioStation(maxAmountRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public void pressPlusVolume() {
        if (currentVolume >= maxVolume) {
            setCurrentVolume(maxVolume);
        } else {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void pressMinusVolume() {
        if (currentVolume <= minVolume) {
            setCurrentVolume(minVolume);
        } else {
            setCurrentVolume(currentVolume - 1);
        }

    }



}
