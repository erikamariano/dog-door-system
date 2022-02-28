package com.erika.dogdoors;

import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {
    private DogDoor door;
    
    public BarkRecognizer(DogDoor door){
        this.door = door;
    }
    
    public void recognize(Bark barkHeard){
        System.out.println("BarkRecognizer: Heard a " + barkHeard);
        
        List allowedBarks = door.getAllowedBarks();        
        
        for(Iterator i = allowedBarks.iterator(); i.hasNext();){
            Bark allowedBark = (Bark) i.next();
            if(allowedBark.equals(barkHeard)){
                System.out.println("This bark is on the list!");
                door.open();
                return;
            }
        }
        System.out.println("This bark is not on the list of allowed barks.");
    }
}
