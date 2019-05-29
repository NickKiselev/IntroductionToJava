package Task4.Search;

import Task4.Books.Book;
import Task4.Enums.Colors;
import Task4.Enums.PublicationType;
import Task4.Magazines.Magazine;
import Task4.Parent.Polygraphy;

public class SearchByColor {

    public Polygraphy[] addToBookArray(Polygraphy b1, Polygraphy b2, Polygraphy b3,
                                 Polygraphy b4, Polygraphy b5, Polygraphy b6,
                                 Polygraphy b7, Polygraphy b8, Polygraphy b9){
        Polygraphy[] books = new Book[9];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = b4;
        books[4] = b5;
        books[5] = b6;
        books[6] = b7;
        books[7] = b8;
        books[8] = b9;

        return books;
    }

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

    public void searchByColor(Colors color, Polygraphy[] array){

        int sum = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i].getCoverColor().equals(color)){
                sum++;
            }
        }

        if(array[0].getType().equals(PublicationType.MAGAZINE)){
            System.out.println("There are " + sum + " magazines of " + color + " color cover in Library");
        }else {
            System.out.println("There are " + sum + " books of " + color + " color cover in Library");
        }
    }
}
