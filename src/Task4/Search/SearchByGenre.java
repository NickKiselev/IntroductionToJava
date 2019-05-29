package Task4.Search;

import Task4.Books.Book;
import Task4.Enums.Genres;
import Task4.Magazines.Magazine;
import Task4.Parent.Polygraphy;

public class SearchByGenre {

    public Polygraphy[] addToBookArray(Polygraphy b1, Polygraphy b2, Polygraphy b3,
                           Polygraphy b4, Polygraphy b5, Polygraphy b6,
                           Polygraphy b7, Polygraphy b8, Polygraphy b9){

        Polygraphy[] polyBooks = new Book[9];
        polyBooks[0] = b1;
        polyBooks[1] = b2;
        polyBooks[2] = b3;
        polyBooks[3] = b4;
        polyBooks[4] = b5;
        polyBooks[5] = b6;
        polyBooks[6] = b7;
        polyBooks[7] = b8;
        polyBooks[8] = b9;

        return polyBooks;
    }

    public Polygraphy[] addToMagArray(Polygraphy m1, Polygraphy m2, Polygraphy m3, Polygraphy m4,
                                      Polygraphy m5, Polygraphy m6, Polygraphy m7){

    Polygraphy[] polyMag = new Magazine[7];
    polyMag[0] = m1;
    polyMag[1] = m2;
    polyMag[2] = m3;
    polyMag[3] = m4;
    polyMag[4] = m5;
    polyMag[5] = m6;
    polyMag[6] = m7;

    return polyMag;
    }

    public void searchPagesByGenreBooks(Polygraphy[] array){

        int horrorNum = 0;
        int romanNum = 0;
        int comedyNum = 0;
        int dramaNum = 0;
        int fantasticNum = 0;
        int novelNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].getGenre().equals(Genres.HORROR)) {
                horrorNum +=array[i].getNumOfPages();
            } else if (array[i].getGenre().equals(Genres.ROMAN)) {
                romanNum += array[i].getNumOfPages();
            } else if (array[i].getGenre().equals(Genres.COMEDY)) {
                comedyNum += array[i].getNumOfPages();
            } else if (array[i].getGenre().equals(Genres.DRAMA)) {
                dramaNum += array[i].getNumOfPages();
            } else if (array[i].getGenre().equals(Genres.FANTASTIC)) {
                fantasticNum += array[i].getNumOfPages();
            } else if (array[i].getGenre().equals(Genres.NOVEL)) {
                novelNum += array[i].getNumOfPages();
            }
        }
        outputStringBooks(horrorNum, romanNum, comedyNum, dramaNum, fantasticNum, novelNum);
    }

    public void searchPagesByGenreMag(Polygraphy[] array){
        int interviewNum = 0;
        int reportageNum = 0;
        int fashionNum = 0;
        int newsNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].getGenre().equals(Genres.NEWS)) {
                newsNum += array[i].getNumOfPages();
            } else if (array[i].getGenre().equals(Genres.INTERVIEW)) {
                interviewNum += array[i].getNumOfPages();
            } else if (array[i].getGenre().equals(Genres.REPORTAGE)) {
                reportageNum += array[i].getNumOfPages();
            } else if (array[i].getGenre().equals(Genres.FASHION)) {
                fashionNum += array[i].getNumOfPages();
            }
        }
        outputStringMag(newsNum, interviewNum, reportageNum, fashionNum);
    }

    private void outputStringBooks(int horror, int roman, int comedy, int drama, int fantastic, int novel){
        StringBuffer sb = new StringBuffer();
        System.out.println("NUMBER OF BOOK PAGES BY GENRE");
        sb.append("HORROR - " + horror + "\n")
                .append("ROMAN - " + roman + "\n")
                .append("COMEDY - " + comedy + "\n")
                .append("DRAMA - " + drama + "\n")
                .append("FANTASTIC - " + fantastic + "\n")
                .append("NOVEL - " + novel + "\n");
        System.out.println(sb);
    }

    private void outputStringMag(int news, int interview, int repotage, int fashion){
    StringBuffer sb = new StringBuffer();
    System.out.println("NUMBER OF MAGAZINES PAGES BY GENRE");
    sb.append("NEWS - " + news + "\n")
            .append("INTERVIEW - " + interview + "\n")
            .append("REPORTAGE - " + repotage + "\n")
            .append("FASHION - " + fashion + "\n");
    System.out.println(sb);
    }
}
