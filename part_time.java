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
  * This source file cotains my part_time class
  * The function of the class is to create a part time staff affiliate record
  * It uses method getInput to take information on a part time object
  */
import java.util.Scanner;
class part_time extends staff{
  /**
  * The hourly salary of the staff member
  */
  public int hour_salary;
  Scanner scnr = new Scanner(System.in);

  /**
    * constructor setting the part time staff affiliate information to default
    */
  public part_time(){
    hour_salary = 0;
  }

  /**
    * constructor setting the part time staff affiliate information
    * @param m_salary, how much the staff member makes
    * @param title, extended from staff class
    * @param building, extended from staff class
    */
  public part_time (int m_salary, String title, String building){
    super(title, building);
    this.hour_salary = m_salary;
  }

  /**
    * getSalary()
    * Returns the salary of the part time staff member
    * @return an integer value representing their hourly salary
    */
  public int getSalary(){
    return hour_salary;
  }

  /**
    *setSalary()
    * Sets the hourly salary for part time member
    * @param m_salary, new salary for part time
    */
  public void setSalary(int m_salary){
    this.hour_salary = m_salary;
  }

  /**
  * getInput()
  * Takes input for part time staff affiliate information, and extends
  * staff affiliate information
  */
  public void getInput(){
    super.getInput();
    System.out.println("Enter hourly salary: ");
    hour_salary = scnr.nextInt();
  }

  /**
  * printInfo()
  * Prints information for undergraduate student affiliate information, and extends
  * student affiliate information
  */
  public void printInfo(){
    super.printInfo();

    System.out.println(hour_salary);

  }

  /**
  * Info()
  * Puts information for part time staff affiliate in a string, and extends staff
  * @return string with part time staff affiliate information
  */
  public String Info(){
    super.Info();
    String ret = "";
    ret += super.Info() + hour_salary;
    return ret;

  }
}
