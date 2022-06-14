package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadiomanTest {
    @Test
    public void shouldTurningStationOnNine() {
        Radioman station = new Radioman();
        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningStationOnZero() {
        Radioman station = new Radioman();
        station.setCurrentStation(0);

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningStationOn10() {
        Radioman station = new Radioman();
        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningStationOnFive() {
        Radioman station = new Radioman();
        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldTurningStationOnMinusOne() {
        Radioman station = new Radioman();
        station.setCurrentStation(-1);

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
    public void shouldTurningStationOnPrev() {
        Radioman station = new Radioman();
        station.setCurrentStation(5);
        station.decreaseStation();

        int expected = 4;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldTurningStationFromZeroByPrev() {
        Radioman station = new Radioman();
        station.setCurrentStation(0);
        station.decreaseStation();

        int expected = 9;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningStationOnTenByNext() {
        Radioman station = new Radioman();
        station.setCurrentStation(9);
        station.increaseStation();

        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnTen() {
        Radioman station = new Radioman();
        station.setCurrentVolume(10);

        int expected = 10;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeZero() {
        Radioman station = new Radioman();
        station.setCurrentVolume(0);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnNine() {
        Radioman station = new Radioman();
        station.setCurrentVolume(5);

        int expected = 5;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnOne() {
        Radioman station = new Radioman();
        station.setCurrentVolume(1);

        int expected = 1;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnEleven() {
        Radioman station = new Radioman();
        station.setCurrentVolume(11);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldTurningVolumeOnTenByNext() {
        Radioman station = new Radioman();
        station.setCurrentVolume(9);
        station.increaseVolume();

        int expected = 10;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnElevenByNext() {
        Radioman station = new Radioman();
        station.setCurrentVolume(10);
        station.increaseVolume();

        int expected = 10;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnOneByNext() {
        Radioman station = new Radioman();
        station.setCurrentVolume(0);
        station.increaseVolume();

        int expected = 1;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnNineByPrev() {
        Radioman station = new Radioman();
        station.setCurrentVolume(10);
        station.decreaseVolume();

        int expected = 9;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldTurningVolumeZeroByPrev() {
        Radioman station = new Radioman();
        station.setCurrentVolume(0);
        station.decreaseVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurningVolumeOnMinusOne() {
        Radioman station = new Radioman();
        station.setCurrentVolume(-1);

        int expected = 0;
        int actual = station.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
