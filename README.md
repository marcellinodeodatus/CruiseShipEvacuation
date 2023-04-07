# Cruise Ship

Date: 3/30/2020
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
