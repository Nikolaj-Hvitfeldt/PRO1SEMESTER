package ex_1;

import java.util.ArrayList;

public class Ex_1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Hans");
        names.add("Viggo");
        names.add("Jens");
        names.add("Bente");
        names.add("Bent");

        System.out.println(names);
        System.out.println();
        int length = names.size();
        System.out.println();
        System.out.println(length);
        System.out.println();

        names.add(2, "Jane");
        System.out.println(names);
        System.out.println();

        names.remove(1);

        names.add(0,"Pia");

        names.add("Ib");
        length = names.size();
        System.out.println(length);
        System.out.println();
        System.out.println(names);
        System.out.println();

        names.set(2, "Hansi");
        System.out.println();
        length = names.size();
        System.out.println(length);
        System.out.println();
        System.out.println(names);
        System.out.println();

        for(int i = 0; i<names.size(); i++){
            String name = names.get(i);
            System.out.println("Name:" + name + " - Lenght of name: " + name.length());
        }
        System.out.println();

        for( String name : names){
            System.out.println("Name: " + name + " - Length of name: " + name.length());

        }
    }
}
