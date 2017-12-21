class Chick implements Animal {     
     private String myType;     
     private String mySound;      
     private double r = Math.random();
     public Chick(String type, String sound, String sound2)     {         
         myType = type; 
         if(r>=0.5){        
            mySound = sound;
        } else {
            mySound = sound2;
        }
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}