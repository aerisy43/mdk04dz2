package dz1;

import dz1.Printable;

public class Book implements Printable {

    String Name;
    public Book(String Name){
        this.Name = Name;
    }

    @Override
    public void print() {
        System.out.println(Name);
    }

    public static void printBooks(Printable[] printable){
        System.out.println("books: ");
        for (Printable print : printable){
            if (print instanceof Book){
                print.print();
            }
        }
    }
}