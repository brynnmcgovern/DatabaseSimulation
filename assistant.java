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
  * This source file cotains my assistant class
  * The function of the class is to create an assistant faculty affiliate record
  * It uses method getInput to take information on an assistant object
  */
import java.util.Scanner;
class assistant extends faculty{
  /**
  * The number of years until the faculty member is tenured
  */
  public int yearsToTenure;
  Scanner scnr = new Scanner(System.in);

  /**
    * constructor setting the assistant faculty affiliate information to default
    */
  public assistant(){
    yearsToTenure = 0;
  }

  /**
    * constructor setting the assistant faculty affiliate information
    * @param m_yearsTenure, the number of years until the affiliate reaches tenure
    * @param department, extended from faculty class
    * @param salary, extended from faculty class
    * @param num_papers, extended from faculty class
    */
  public assistant(int m_yearsTenure, String department, int salary, int num_papers){
    super(department, salary, num_papers);
    this.yearsToTenure = m_yearsTenure;
  }

  /**
    * getYears()
    * Returns the number of years until they're tenured
    * @return an integer value representing their years until tenured
    */
  public int getYears(){
    return yearsToTenure;
  }

  /**
    *setYears()
    * Sets the number of years until assistant is tenured
    * @param m_years, new number of years until tenured
    */
  public void setYears(int m_years){
    this.yearsToTenure = m_years;
  }

  /**
  * getInput()
  * Takes input for assistant faculty affiliate information, and extends faculty affiliate
  * information
  */
  public void getInput(){
    super.getInput();
    System.out.println("Enter how many years until tenure: ");
    yearsToTenure = scnr.nextInt();
  }

  /**
  * printInfo()
  * Prints information for assistant faculty affiliate information, and extends
  * faculty affiliate information
  */
  public void printInfo(){
    super.printInfo();
    System.out.println(yearsToTenure);

  }

  /**
  * Info()
  * Puts information for assistant faculty affiliate in a string, and extens faculty
  * @return string with assistant faculty affiliate information
  */
  public String Info(){
    super.Info();
    String ret = "";
    ret += super.Info() + yearsToTenure;
    return ret;

  }
}
