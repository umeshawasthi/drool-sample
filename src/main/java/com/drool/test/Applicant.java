/**
 * Created by umesh on 10/19/16.
 */
package com.drool.test;


public class Applicant {

    private String name;
    private int age;
   // private boolean valid;

    public Applicant() {
    }

    public Applicant(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   /* public boolean isValid() {
        return valid;
    }

    public void setValid(boolean b) {
        this.valid = valid;
    }*/


}
