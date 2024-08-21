import java.util.Scanner;
public class Demo {
    public static void main(String[] args){
        Vehicle polymorphicVar;
        String choice = "empty";
        //Create Scanner and ask user to provide one or two.
        //If one or two not selected, program will loop until satisfied.
        //Once satisfied, continue.
        System.out.println("Pick a number one or two");
        Scanner inputScanner = new Scanner(System.in);
        boolean hasInput = false;
        while(!hasInput){
            choice = inputScanner.next();
            if(choice.equals("1") || choice.equals("2")){
                hasInput = true;
            }
            else{
                System.out.println("Please choose 1 or 2");
            }
        }
        //if user chooses 1, we assign our Vehicle variable to a SportCar.
        //We call the overwritten abstract method.
        if(choice.equals("1")){
            polymorphicVar = new SportCar(2500, 140);
            polymorphicVar.driveTheTrack();
        }
        //if user chooses 2, we assign our Vehicle variable to a Truck.
        //We call the overwritten abstract method.
        if(choice.equals("2")){
            polymorphicVar = new Truck(4000, 85);
            polymorphicVar.driveTheTrack();
        }


    }
}
