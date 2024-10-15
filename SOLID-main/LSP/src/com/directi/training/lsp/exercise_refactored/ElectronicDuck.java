package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck implements DuckBehavior
{
    private boolean _on = false;

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }

    @Override
    public void quack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            System.out.println("Electronic duck is off, can't quack");
        }
    }

    @Override
    public void swim()
    {
        if (_on) {
            System.out.println("Electronic duck swim...");
        } else {
            System.out.println("Electronic duck is off, can't swim");
        }
    }
}