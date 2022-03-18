/* There are three types of constructor
   1)Default Constructor
   2)Parametrised Constructor
   3)Overloaded Constructor
 */

package com.company;
/*
class cwh{
    cwh(){ // --> Default Constructor
        System.out.println("This the Default constructor of CWH class.");
    }

    cwh(String s,int b){ //--> Parametrised Constructor
        System.out.println("This is the " +b + "th video of " + " " + s);
    }
}

public class CWH_42_ch9_Constructor {
    public static void main(String[] args) {
       // cwh obj1 = new cwh();
        cwh obj2 = new cwh("CodeWithHarry",42);
    }
}  */

class employee {
    //First Constructor
    employee(String s,int i){
        System.out.println("The name of the first employee is : " +s);
        System.out.println("The name of the second employee is : " +i);
    }

    //Second Constructor
    employee(String s, int i,int salary){
        System.out.println("The name of the second employee is : "+s);
        System.out.println("The id of the second employee is :  "+i);
        System.out.println("The salary of the second employee is : "+salary);
    }
}

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }

    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }

    public MyMainEmployee(String myName)
    {
        id=1;
        name = myName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class CWH_42_ch9_Constructor{
    public static void main(String[] args) {
//        employee Suman = new employee("Suman",1);
//        employee harry = new employee("Harry",2,70000);

        MyMainEmployee harry = new MyMainEmployee();
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}


