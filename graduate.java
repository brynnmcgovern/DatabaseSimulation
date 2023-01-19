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
  * This source file cotains my graduate class
  * The function of the class is to create a graduate student affiliate record
  * It uses method getInput to take information on an graduate object
  */
import java.util.Scanner;
class graduate extends student{
  /**
  * The advisor of the student
  */
  public String advisor;
  /**
  * The number of papers the student has published
  */
  public int num_papers;
  Scanner scnr = new Scanner(System.in);

  /**
    * constructor setting the graduate student affiliate information to default
    */
  public graduate(){
    advisor = "null";
    num_papers = 0;
  }

  /**
    * constructor setting the graduate student affiliate information
    * @param m_advisor, the students' advisor
    * @param m_papers, the number of papers they have published
    * @param major, extended from student class
    * @param minor, extended from student class
    * @param class_rank, extended from student class
    */
  public graduate(String m_advisor, int m_papers, String major, String minor, int class_rank){
    super(major, minor, class_rank);
    this.advisor = m_advisor;
    this.num_papers = m_papers;
  }

  /**
    * getAdvisor()
    * Returns the graduate student's advisor
    * @return a String value representing their advisor
    */
  public String getAdvisor(){
    return advisor;
  }

  /**
    *setAdvisor()
    * Sets the advisor for the graduate student
    * @param m_advisor, new advisor for student
    */
  public void setAdvisor(String m_advisor){
    this.advisor = m_advisor;
  }

  /**
    * getPapers()
    * Returns the number of papers published by the graduate student
    * @return an integer value representing their papers published
    */
  public int getPapers(){
    return num_papers;
  }

  /**
    *setPapers()
    * Sets the number of papers graduate student has published
    * @param m_papers, new number of papers published
    */
  public void setPapers(int m_papers){
    this.num_papers = m_papers;
  }

  /**
  * getInput()
  * Takes input for graduate student affiliate information, extends student
  * affiliate information
  */
  public void getInput(){
    super.getInput();
    System.out.println("Enter advisor name: ");
    advisor = scnr.next();
    System.out.println("Enter how mnay published papers: ");
    num_papers = scnr.nextInt();
  }

  /**
  * printInfo()
  * Prints information for graduate student affiliate information, and extends
  * studnet affiliate information
  */
  public void printInfo(){
    super.printInfo();
    System.out.println(advisor + ", " + num_papers);
  }

  /**
  * Info()
  * Puts information for graduate student affiliate in a string, and extends student
  * @return string with graduate student affiliate information
  */
  public String Info(){
    super.Info();
    String ret = "";
    ret += super.Info() + advisor + ", " + num_papers;
    return ret;
  }
}
