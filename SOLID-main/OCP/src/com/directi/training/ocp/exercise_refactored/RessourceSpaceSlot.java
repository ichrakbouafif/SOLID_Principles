package com.directi.training.ocp.exercise_refactored;

public class RessourceSpaceSlot implements Ressource {

    @Override
    public int allouer() {
        int resourceId = trouverSpaceSlotLibre();
        marquerSpaceSlotOccupe(resourceId);
        return resourceId;
    }

    @Override
    public void liberer(int resourceId) {
        marquerSpaceSlotLibre(resourceId);
    }

    private int trouverSpaceSlotLibre() {
        return 0; // implémentation fictive
    }

    private void marquerSpaceSlotOccupe(int resourceId) {
        // implémentation fictive
    }

    private void marquerSpaceSlotLibre(int resourceId) {
        // implémentation fictive
    }
}