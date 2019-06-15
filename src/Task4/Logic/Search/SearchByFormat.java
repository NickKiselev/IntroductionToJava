package Task4.Logic.Search;

import Task4.Enums.Formats;
import Task4.Entity.Parent.Polygraphy;

import java.util.ArrayList;

public class SearchByFormat {

public void searchByFormat(Formats formats, ArrayList<Polygraphy> list) {

    int sum = 0;

    for (Polygraphy p : list) {
        if (p.getFormat().equals(formats)) {
            sum++;
        }
    }
    System.out.println("There are " + sum + " magazines of " + formats + " in Library");

}
}
