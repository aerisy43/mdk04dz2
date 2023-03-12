package dz2;

import dz2.Tool;

public class Tube implements Tool {

    int diameter;

    public Tube(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("играет муз.труба диаметра: " + diameter);
    }
}