package com.directi.training.isp.exercise_refactored;

public class SensingDoor implements Door, ProximityAwareDoor {
    private boolean _locked;
    private boolean _opened;

    public SensingDoor(Sensor sensor) {
        sensor.register(this);
    }

    @Override
    public void open() {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close() {
        _opened = false;
    }

    public void lock() {
        _locked = true;
    }

    public void unlock() {
        _locked = false;
    }

    @Override
    public void proximityCallback() {
        _opened = true;
    }
}