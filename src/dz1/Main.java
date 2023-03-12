package dz1;

import dz1.Printable;

public class Main {
    public static void main(String[] args) {
        Book literature = new Book("literature");
        Book Kolobok = new Book("Kolobok");
        Magazine ComicBook = new Magazine("Comic Book");
        Magazine Sergay = new Magazine("Sergay");

        Printable[] printable;
        printable = new Printable[] {
                literature, Kolobok, ComicBook, Sergay
        };

        for (Printable print : printable){
            print.print();
        }

        System.out.println();
        Magazine.printMagazines(printable);

        System.out.println();
        Book.printBooks(printable);
    }
}
