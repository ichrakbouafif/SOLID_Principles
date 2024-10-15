package com.directi.training.ocp.exercise_refactored;

public interface Ressource {
    int allouer();
    void liberer(int resourceId);
}