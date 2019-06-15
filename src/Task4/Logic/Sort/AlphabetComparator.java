package Task4.Logic.Sort;

import Task4.Entity.Parent.Polygraphy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class AlphabetComparator implements Comparator<Polygraphy> {

    @Override
    public int compare(Polygraphy o1, Polygraphy o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }

    public void addToTreeSet(ArrayList<Polygraphy> list){

        TreeSet<Polygraphy> poly = new TreeSet<>(this);

        poly.addAll(list);

        outputSortedBooks(poly);
    }

    private void outputSortedBooks(TreeSet<Polygraphy> poly){
        for(Polygraphy p: poly){
            System.out.println(p.getTitle());
        }
    }
}
