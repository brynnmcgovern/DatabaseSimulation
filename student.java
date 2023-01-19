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
  * This source file cotains my student class
  * The function of the class is to create a student affiliate record
  * It uses method getInput to take information on a student object
  */
import java.util.Scanner;
abstract class student extends Affiliate{
  /**
  * The major of the student
  */
  public String major;
  /**
  * The minor of the student
  */
  public String minor;
  /**
  * The class rank of the student
  */
  public int class_rank;
  Scanner scnr = new Scanner(System.in);

  /**
    * constructor setting the student affiliate information to default
    */
  public student(){
    major = "null";
    minor = "null";
    class_rank = 0;
  }

  /**
    * constructor setting the student affiliate information
    * @param m_major, major of the student
    * @param m_minor, the minor of the student
    * @param m_rank, class rank of students
    */
  public student(String m_major, String m_minor, int m_rank){
    this.major = m_major;
    this.minor = m_minor;
    this.class_rank = m_rank;
  }

  /**
    * getMajor()
    * Returns the major of the student
    * @return a String value representing the student's major
    */
  public String getMajor(){
    return major;
  }

  /**
    *setMajor()
    * Sets the major of the student
    * @param m_major, new major for student
    */
  public void setMajor(String m_major){
    this.major = m_major;
  }

  /**
    * getMinor()
    * Returns the minor of the student
    * @return a String value representing the student's minor
    */
  public String getMinor(){
    return minor;
  }

  /**
    *setMinor()
    * Sets the minor for the student
    * @param m_minor, new minor for student
    */
  public void setMinor(String m_minor){
    this.minor = m_minor;
  }

  /**
    * getClassRank()
    * Returns the student's class rank
    * @return an integer value of their class standing
    */
  public int getClassRank(){
    return class_rank;
  }

  /**
    *setClassRank()
    * Sets the class rank for the student
    * @param m_rank, new class rank for student
    */
  public void setClassRank(int m_rank){
    this.class_rank = m_rank;
  }

  /**
  * getInput()
  * Takes input for student affiliate information, extends affiliate information
  */
  public void getInput(){
    super.getInput();
    System.out.println("Enter major: ");
    major = scnr.nextLine();
    System.out.println("Enter minor: ");
    minor = scnr.nextLine();
    System.out.println("Enter class standing: ");
    class_rank = scnr.nextInt();
  }

  /**
  * printInfo()
  * Prints information for student affiliate information, and extends
  * affiliate information
  */
  public void printInfo(){
    super.printInfo();
    System.out.print(major + ", " + minor + ", " + class_rank + ", ");

  }

  /**
  * Info()
  * Puts information for student affiliate in a string, and extends affiliate
  * @return string with student affiliate information
  */
  public String Info(){
    super.Info();
    String ret = "";
    ret += super.Info() + major + ", " + minor + ", " + class_rank + ", ";
    return ret;

  }
}
