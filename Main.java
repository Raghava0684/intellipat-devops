package com.datstructure.question;

/*class Vehicle{
    void print(){
    System.out.print("Vehicle class");
    }
}
class Car extends Vehicle{
    void print(){
    System.out.print("Car class ");
    }
}

public class Main {
    public static void main(String[] args){   
    Vehicle obj1 = new Car();
    obj1.print();

    Vehicle obj2 = new Vehicle();
    obj2.print();  
    }
}*/

class Main{
    public static void A(){
        System.out.print("Good ");
        throw new RuntimeException();
    }
    public static void B(){
         A();
         System.out.print("This ");
    }
    public static void main(String[] args){
        try{
           B();
        }
        catch(Exception e){
           System.out.print("Time ");
        }
        finally{
           System.out.print("at CodingNinjas");
        }
    }
}
