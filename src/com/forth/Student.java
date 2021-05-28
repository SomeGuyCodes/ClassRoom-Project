package com.forth;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private  String Name;
    private  String lastName;
    private  long phoneNumber;
    private  int sSN;
    private  double gPA;
    private  int studentId;
    private  String eMail;

    ArrayList<String> stuNames = new ArrayList<String>(10);
    ArrayList<String> stuLastNames = new ArrayList<String>(10);
    ArrayList<Long> stuPhoneNums= new ArrayList<Long>(10);
    ArrayList<Integer> stuSsn  = new ArrayList<Integer>(10);
    ArrayList<Double> stuGpa = new ArrayList<Double>(10);
    ArrayList<Integer> stuIds = new ArrayList<Integer>(10);
    ArrayList<String> stuEmails = new ArrayList<String>(10);
    ArrayList<Integer> stuIndex = new ArrayList<Integer>(10);
    Object[] stuInfo = new Object[7];
    int stunum=-1;
    int index = 0;
    ArrayList<String> stuFullNames = new ArrayList<String>(20);
    //stuFullNames = {stuNames[0]+" "+stuLastNames[0]+"\n", stuNames[1]+" "+ stuLastNames[1]+"\n", stuNames[2]+" "+ stuLastNames[2]+"\n", stuNames[3]+" "+ stuLastNames[3]+"\n", stuNames[4]+" "
            //+ stuLastNames[4]+"\n", stuNames[5]+" "+ stuLastNames[5]+"\n", stuNames[6]+" "+ stuLastNames[6]+"\n", stuNames[7]+" "+ stuLastNames[7]+"\n", stuNames[8]+" "+ stuLastNames[8] +"\n", stuNames[9]+" "+ stuLastNames[9]};
    //String allStudents = stuNames[0]+" "+stuLastNames[0]+"\n"+ stuNames[1]+" "+ stuLastNames[1]+"\n"+ stuNames[2]+" "+ stuLastNames[2]+" "+ stuNames[3]+" "+ stuLastNames[3]+" "+ stuNames[4]+" "
            //+ stuLastNames[4]+" "+ stuNames[5]+" "+ stuLastNames[5]+" "+ stuNames[6]+" "+ stuLastNames[6]+" "+ stuNames[7]+" "+ stuLastNames[7]+" "+ stuNames[8]+" "+ stuLastNames[8] +" "+ stuNames[9]+" "+ stuLastNames[9];
    /*Student studentOne = new Student();
    Student studentThree = new Student();
    Student studentTwo = new Student();
    Student studentFour = new Student();
    Student studentFive = new Student();
    Student studentSix = new Student();
    Student studentSeven = new Student();
    Student studentEight = new Student();
    Student studentNine = new Student();
    Student studentTen = new Student();*/
    /*String totalStudents[] ={studentOne.getName(),studentTwo.getName(),studentThree.getName(),studentFour.getName(),studentFive.getName(),studentSix.getName(),studentSeven.getName(),
            studentEight.getName(),studentNine.getName(),studentTen.getName()};*/
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getsSN() {
        return sSN;
    }

    public void setsSN(int sSN) {
        this.sSN = sSN;
    }

    public double getgPA() {
        return gPA;
    }

    public void setgPA(double gPA) {
        this.gPA = gPA;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public  void addStudent(){
        Student newStu = new Student();
            stunum++;
            if(stunum>10){

                System.out.println("Maximum number of students reached./n Please remove a student.");
            }else {
                Scanner scans = new Scanner(System.in);
                System.out.println("Enter student first name:");
                stuNames.add(scans.nextLine());
                //stuFullNames.add(stuNames.get(stunum));
                //newStu.setName(stuNames[stunum]);
                stuIndex.add(index);
                index++;
                //System.out.println(stuNames[stunum]);
                //System.out.println(stuFullNames[stunum]);
                //System.out.println(stunum);

                System.out.println("Enter student last name:");
                stuLastNames.add(scans.nextLine());
                String entry = stuNames.get(stunum) + " " + stuLastNames.get(stunum);
                stuFullNames.add(entry);
                System.out.println(stuFullNames.get(stunum));
                //newStu.setLastName(stuLastNames[stunum]);

                //System.out.println(stuLastNames[stunum]);
                //System.out.println(allStudents);

                System.out.println("Enter student telephone number:");
                stuPhoneNums.add(scans.nextLong());

                //newStu.setPhoneNumber(stuPhoneNums[stunum]);

                //System.out.println(stuPhoneNums[stunum]);
                //System.out.println(allStudents);

                System.out.println("Enter student Gpa");
                stuGpa.add(scans.nextDouble());

                //newStu.setgPA(stuGpa[stunum]);

                //System.out.println(stuGpa[stunum]);
                //System.out.println(allStudents);

                System.out.println("Enter student social security number:");
                stuSsn.add(scans.nextInt());

                //newStu.setsSN(stuSsn[stunum]);

                //System.out.println(stuSsn[stunum]);
                //System.out.println(allStudents);

                System.out.println("Enter student Email Address:");
                Scanner scan2 = new Scanner(System.in);
                stuEmails.add(scan2.nextLine());
                //newStu.seteMail(stuEmails[stunum]);

                //System.out.println(stuEmails[stunum]);
                //System.out.println(allStudents);

                stuIds.add(createId());
                for(int i=0; i>stuIds.size(); i++){
                    if (stuIds.get(stunum) == stuIds.get(i))  {
                        stuIds.set(stunum, createId());

                    }
                }
                System.out.println(stuNames.get(stunum) + "" + stuLastNames.get(stunum) + "ID number is: " + stuIds.get(stunum));

            }
    }
    public int createId(){
        int min = 11111;
        int max = 99999;
        int id = 0;
         id = (int)(Math.random()*(max-min+1)+min);
        return id;
    }
    public void listStudents() {
        System.out.println("The current students enrolled are:");
        //Collections.sort(stuFullNames);  // Sort cars
        //for (String i : stuFullNames) {
            for (int x = 0; x < stuFullNames.size(); x++) {
                System.out.println(stuFullNames.get(x) /*": Student index number is: " + stuIndex.get(x) + "name at index " + x + "in name array is: " + stuNames.get(x) + "\n"
                        + "Last name at index " + x + "in namesake array is: " + stuLastNames.get(x) + "\n"
                        + "Telephone number at index " + x + "in namesake array is: " + stuPhoneNums.get(x) + "\n"
                        + "Gpa at index " + x + "in namesake array is: " + stuGpa.get(x) + "\n"
                        + "Student Social at index" + x + "in namesake array is: " + stuSsn.get(x) + "\n"
                        + "Student email address at index " + x + "in namesake array is: " + stuEmails.get(x) + "\n"
                        + "Student ID at index " + x + "in namesake array is: " + stuIds.get(x)*/);
            }

        }
    //}

    public void formatStuList(){
        for(int i = 0; i<10; i++){

        }
    }
    public void removeStudent(){
        System.out.println("Enter student last name.");
        Scanner scan4 = new Scanner(System.in);
        String test100 = scan4.nextLine();
        System.out.println("Input is: " + test100);

        for(int z = 0; z<stuLastNames.size(); z++){
            System.out.println(stuLastNames.get(z));
            if(test100.equals(stuLastNames.get(z))){
                stuPhoneNums.remove(z);
                stuGpa.remove(z);
                stuSsn.remove(z);
                stuEmails.remove(z);
                stuIds.remove(z);
                System.out.println(stuFullNames.get(z) + " has been removed.");
                stuFullNames.remove(z);
                stuLastNames.remove(z);
                stuNames.remove(z);
                stunum--;

            }
        }

    }
    public void updateStuInfo() {
        System.out.println("Enter student ID number:");
        Scanner scan5 = new Scanner(System.in);
        int test9000 = scan5.nextInt();
        for(int b = 0; b<stuIds.size(); b++){
            if(test9000 == stuIds.get(b)){
                System.out.println("(1)First Name: " + stuNames.get(b));
                System.out.println("(2)Last Name: " + stuLastNames.get(b));
                System.out.println("(3)Student Social: " + stuSsn.get(b));
                System.out.println("(4)Telephone number: " + stuPhoneNums.get(b));
                System.out.println("(5)Email Address: " + stuEmails.get(b));
                //System.out.println("(6)Student Id: " + stuIds.get(b));
                System.out.println("Select attribute by number to change(1-5).");
                Scanner scan8 = new Scanner(System.in);
                int test00 = scan8.nextInt();
                int sel[] = {1,2,3,4,5,6};
                switch(test00){//for(int dee =1; dee<7; dee++){
                    case 1://if(test00 == sel[dee]){
                        System.out.println("Enter updated first name: ");
                        Scanner ttest = new Scanner(System.in);
                        String dtest = ttest.nextLine();
                        stuNames.set(b, dtest);
                        stuFullNames.set(b, stuNames.get(b) + " " + stuLastNames.get(b));
                        System.out.println("First name updated.");
                        break;
                    //}
                case 2:{//if(test00 == sel[dee]){
                        System.out.println("Enter updated last name: ");
                        Scanner ttest0 = new Scanner(System.in);
                         dtest = ttest0.nextLine();
                        stuLastNames.set(b, dtest);
                        stuFullNames.set(b, stuNames.get(b) + " " + stuLastNames.get(b));
                        System.out.println("Last name updated.");
                        break;
                    }

                    case 3:{
                        System.out.println("Enter updated ssn: ");
                        Scanner ttest0 = new Scanner(System.in);
                        int ltest = ttest0.nextInt();
                        stuSsn.set(b, ltest);
                        System.out.println("SSN updated.");
                        break;
                    }
                    case 4:{
                        System.out.println("Enter updated telephone number: ");
                        Scanner ttest0 = new Scanner(System.in);
                        long ltest = ttest0.nextInt();
                        stuPhoneNums.set(b, ltest);
                        System.out.println("SSN updated.");
                        break;
                    }
                    case 5:{
                        System.out.println("Enter updated email address: ");
                        Scanner ttest0 = new Scanner(System.in);
                        String ltest = ttest0.nextLine();
                        stuEmails.set(b, ltest);
                        System.out.println("Email address updated.");
                        break;
                    }
                }
            }
        }
    }

}

