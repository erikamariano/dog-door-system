package com.erika.dogdoors;

public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        door.addAllowedBarks(new Bark("Au Au"));
        door.addAllowedBarks(new Bark("Woof woof"));
        door.addAllowedBarks(new Bark("Roof"));
        System.out.println("Allowed barks list = " + door.getAllowedBarks());
        
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);
        
        System.out.println("Totó barks to go outside!");
        //remote.pressButton();
        
        //We don't have a hardware, so we'll just simulate the hardware hearing a bark
        recognizer.recognize(new Bark("Au au"));
        
        try{
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e){}
        
        System.out.println("Totó's all done");
        System.out.println("...but he's stuck outside.");
        
        //Simulate the hardware hearing a bark (not Totó)
        Bark smallDogBark = new Bark("rau rau");
        System.out.println("A small dog starts barking.");
        recognizer.recognize(smallDogBark);
        
        try{
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e){}
        
        System.out.println("Totó starts barking again...");
        recognizer.recognize(new Bark("Roof"));      

        System.out.println("Totó's back inside!");
    }    
}
