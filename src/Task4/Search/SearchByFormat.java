package Task4.Search;

import Task4.Magazines.Formats;
import Task4.Magazines.Magazine;
import Task4.Parent.Polygraphy;

public class SearchByFormat {

    public Polygraphy[] addToMagArray(Polygraphy m1, Polygraphy m2, Polygraphy m3,
                                      Polygraphy m4, Polygraphy m5, Polygraphy m6,
                                      Polygraphy m7){

        Polygraphy[] magazines = new Magazine[7];
        magazines[0] = m1;
        magazines[1] = m2;
        magazines[2] = m3;
        magazines[3] = m4;
        magazines[4] = m5;
        magazines[5] = m6;
        magazines[6] = m7;

        return magazines;
    }

    public void searchByFormat(Formats formats, Polygraphy[] array){

        int sum = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i].getFormat().equals(formats)){
                sum++;
            }
        }
            System.out.println("There are " + sum + " magazines of " + formats + " in Library");

    }
}
