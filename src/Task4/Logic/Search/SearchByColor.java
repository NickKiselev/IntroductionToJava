package Task4.Logic.Search;

import Task4.Enums.Colors;
import Task4.Enums.PublicationType;
import Task4.Entity.Parent.Polygraphy;
import java.util.ArrayList;

public class SearchByColor {

public void searchByColor(Colors color, ArrayList<Polygraphy> list) {

    int sum = 0;

    for (Polygraphy p : list) {
        if (p.getCoverColor().equals(color)) {
            sum++;
        }
    }

    if (list.get(0).getType().equals(PublicationType.MAGAZINE)) {
        System.out.println("There are " + sum + " magazines of " + color + " color cover in Library");
    } else {
        System.out.println("There are " + sum + " books of " + color + " color cover in Library");
    }
}

}
