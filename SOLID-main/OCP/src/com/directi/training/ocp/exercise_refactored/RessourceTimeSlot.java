package com.directi.training.ocp.exercise_refactored;

public class RessourceTimeSlot implements Ressource {

    @Override
    public int allouer() {
        int resourceId = trouverTimeSlotLibre();
        marquerTimeSlotOccupe(resourceId);
        return resourceId;
    }

    @Override
    public void liberer(int resourceId) {
        marquerTimeSlotLibre(resourceId);
    }

    private int trouverTimeSlotLibre() {
        return 0; // implémentation fictive
    }

    private void marquerTimeSlotOccupe(int resourceId) {
        // implémentation fictive
    }

    private void marquerTimeSlotLibre(int resourceId) {
        // implémentation fictive
    }
}