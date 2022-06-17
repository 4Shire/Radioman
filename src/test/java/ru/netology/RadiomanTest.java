package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadiomanTest {

    Radioman station = new Radioman(10);

    @Test
    public void shouldSetNumberOfStations() {
        Radioman station = new Radioman();
        station.setNumberOfStations(10);

        int expected = 10;
        int actual = station.getNumberOfStations();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberOfStationsUnderAmount() {
        Radioman station = new Radioman();
        station.setNumberOfStations(-1);

        int expected = 10;
        int actual = station.getNumberOfStations();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnNine() {
        Radioman station = new Radioman();
        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnZero() {
        Radioman station = new Radioman();
        station.setCurrentStation(0);

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnFive() {
        Radioman station = new Radioman();
        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnOne() {
        Radioman station = new Radioman();
        station.setCurrentStation(1);

        int expected = 1;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnLessStation() {
        Radioman station = new Radioman();
        station.setCurrentStation(-1);

        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnTen() {
        Radioman station = new Radioman();
        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningStationOnNext() {
        Radioman station = new Radioman();
        station.setCurrentStation(5);
        station.increaseStation();

        int expected = 6;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnTenByNext() {
        Radioman station = new Radioman();
        station.setCurrentStation(9);
        station.increaseStation();

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningStationOnPrev() {
        Radioman station = new Radioman();
        station.setCurrentStation(5);
        station.decreaseStation();

        int expected = 4;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationTurningOnZeroToOneByNext() {
        Radioman station = new Radioman();
        station.setCurrentStation(0);
        station.increaseStation();

        int expected = 1;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationFromZeroByPrev() {
        Radioman station = new Radioman();
        station.setCurrentStation(0);
        station.decreaseStation();

        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurningOnOneHundred() {
        Radioman station = new Radioman();
        station.setCurrentVolume(100);

        int expected = 100;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeTurningOnNinetyNine() {
        Radioman station = new Radioman();
        station.setCurrentVolume(99);

        int expected = 99;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurningOnZero() {
        Radioman station = new Radioman();
        station.setCurrentVolume(0);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }



    @Test
    public void shouldVolumeTurningOnOne() {
        Radioman station = new Radioman();
        station.setCurrentVolume(1);

        int expected = 1;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeTurningOnZeroZero() {
        Radioman station = new Radioman();
        station.setCurrentVolume(0);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurningOnOneHundredAndOne() {
        Radioman station = new Radioman();
        station.setCurrentVolume(101);

        int expected = 100;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }



    @Test
    public void shouldVolumeTurningOnOneHundredByNext() {
        Radioman station = new Radioman();
        station.setCurrentVolume(99);
        station.increaseVolume();

        int expected = 100;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeTurningOnNinetyNineByPrev() {
        Radioman station = new Radioman();
        station.setCurrentVolume(100);
        station.decreaseVolume();

        int expected = 99;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurningOnOneHundredAndOneByNext() {
        Radioman station = new Radioman();
        station.setCurrentVolume(101);
        station.increaseVolume();

        int expected = 100;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurningOnOneByNext() {
        Radioman station = new Radioman();
        station.setCurrentVolume(0);
        station.increaseVolume();

        int expected = 1;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldVolumeFromZeroByPrev() {
        Radioman station = new Radioman();
        station.setCurrentVolume(0);
        station.decreaseVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeTurningOnZeroByPrev() {
        Radioman station = new Radioman();
        station.setCurrentVolume(1);
        station.decreaseVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }



    @Test
    public void shouldSetVolumeUnderMin() {
        Radioman station = new Radioman();
        station.setCurrentVolume(-1);
        station.decreaseVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

}
