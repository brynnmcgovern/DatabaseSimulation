/**
  * Brynn McGovern
  * 2370579
  * bmcgovern@chapman.edu
  * CPSC 231-04
  * MP4: Inheritance, Interfaces, & Abstract Classes – Oh My!
  *
  * @author Brynn McGovern
  * @version 1.0
  *
  * This source file cotains my staff class
  * The function of the class is to create a staff affiliate record
  * It uses method getInput to take information on a staff object
  */
import java.util.Scanner;
abstract class staff extends Affiliate{
  /**
  * The title of the staff member
  */
  public String title;
  /**
  * The building the staff member works in
  */
  public String building;
  Scanner scnr = new Scanner(System.in);

  /**
    * constructor setting the staff affiliate information to default
    */
  public staff(){
    title = "null";
    building = "null";
  }

  /**
    * constructor setting the staff affiliate information
    * @param m_title, title of their position
    * @param m_building, the building the staff member works in
    */
  public staff(String m_title, String m_building){
    this.title = m_title;
    this.building = m_building;
  }

  /**
    * getTitle()
    * Returns the staff member's title
    * @return a String value representing their title
    */
  public String getTitle(){
    return title;
  }

  /**
    *setTitle()
    * Sets the title of the staff member
    * @param m_title, new title for staff
    */
  public void setTitle(String m_title){
    this.title = m_title;
  }

  /**
    * getBuilding()
    * Returns the building the staff member works in
    * @return a String value representing their building
    */
  public String getBuilding(){
    return building;
  }

  /**
    *setBuilding()
    * Sets the building the staff member works in
    * @param m_building, new building for staff member
    */
  public void setBuilding(String m_building){
    this.building = m_building;
  }

  /**
  * getInput()
  * Takes input for staff affiliate information, and extends
  * affiliate information
  */
  public void getInput(){
    super.getInput();
    System.out.println("Enter title: ");
    title = scnr.next();
    System.out.println("Enter building name: ");
    building = scnr.next();
  }

  /**
  * printInfo()
  * Prints information for staff affiliate information, and extends
  * affiliate information
  */
  public void printInfo(){
    super.printInfo();

    System.out.print(title + ", " + building + ", ");

  }

  /**
  * Info()
  * Puts information for staff affiliate in a string, and extends affiliate
  * @return string with staff affiliate information
  */
  public String Info(){
    super.Info();
    String ret = "";
    ret += super.Info() + title + ", " + building + ", ";
    return ret;

  }
}
