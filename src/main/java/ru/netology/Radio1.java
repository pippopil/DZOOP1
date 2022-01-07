package ru.netology;

public class Radio1 {
    private String name;
    private int maxVolume = 10;
    private int minVolume = 0;
    public int currentVolume;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    public int currentRadioStation;


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
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }




    public void pressNextStation() {
        if (currentRadioStation >= maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void pressPrevStation() {
        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
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
