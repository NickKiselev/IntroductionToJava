package Task4.Entity.Parent;

import Task4.Enums.Genres;

public interface PrintingEdition {

    int getNumOfPages();

    Genres getGenre();

    int getYearOfPublishing();

    String getPublishingHouse();

    String getCityOfPublishing();

    String getTitle();

}
