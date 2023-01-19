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
  * This source file cotains my Affiliate class
  * The function of the class is to create an affiliate for the student record and take user input
  * It uses method getInput to take information on an affiliate object
  */

import java.util.Scanner;

class Affiliate{
  /**
  * The age of the affiliate
  */
  public int age;
  /**
  * The name of the affiliate
  */
  public String name;
  /**
  * The address of the affiliate
  */
  public String address;
  /**
  * The phone number of the affiliate
  */
  public String phone_number;
  /**
  * The ID of the affiliate
  */
  public int id;
  /**
  * When the affiliate started at chapman
  */
  public int start_year;
  Scanner scnr = new Scanner(System.in);

  /**
    * constructor setting the affiliate information to default
    */
  public Affiliate(){
    age = 0;
    name = "null";
    address = "null";
    phone_number = "null";
    id = 0;
    start_year = 0;
  }

  /**
    * constructor setting the affiliate information
    * @param m_age, age of affiliate
    * @param m_name, name of affiliate
    * @param m_address, address of affiliate
    * @param m_phone, phone number of affiliate
    * @param m_id, ID number of affiliate
    * @param m_year, year the affiliate started at Chapman
    */
  public Affiliate(int m_age, String m_name, String m_address, String m_phone, int m_id, int m_year){
    this.age = m_age;
    this.name = m_name;
    this.address = m_address;
    this.phone_number = m_phone;
    this.id = m_id;
    this.start_year = m_year;
  }

  /**
    * getAge()
    * Returns the age of affiliate
    * @return an integer value representing their age
    */
  public int getAge(){
    return age;
  }

  /**
    *setAge()
    * Sets the age of the affiliate
    * @param m_age, new age of the affiliate
    */
  public void setAge(int m_age){
    this.age = m_age;
  }

  /**
    * getName()
    * Returns the name of affiliate
    * @return a String value representing their name
    */
  public String getName(){
    return name;
  }

  /**
    *setName()
    * Sets the name of the affiliate
    * @param m_name, new name of the affiliate
    */
  public void setName(String m_name){
    this.name = m_name;
  }

  /**
    * getAddress()
    * Returns the address of the affiliate
    * @return a String value representing their address
    */
  public String getAddress(){
    return address;
  }

  /**
    *setAddress()
    * Sets the address of the affiliate
    * @param m_address, new address of the affiliate
    */
  public void setAddress(String m_address){
    this.address = m_address;
  }

  /**
    * getPhoneNumber()
    * Returns the phone number of the affiliate
    * @return a String value representing their phone number
    */
  public String getPhoneNumber(){
    return phone_number;
  }

  /**
    *setPhoneNumber()
    * Sets the phone number of the affiliate
    * @param m_phonenum, new phone number of affiliate
    */
  public void setPhoneNumber(String m_phonenum){
    this.phone_number = m_phonenum;
  }

  /**
    * getID()
    * Returns the id of the affiliate
    * @return an integer value representing their id
    */
  public int getID(){
    return id;
  }

  /**
    *setID()
    * Sets the ID of the affiliate
    * @param m_id, new id number for the affiliate
    */
  public void setID(int m_id){
    this.id = m_id;
  }

  /**
    * getStartYear()
    * Returns the year the affiliate started at chapman
    * @return an integer value representing the year they started
    */
  public int getStartYear(){
    return start_year;
  }

  /**
    *setStartYear()
    * Sets the year the affiliate started at chapman
    * @param m_year, new start year for affiliate
    */
  public void setStartYear(int m_year){
    this.start_year = m_year;
  }

  /**
  * getInput()
  * Takes input for affiliate information
  */
  public void getInput(){
    System.out.println("Enter age: ");
    age = scnr.nextInt();
    scnr.nextLine();
    System.out.println("Enter name: ");
    name = scnr.nextLine();
    System.out.println("Enter address: ");
    address = scnr.nextLine();
    System.out.println("Enter phone number: ");
    phone_number = scnr.next();
    System.out.println("Enter id: ");
    id = scnr.nextInt();
    System.out.println("Enter year started at Chapman: ");
    start_year = scnr.nextInt();
  }

  /**
  * printInfo()
  * Prints information for affiliate information
  */
  public void printInfo(){

    System.out.print(age + ", " + name + ", " + address + ", " + phone_number + ", " + id + ", " + start_year + ", ");
  }

  /**
  * Info()
  * Puts information for affiliate in a string
  * @return string with affiliate information
  */
  public String Info(){
    String ret = "";
    ret += age + ", " + name + ", " + address + ", " + phone_number + ", " + id + ", " + start_year + ", ";
    return ret;
  }

}
