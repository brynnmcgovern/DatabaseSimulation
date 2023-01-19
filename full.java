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
  * This source file cotains my full class
  * The function of the class is to create an full faculty affiliate record
  * It uses method getInput to take information on an full object
  */
import java.util.Scanner;
class full extends faculty{
  /**
  * The number of years until the faculty member retires
  */
  public int yearsToRetire;
  Scanner scnr = new Scanner(System.in);

  /**
    * constructor setting the full facutly affiliate information to default
    */
  public full(){
    yearsToRetire = 0;
  }
  /**
    * constructor setting the full faculty affiliate information
    * @param m_yearsToRetire, the number of years until the affiliate retires
    * @param department, extended from faculty class
    * @param salary, extended from faculty class
    * @param num_papers, extended from faculty class
    */
  public full (int m_yearsToRetire, String department, int salary, int num_papers){
    super(department, salary, num_papers);
    this.yearsToRetire = m_yearsToRetire;
  }

  /**
    * getYears()
    * Returns the years until the faculty member retires
    * @return an integer value representing the number of years until they retire
    */
  public int getYears(){
    return yearsToRetire;
  }

  /**
    *setYears()
    * Sets the number of years until faculty member is retired
    * @param m_years, new number of years until retired
    */
  public void setYears(int m_years){
    this.yearsToRetire = m_years;
  }

  /**
  * getInput()
  * Takes input for full faculty affiliate information, and extends faculty affiliate information
  */
  public void getInput(){
    super.getInput();
    System.out.println("Enter how many years until retirement: ");
    yearsToRetire = scnr.nextInt();
  }

  /**
  * printInfo()
  * Prints information for full faculty affiliate information, and extends
  * faculty affiliate information
  */
  public void printInfo(){
    super.printInfo();
    System.out.println(yearsToRetire);

  }

  /**
  * Info()
  * Puts information for full faculty affiliate in a string, and extends faculty
  * @return string with full faculty affiliate information
  */
  public String Info(){
    super.Info();
    String ret = "";
    ret += super.Info() + yearsToRetire;
    return ret;

  }
}
