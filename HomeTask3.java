package by.overone.lesson20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class HomeTask3 {
    public static void main(String args[]) {
        ArrayList number = new ArrayList();

        number.add("1");
        number.add("2");
        number.add("3");
        number.add("4");
        number.add("5");
        number.add("6");
        number.add("7");
        number.add("8");
        number.add("9");
        number.add("10");

        System.out.print("All list: ");
        Iterator itr = number.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        ListIterator litr = number.listIterator();

        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + " ");
        }
        System.out.print("The list is in reverse order: ");

        while (litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();


    }
}

