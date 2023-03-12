package dz2;

import dz2.Tool;

public class Drum implements Tool {
    String size;

    public Drum(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("играет барабан размера: " + size);
    }
}