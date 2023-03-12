package dz2;

import dz2.Tool;

public class Guitar implements Tool {

    int numString;
    public Guitar(int numString) {
        this.numString = numString;
    }

    @Override
    public void play() {
        System.out.println("играет гитара со струнами: " + numString);
    }
}