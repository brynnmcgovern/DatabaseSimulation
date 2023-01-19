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
  * This source file cotains my AffiliatesDriver class
  * The function of the class is to create a database of student records from user input, and allow the user to run through
  * different options
  * It uses methods for each option, and a method to print the options to the user
  */

import java.util.*;
import java.io.*;
import java.util.Map.Entry;


class AffiliatesDriver implements printable {

  Scanner scnr = new Scanner(System.in);
  /**
  * The database for affiliate records
  */
  HashMap <Integer, Affiliate> database = new HashMap <> ();

  /**
  * optionOne()
  * runs through the first option, and takes information for an affiliate record,
  * then stores the record in the database HashMap
  */
  public void optionOne(){

    System.out.println("Please enter if they're a student, staff, or faculty: ");
    String choice = scnr.next();
    String student = "student";
    String staff = "staff";
    if(choice.equals(student)){
      System.out.println("Is this student a graduate or undergraduate: ");
      String student1 = scnr.next();
      if(student1.equals("graduate")){
        graduate g1 = new graduate();
        g1.getInput();
        database.put(g1.getID(), g1);

      }
      else if(student1.equals("undergraduate")){
        undergraduate u1 = new undergraduate();
        u1.getInput();
        database.put(u1.getID(), u1);

      }
    }
    else if(choice.equals(staff)){

      System.out.println("Is this staff member full-time or part-time: ");
      String choice1 = scnr.next();
      if(choice1.equals("full-time")){
        full_time ft1 = new full_time();
        ft1.getInput();
        database.put(ft1.getID(), ft1);
      }
      else if(choice1.equals("part-time")){
        part_time pt1 = new part_time();
        pt1.getInput();
        database.put(pt1.getID(), pt1);
      }
    }
    else if(choice.equals("faculty")){
      System.out.println("Is this faculty member an assistant, associate, or full: ");
      String choice2 = scnr.next();
      if(choice2.equals("assistant")){
        assistant as1 = new assistant();
        as1.getInput();
        database.put(as1.getID(), as1);
      }
      else if(choice2.equals("associate")){
        associate a1 = new associate();
        a1.getInput();
        database.put(a1.getID(), a1);
      }
      else if(choice2.equals("full")){
        full f1 = new full();
        f1.getInput();
        database.put(f1.getID(), f1);
      }
    }

  }

  /**
  * printable()
  * interface to print out an affiliate record
  */
  @Override
  public void print(Affiliate object){

    object.printInfo();
  }

  /**
  * optionTwo()
  * runs through the second option, and takes input for an affiliate record to print out
  * utilizes the interface printable
  */
  public void optionTwo(){
    int input;
    System.out.println("Enter the ID of the record you'd like to see: ");
    input = scnr.nextInt();
    Affiliate value = new Affiliate();
    value = (database.get(input));
    System.out.print(value + ", ");
    print(value);


  }


  /**
  * optionThree()
  * runs through the third option, and sorts the affiliate records by seniority of when
  * they started at chapman
  */
  public void optionThree(){
    LinkedHashMap<Integer, Affiliate> sorted = new LinkedHashMap<>();
    Affiliate value = new Affiliate();
    int start_year;
    List<Integer> id_numbers = new ArrayList<>(database.keySet());
    List<Affiliate> record = new ArrayList<>(database.values());
    List<Integer> year = new ArrayList<>();
    for(int i = 0; i < id_numbers.size(); ++i){
      int id = id_numbers.get(i);
      value = (database.get(id));
      start_year = value.getStartYear();
      year.add(start_year);


    }

    Collections.sort(year);
    int id = 0;
    for(int j = 0; j < year.size(); ++j){

      value = record.get(j);
      int new_id = id_numbers.get(j);
      if(database.get(new_id) == value){
        id = new_id;
      }
      if(value.getStartYear() == year.get(j)){
        sorted.put(id, value);
        print(value);
      }
    }



    // need to make this list with the start years for each affiliate
    //then need to sort second list
    //then create new hashmap with id numbers




  }

  /**
  * optionFour()
  * runs through the fourth option, and takes information for an affiliate record to delete
  */
  public void optionFour(){
    System.out.println("Please enter the ID of the record you'd like to delete: ");
    int input = scnr.nextInt();
    database.remove(input);
  }

  /**
  * optionFive()
  * runs through the fifth option, and takes information for a file to save the
  * affiliate database to
  */
  public void optionFive (){
    System.out.println("Which file should the database be saved to: ");
    String file = scnr.next();
    File data_file = new File(file);

    PrintWriter pw = null;
    try {

            data_file.createNewFile();
    } catch (IOException e1) {
            e1.printStackTrace();
        }
    try {
            PrintWriter outFS = new PrintWriter(data_file);
            for(Map.Entry mapElement : database.entrySet()){
              Affiliate value = (Affiliate)mapElement.getValue();
              String type = value.getClass().getSimpleName();
              outFS.print(type + ", ");
              outFS.print(value);
              String record = value.Info();
              outFS.print(record);
            }
            outFS.close();
            System.out.println("Database added to file successfully! ");


    } catch (FileNotFoundException e) {
            e.printStackTrace();
        }






  }


  /**
  * printMenu()
  * lists the options for the user, and runs the corresponding method
  */
  public void printMenu(){
    System.out.println("Please input the corresponding number for the option you want: ");
    System.out.println("1) Create an affiliate record ");
    System.out.println("2) Print information for an Affiliate given the id");
    System.out.println("3) List all affiliates in order of seniority ");
    System.out.println("4) Delete a record given the id ");
    System.out.println("5) Save your database to a file ");
    System.out.println("7) Exit ");

    int option = scnr.nextInt();

    if(option == 1){
      optionOne();

    }

    else if(option == 2){
      optionTwo();
    }
    else if(option == 3){
      optionThree();
    }
    else if(option == 4){
      optionFour();
    }
    else if(option == 5){
      optionFive();
    }
    else if(option == 7)
      System.exit(0);
  }

  public static void main(String[] args){
    AffiliatesDriver a1 = new AffiliatesDriver();
    while(true){
      a1.printMenu();
    }

  }



}
