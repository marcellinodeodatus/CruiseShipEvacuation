package evacuation;

import java.util.*;

public class Evacuation {

    public static void main(String[] args) {

        int choice = -1;
        EvacueeQueue q = new EvacueeQueue();
        Evacuee person;

        System.out.println("Welcome to the evacuation assistant");

        // display menu
        while (choice != 0){

            choice = programMenu();

            switch (choice){
                case 1: // Add one evacuee to the waiting list (evacueeQueue)
                    person = createPerson();
                    q.add(person);
                    break;
                case 2: // Release a lifeboat

                    break;
                case 0: // exit
                    break;
                default:
                    System.out.println("Please enter the right choice.");
                    break;
            }//end switch

        } // end while loop

    }//end main driver

    public static int programMenu(){
        int a;
        Scanner sc = new Scanner(System.in);

            System.out.println("1) Add an evacuee to the waiting list");
            System.out.println("2) Release a lifeboat");
            System.out.println("0) Exit");
            a = sc.nextInt();

        return a;
    } //end method programMenu

    public static Evacuee createPerson(){

        Evacuee folks = new Evacuee();
        Scanner sc = new Scanner (System.in);

        System.out.println("What is the evacuee’s last name?");
        folks.setLastName(sc.next());

        System.out.println("What is the evacuee’s first name?");
        folks.setFirstName(sc.next());

        System.out.println("Is the evacuee 1)male or 2)female?");
        folks.setGender(sc.nextInt());

        System.out.println("How old is the evacuee?");
        folks.setAge(sc.nextInt());

        System.out.println("What is the evacuee’s annual income(US$)?");
        folks.setIncome(sc.nextInt());

        System.out.println("The evacuee: ");
        System.out.println(folks);
        System.out.println("Has been added to the waiting list");

        return folks;
    }

}