package day41;

public class TV {
   /**
     * TV
 * attributes :
            * brand , isOn , currentChannel
 * String , boolean , int   (range from 1-50)
 * String , boolean , int   (range from 0-50)
 * behaviours :
            * turnOn
            * turnOff
    */

   String name;
   boolean isOn;
   int currentChannel;

   public int getCurrentChannel(){

       /**
        * A method to return the value of current channel for the TV
        * @return the value of current channel for TV
        */
       return currentChannel;
   }



   public void turnOn() {

       if (isOn==false) { // checking for equality
           System.out.println("Turning on TV");
           isOn = true; // assigning the value of isOn to true
       }
   }

   public void turnOff(){

       // if(isOn) // this will also work
       if (isOn==true) {
           System.out.println("Turning off TV");
           isOn = false;

       }

   }

}
