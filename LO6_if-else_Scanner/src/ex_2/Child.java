package ex_2;

import com.sun.tools.attach.AgentInitializationException;

import java.sql.SQLOutput;

public class Child {
    //Name of the child
    private String name;
    // Age of the child
    private int age;
    // The sex of the child
    private final boolean male;

    public Child(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge() {
        this.age = age;
    }

    public boolean isMale() {
        return this.male;
    }

    public String getName() {
        return this.name;
    }

    public String insitution() {
        if (age == 0) {
            System.out.println("The child is at home");
        } else if (age == 1 || age == 2) {
            System.out.println("The child is at the Nursery");
        } else if (age >= 3 && age <= 5) {
            System.out.println("The child is in Kindergarten");
        } else if (age >= 6 && age <= 16) {
            System.out.println("The child is at School");
        } else if (age >= 17) {
            System.out.println("The child is out of school");
        }
        return "";
    }

    public String gender() {
        if (male == true) {
            return "Its a boy!";
        } else {
            return "Its a girl!";
        }
    }
    public String team(){
        if(male == true && age<8){
            return "Young Boys";
        }else if( male==true && age>=8){
            return "Cool Boys";
        }else if (male==false && age<8){
            return "Tumbling Girls";
        }else if (male==false && age>=8){
            return "Springy Girls";
        }
        return "";
}}
