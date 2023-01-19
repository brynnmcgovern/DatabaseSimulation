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
  * This source file cotains my associate class
  * The function of the class is to create an associate faculty affiliate record
  * It uses method getInput to take information on an associate object
  */
import java.util.Scanner;
class associate extends faculty{
  /**
  * The number of years the faculty member has been tenured
  */
  public int yearsTenured;
  Scanner scnr = new Scanner(System.in);

  /**
    * constructor setting the associate faculty affiliate information to default
    */
  public associate(){
    yearsTenured = 0;
  }

  /**
    * constructor setting the associate faculty affiliate information
    * @param m_yearsTenured, the number of years they have been tenured
    * @param department, extended from faculty class
    * @param salary, extended from faculty class
    * @param num_papers, extended from faculty class
    */
  public associate(int m_yearsTenured, String department, int salary, int num_papers){
    super(department, salary, num_papers);
    this.yearsTenured = m_yearsTenured;
  }

  /**
    * getYears()
    * Returns the years the associate faculty has been tenured
    * @return a n integer value representing the number of years tenured
    */
  public int getYears(){
    return yearsTenured;
  }

  /**
    *setYears()
    * Sets the number of years associate has been tenured
    * @param m_years, new number of years tenured
    */
  public void setYears(int m_years){
    this.yearsTenured = m_years;
  }

  /**
  * getInput()
  * Takes input for associate faculty affiliate information, and extends faculty affiliate
  * information
  */
  public void getInput(){
    super.getInput();
    System.out.println("Enter how many years tenured: ");
    yearsTenured = scnr.nextInt();
  }

  /**
  * printInfo()
  * Prints information for associate faculty affiliate information, and extends
  * faculty affiliate information
  */
  public void printInfo(){
    super.printInfo();

    System.out.println(yearsTenured);

  }

  /**
  * Info()
  * Puts information for associate faculty affiliate in a string, and extends faculty
  * @return string with associate faculty affiliate information
  */
  public String Info(){
    super.Info();
    String ret = "";
    ret += super.Info() + yearsTenured;
    return ret;

  }
}
