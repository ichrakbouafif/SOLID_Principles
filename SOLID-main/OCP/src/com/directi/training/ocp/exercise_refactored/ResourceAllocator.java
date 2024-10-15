package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

   
    public int allouerRessource(Ressource ressource) {
        return ressource.allouer();
    }

    
    public void libererRessource(Ressource ressource, int resourceId) {
        ressource.liberer(resourceId);
    }
}
