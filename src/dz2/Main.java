package dz2;

import dz2.Tool;

public class Main {
    public static void main(String[] args){
        Guitar Bazz = new Guitar(4);
        Drum Djembe = new Drum("40");
        Tube Piccolo = new Tube(6);

        Tool[] tools = new Tool[] {
                Bazz, Djembe, Piccolo
        };

        for (Tool tool : tools){
            tool.play();
        }
    }
}