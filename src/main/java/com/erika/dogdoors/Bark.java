package com.erika.dogdoors;

public class Bark {
    private String sound;
    
    public Bark(String sound){
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
    
    public boolean equals(Bark barkHeard){
        if(this.sound.equalsIgnoreCase(barkHeard.getSound())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bark = " +  sound;
    }   
}
