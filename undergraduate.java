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
  * This source file cotains my undergraduate class
  * The function of the class is to create an undergraduate student affiliate record
  * It uses method getInput to take information on an undergraduate object
  */
import java.util.Scanner;
class undergraduate extends student{
  /**
  * The number of courses the student has completed
  */
  public int num_courses;
  /**
  * The amount of money the student recieved in scholarships
  */
  public int scholarship_amount;
  Scanner scnr = new Scanner(System.in);

  /**
    * constructor setting the undergraduate student affiliate information to default
    */
  public undergraduate(){
    num_courses = 0;
    scholarship_amount = 0;
  }

  /**
    * constructor setting the undergraduate student affiliate information
    * @param m_courses, the number of courses they've taken
    * @param m_scholarship, how much scholarship money they received
    * @param major, extended from student class
    * @param minor, extended from student class
    * @param class_rank, extended from student class
    */
  public undergraduate(int m_courses, int m_scholarship, String major, String minor, int class_rank){
    super(major, minor, class_rank);
    this.num_courses = m_courses;
    this.scholarship_amount = m_scholarship;
  }

  /**
    * getCourses()
    * Returns the number of courses taken by the undergraduate
    * @return an integer value representing their courses taken
    */
  public int getCourses(){
    return num_courses;
  }

  /**
    *setCourses()
    * Sets the number of courses undergraduate student has taken
    * @param m_courses, new number of courses taken
    */
  public void setCourses(int m_courses){
    this.num_courses = m_courses;
  }

  /**
    * getScholarship()
    * Returns the amount of scholarship money recieved by the student
    * @return an integer value representing their scholarship amount
    */
  public int getScholarship(){
    return scholarship_amount;
  }

  /**
    *setScholarship()
    * Sets the scholarship amount recieved by undergraduate student
    * @param m_scholarship, new scholarship amount for student
    */
  public void setScholarship(int m_scholarship){
    this.scholarship_amount = m_scholarship;
  }

  /**
  * getInput()
  * Takes input for undergraduate student affiliate information, and extends
  * student affiliate information
  */
  public void getInput(){
    super.getInput();
    System.out.println("Enter how many courses taken: ");
    num_courses = scnr.nextInt();
    System.out.println("Enter how much scholarship money received: ");
    scholarship_amount = scnr.nextInt();
  }

  /**
  * printInfo()
  * Prints information for undergraduate student affiliate information, and extends
  * student affiliate information
  */
  public void printInfo(){
    super.printInfo();
    System.out.println(num_courses + ", " + scholarship_amount);

  }

  /**
  * Info()
  * Puts information for undergraduate student affiliate in a string, and extends student
  * @return string with undergraduate student affiliate information
  */
  public String Info(){
    super.Info();
    String ret = "";
    ret += super.Info() + num_courses + ", " + scholarship_amount;
    return ret;

  }
}
