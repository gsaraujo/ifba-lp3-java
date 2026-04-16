package iunidade.lists;

import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<String> linguagens = new ArrayList<>();

        linguagens.add("Python");
        linguagens.add("Java");
        linguagens.add("C#");
        linguagens.add("C++");
        linguagens.add("C:");

        for (int i = 0; i < linguagens.size(); i++) {
            System.out.println(linguagens.get(i));
        }

        linguagens.remove(1);

        for (int i = 0; i < linguagens.size(); i++) {
            System.out.println(linguagens.get(i));
        }
    }
}
