package Task4.Logic.Search;

import Task4.Enums.Genres;
import Task4.Entity.Parent.Polygraphy;

import java.util.ArrayList;
import java.util.logging.Logger;

public class SearchByGenre {
private static final Logger log = Logger.getLogger(String.valueOf(SearchByGenre.class));

public void searchPagesByGenreBooks(ArrayList<Polygraphy> list) {

    int horrorNum = 0;
    int romanNum = 0;
    int dramaNum = 0;
    int fantasticNum = 0;

    for (Polygraphy p : list) {
        if (p.getGenre().equals(Genres.HORROR)) {
            horrorNum += p.getNumOfPages();
        } else if (p.getGenre().equals(Genres.ROMAN)) {
            romanNum += p.getNumOfPages();
        } else if (p.getGenre().equals(Genres.DRAMA)) {
            dramaNum += p.getNumOfPages();
        } else if (p.getGenre().equals(Genres.FANTASTIC)) {
            fantasticNum += p.getNumOfPages();
        }
    }

    outputStringBooks(horrorNum, romanNum, dramaNum, fantasticNum);
}

public void searchPagesByGenreMag(ArrayList<Polygraphy> list) {
    int interviewNum = 0;
    int reportageNum = 0;
    int fashionNum = 0;
    int newsNum = 0;

    for (Polygraphy p : list) {
        if (p.getGenre().equals(Genres.NEWS)) {
            newsNum += p.getNumOfPages();
        } else if (p.getGenre().equals(Genres.INTERVIEW)) {
            interviewNum += p.getNumOfPages();
        } else if (p.getGenre().equals(Genres.REPORTAGE)) {
            reportageNum += p.getNumOfPages();
        } else if (p.getGenre().equals(Genres.FASHION)) {
            fashionNum += p.getNumOfPages();
        }
    }
    outputStringMag(newsNum, interviewNum, reportageNum, fashionNum);
}

private void outputStringBooks(int horror, int roman, int drama, int fantastic) {
    StringBuffer sb = new StringBuffer();
    log.info("NUMBER OF BOOK PAGES BY GENRE");
    sb.append("HORROR - " + horror + "\n")
            .append("ROMAN - " + roman + "\n")
            .append("DRAMA - " + drama + "\n")
            .append("FANTASTIC - " + fantastic + "\n");
    System.out.println(sb);
}

private void outputStringMag(int news, int interview, int reportage, int fashion) {
    StringBuffer sb = new StringBuffer();
    log.info("NUMBER OF MAGAZINES PAGES BY GENRE");
    sb.append("NEWS - " + news + "\n")
            .append("INTERVIEW - " + interview + "\n")
            .append("REPORTAGE - " + reportage + "\n")
            .append("FASHION - " + fashion + "\n");
    System.out.println(sb);
}
}
