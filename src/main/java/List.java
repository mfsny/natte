import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by SNY on 30.10.2016.
 */
public class List {
    static void print (ArrayList liste) {
        for (int i = 0; i < liste.size(); i++)
            System.out.println(liste.get(i));
    }

    static ArrayList combine (ArrayList<String> liste1, ArrayList<Integer> liste2) {
        ArrayList ergebnis = new ArrayList();
        for (int i = 0; i < liste1.size(); i++) {
            ergebnis.add(liste1.get(i));
            if ( i < liste2.size() )
              ergebnis.add(liste2.get(i));
        }
        if ( liste1.size() < liste2.size() )
            for (int j = liste1.size(); j < liste2.size(); j++)
                ergebnis.add(liste2.get(j));
        return ergebnis;
    }
    public static void main (String args[]) {
        ArrayList<String> buchstaben = new ArrayList<String>();
        /*buchstaben.add("a");
        buchstaben.add("b");
        buchstaben.add("c");
        buchstaben.add("d");
        buchstaben.add("e");*/
        System.out.println("buchstaben:");
        print(buchstaben);

        ArrayList<Integer> zahlen = new ArrayList<Integer>();
        zahlen.add(1);
        zahlen.add(2);
        zahlen.add(3);
        zahlen.add(4);
        zahlen.add(5);
        zahlen.add(6);
        System.out.println("zahlen:");
        print(zahlen);

        ArrayList e = combine(buchstaben, zahlen);

        System.out.println("e:");
        print(e);

    }
}
