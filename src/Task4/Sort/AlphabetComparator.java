package Task4.Sort;

import Task4.Parent.Polygraphy;

import java.util.Comparator;
import java.util.TreeSet;

public class AlphabetComparator implements Comparator<Polygraphy> {

    @Override
    public int compare(Polygraphy o1, Polygraphy o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }

    public void addToTreeSet(Polygraphy b1, Polygraphy b2, Polygraphy b3,
                             Polygraphy b4, Polygraphy b5, Polygraphy b6,
                             Polygraphy b7, Polygraphy b8, Polygraphy b9){

        TreeSet<Polygraphy> poly = new TreeSet<>(this);
        poly.add(b1);
        poly.add(b2);
        poly.add(b3);
        poly.add(b4);
        poly.add(b5);
        poly.add(b6);
        poly.add(b7);
        poly.add(b8);
        poly.add(b9);

        outputSortedBooks(poly);
    }

    private void outputSortedBooks(TreeSet<Polygraphy> poly){
        for(Polygraphy p: poly){
            System.out.println(p.getTitle());
        }
    }
}
