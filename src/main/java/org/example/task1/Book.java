package org.example.task1;

public class Book implements Displayable {
   private String title;
   private String author;
   private int year;

   public void setTitle (String title) {
       this.title = title;
   }

   public String getTitle () {
       return this.title;
   }

   public void setAuthor (String author) {
       this.author = author;
   }

   public String getAuthor () {
       return this.author;
   }

   public void setYear (int year) {
       this.year = year;
   }

   public int getYear () {
       return this.year;
   }

    @Override
    public void display() {
       System.out.println("Книга: " + this.title + ", " + this.author + ", " + this.year);
    }
}
hhhyggy
