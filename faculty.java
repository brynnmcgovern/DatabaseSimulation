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
  * This source file cotains my faculty class
  * The function of the class is to create a faculty affiliate record
  * It uses method getInput to take information on a faculty object
  */

import java.util.Scanner;

abstract class faculty extends Affiliate{
  /**
  * The department the faculty member works in
  */
  public String department;
  /**
  * The salary of the faculty
  */
  public int salary;
  /**
  * The number of papers published
  */
  public int num_papers;
  Scanner scnr = new Scanner(System.in);

  /**
    * constructor setting the faculty affiliate information to default
    */
  public faculty(){
    department = "null";
    salary = 0;
    num_papers = 0;
  }
  /**
    * constructor setting the faculty affiliate information
    * @param m_department, which department the faculty affiliate works in
    * @param m_salary, the salary of the faculty
    * @param m_papers, number of published papers
    */
  public faculty(String m_department, int m_salary, int m_papers){
    this.department = m_department;
    this.salary = m_salary;
    this.num_papers = m_papers;
  }

  /**
    * getDepartment()
    * Returns the department the faculty affiliate works in
    * @return a String value representing their department
    */
  public String getDepartment(){
    return department;
  }

  /**
    *setDepartment()
    * Sets the department the faculty member works in
    * @param m_department, new department for faculty member
    */
  public void setDepartment(String m_department){
    this.department = m_department;
  }

  /**
    * getSalary()
    * Returns the salary of the affiliate
    * @return an integer value representing their salary
    */
  public int getSalary(){
    return salary;
  }

  /**
    *setSalary()
    * Sets the salary of the faculty member
    * @param m_salary, new salary for faculty
    */
  public void setSalary(int m_salary){
    this.salary = m_salary;
  }

  /**
    * getNumPapers()
    * Returns the number of the papers the faculty member published
    * @return an integer value representing the number of papers published
    */
  public int getNumPapers(){
    return num_papers;
  }

  /**
    *setNumPapers()
    * Sets the number of papers published
    * @param m_papers, new number of papers published by faculty member
    */
  public void setNumPapers(int m_papers){
    this.num_papers = m_papers;
  }

  /**
  * getInput()
  * Takes input for faculty affiliate information, and extends affiliate getInput
  */
  public void getInput(){
    super.getInput();
    System.out.println("Enter department: ");
    department = scnr.next();
    System.out.println("Enter salary: ");
    salary = scnr.nextInt();
    System.out.println("Enter the number of published papers: ");
    num_papers = scnr.nextInt();

  }

  /**
  * printInfo()
  * Prints information for faculty affiliate information, and extends
  * affiliate information
  */
  public void printInfo(){
    super.printInfo();
    System.out.print(department + ", " + salary + ", " + num_papers + ", ");

  }

  /**
  * Info()
  * Puts information for faculty affiliate in a string, and extends affiliate
  * @return string with faculty affiliate information
  */
  public String Info(){
    super.Info();
    String ret = "";
    ret += super.Info() + department + ", " + salary + ", " + num_papers + ", ";
    return ret;
  }


}
