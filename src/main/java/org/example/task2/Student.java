package org.example.task2;

public class Student implements Printable {
   private String name;
   private String number;
   private double score;

   public void setName (String name) {
       this.name = name;
   }

   public void setNumber (String number) {
       this.number = number;
   }

   public void setScore (double score) {
       this.score = score;
   }

   public String getName () {
       return this.name;
   }

   public String getNumber () {
       return this.number;
   }

   @Override
    public void print () {
       System.out.println ("Студент: " + this.name +", " + this.number + ", " +this.score);
   }

}
