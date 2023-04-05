/* Date: 3/30/2020
* Name: Deodatus Marcellino
* ----------------------- Cruise Ship Evacuation ----------------------------
* This program demonstrates the use of Priority Queue and interactions among classes and objects.
*
* Titanic Cruise Line (TCL) has decided that due to an unfortunate incident, it needs to streamline the evacuation of
* occupants from a sinking cruise ship. The old stand-by of "women and children first" was found to not be sufficiently
* clear for the prioritization of evacuees, which led to people falling off the ship and hitting propeller blades and such.
* To help reduce the chaos under these stressful circumstances, TCL has commissioned you along with a team of software engineers
* to develop a program to determine the order in which people should be let on to lifeboats.
*
* Priority Order rules:
*
* Children
* ---------
* Children have the highest priority in being evacuated from the ship, where a child is defined as a person aged less than 18 years.
* Among children, the younger they are, the higher their priority.
* Children of the same integer age should be prioritized based on their last names (String comparison).
* If two children have the same age and last name, they should then be prioritized based on first name.
*
* Adults
* ------
* Amongst adults (people age 18 and older), women have priority over men.
* The executives of TCL, being very wealthy individuals, insist that adults of the same sex be prioritized based on annual income (wealthier have higher priority).
* Adults of the same sex with equal income should be prioritized by name in the same way as children.
*
* If these conditions aren't enough to distinguish two people, then they are of equal priority.
*
*The program allow the users three options:
* 1) Add a person to the list of people to be evacuated.
*    The program will collect all the information necessary about the person including age (integer), sex, first name, last name, and annual income (integer).
*
* 2) Release a lifeboat.
*    The program will ask the number of people that the lifeboat can hold,
*    then list the people who should get on to the boat in order of priority.
*
* 3) Exit the program.
*    Upon exiting the program, the program will list all the people still in line and then terminate.
* */
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

            switch (choice) {
                case 1 -> { // Add one evacuee to the waiting list (evacueeQueue)
                    person = createPerson();
                    q.add(person);
                }
                case 2 -> // Release a lifeboat
                        releaseBoat(q);
                case 0 -> { // exit
                    System.out.println("Thank you for using the evacuation assistant.");
                    if (q.size() != 0) {
                        System.out.println("Let's hope the following people are strong swimmers: ");
                        for (int i = 0; i < q.size(); i++) {
                            System.out.println(q.getNextEvacuee());
                        }
                    }
                }
                default -> System.out.println("Please enter the right choice.");
            }//end switch

        } // end while loop

    }//end main driver

    public static void releaseBoat(EvacueeQueue q) {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people can fit in the lifeboat?");
        a = sc.nextInt();

        System.out.println("Let these people on to the boat: ");
        for (int i = 0; i < a; i++){
            System.out.println(q.getNextEvacuee());
        }

    } // end method releaseBoat

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