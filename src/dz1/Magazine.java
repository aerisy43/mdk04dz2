package dz1;

import dz1.Printable;

public class Magazine implements Printable {

    String Name;

    public Magazine(String Name){
        this.Name = Name;
    }
    @Override
    public void print() {
        System.out.println(Name);
    }

    public static void printMagazines(Printable[] printable){
        System.out.println("magazines: ");
        for (Printable print : printable){
            if (print instanceof Magazine){
                print.print();
            }
        }
    }

}