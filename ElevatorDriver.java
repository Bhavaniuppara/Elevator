
import java.util.Scanner;
public class ElevatorDriver {
    final static int minFloor = 1;
        static int maxFloor = 10;
        static int currentFloor=1;
        int selectFloor=0 ;

        //Method to select the floor
        void selectFloor(int selectFloor)  {
            // to handle exception during the execution
            try {
                //if selection floor less than 1 or greater 10 throw exception
                if(selectFloor<1||selectFloor>10 ) {
                    throw new Exception("The floor Selection is inappropriate");
                }
                // if selection floor is greaterhan current intially current floor=1
                if(selectFloor>currentFloor){
                    System.out.println("Closing the door");
                    // stops the excecution for 1 sec
                    Thread.sleep(1000);
                    // loop to move the lift to select floor
                    while(currentFloor++<selectFloor) {
                        System.out.println("Going up.......currentfloor: " +currentFloor);
                    }


                }
                else if(selectFloor<currentFloor) {
                    System.out.print("Closing the door");
                    Thread.sleep(1000);
                    while(currentFloor-->selectFloor) {
                        System.out.println("Going down.......currentfloor: " +currentFloor);
                    }

                }
                Thread.sleep(1000);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        void fireAlarm() {
            try {
                // if currentfloor is greaterthan 1
                if(currentFloor>1) {
                    //  loop to move to first floor
                    while(currentFloor-->1) {
                        Thread.sleep(1000);
                        System.out.println("Going down.......currentfloor: " +currentFloor);
                    }

                }

                System.out.println("Please Exit the building by pressing 'q' ");

            }
            catch(InterruptedException e) {
                e.printStackTrace();

            }
        }
}


