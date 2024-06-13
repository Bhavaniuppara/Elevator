import java.util.Scanner;

public class Elevator{
        public static void main(String[] args) throws InterruptedException {
            // to provide the user input or custome  input
            Scanner ob=new Scanner(System.in);
            ElevatorDriver  e=new ElevatorDriver();
            char ch;
            // first loop body is executed and next the given condition checked until its true
            do {
                System.out.println("options: (S) for selectFloor,(F) for fire alarm and (Q) for quit");
                ch=ob.next().toLowerCase().charAt(0);

                switch(ch) {
                    case 's':
                        System.out.println("select floor that you would like to go");
                        int selectFloor=ob.nextInt();
                        e.selectFloor(selectFloor);
                        break;
                    case 'f':
                        System.out.println("Danger! you must exit the building now");
                        e.fireAlarm();
                        break;

                    case 'q':
                        System.out.println("....Ding");
                        System.out.println("Moving Out");

                        break;
                    default:
                        System.out.println("Invalid Selection");
                   // if condition is false it while exit from the loop
                }
            }while(ch!='q');
            ob.close();
        }
    }
