package com.directi.training.lsp.exercise_refactored;

public class Pool
{
    public void run()
    {
        DuckBehavior donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        electricDuck.turnOn(); // Assurez-vous d'allumer le canard électronique avant de l'utiliser
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(DuckBehavior... ducks)
    {
        for (DuckBehavior duck : ducks) {
            duck.quack();
        }
    }

    private void swim(DuckBehavior... ducks)
    {
        for (DuckBehavior duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
