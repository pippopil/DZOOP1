package ru.netology;

public class Radio {

    private String name;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int amountRadioStation = 10;
    private int firstAmountRadioStation = 0;
    private int lastAmountRadioStation = amountRadioStation - 1;
    private int currentRadioStation;


    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
        this.lastAmountRadioStation = amountRadioStation - 1;
    }

    public Radio() {
    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }


    public void setAmountRadioStation(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
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
        if (currentRadioStation > lastAmountRadioStation) {
            return;
        }

        if (currentRadioStation < firstAmountRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void pressNextStation() {
        if (currentRadioStation == lastAmountRadioStation) {
            setCurrentRadioStation(firstAmountRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }


    public void pressPrevStation() {
        if (currentRadioStation == firstAmountRadioStation) {
            setCurrentRadioStation(lastAmountRadioStation);
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