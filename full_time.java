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
  * This source file cotains my full_time class
  * The function of the class is to create a full time staff affiliate record
  * It uses method getInput to take information on an full time object
  */
import java.util.Scanner;
class full_time extends staff{
  /**
  * The yearly salary of the staff member
  */
  public int yearly_salary;
  Scanner scnr = new Scanner(System.in);

  /**
    * constructor setting the full time staff affiliate information to default
    */
  public full_time(){
    yearly_salary = 0;
  }

  /**
    * constructor setting the full time staff affiliate information
    * @param m_salary, how much the staff member makes
    * @param title, extended from staff class
    * @param building, extended from staff class
    */
  public full_time(int m_salary, String title, String building){
    super(title, building);
    this.yearly_salary = m_salary;
  }

  /**
    * getSalary()
    * Returns the salary of the staff member
    * @return an integer value representing their yearly salary
    */
  public int getSalary(){
    return yearly_salary;
  }

  /**
    *setSalary()
    * Sets the yearly salary for the full time staff member
    * @param m_salary, new yearly salary for full time
    */
  public void setSalary(int m_salary){
    this.yearly_salary = m_salary;
  }

  /**
  * getInput()
  * Takes input for full time staff affiliate information, and extends
  * staff affiliate information
  */
  public void getInput(){
    super.getInput();
    System.out.println("Enter yearly salary: ");
    yearly_salary = scnr.nextInt();
  }

  /**
  * printInfo()
  * Prints information for undergraduate student affiliate information, and extends
  * student affiliate information
  */
  public void printInfo(){
    super.printInfo();

    System.out.println(yearly_salary);

  }

  /**
  * Info()
  * Puts information for full time staff affiliate in a string, and extends staff
  * @return string with full time staff affiliate information
  */
  public String Info(){
    super.Info();
    String ret = "";
    ret += super.Info() + yearly_salary;
    return ret;

  }
}
