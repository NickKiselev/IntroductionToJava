package Task4.Logic.Search;

import Task4.Entity.Parent.Polygraphy;

import java.util.ArrayList;

public class AddToArrayList {

public ArrayList<Polygraphy> list = new ArrayList<>();

public ArrayList<Polygraphy> addToList(Polygraphy p1, Polygraphy p2, Polygraphy p3, Polygraphy p4) {

    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);

    return list;
}
}
