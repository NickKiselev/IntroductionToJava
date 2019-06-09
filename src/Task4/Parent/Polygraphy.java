package Task4.Parent;

import Task4.Checking.CheckFile;
import Task4.Enums.Colors;
import Task4.Enums.Genres;
import Task4.Enums.PublicationType;
import Task4.Except.ContainsException;
import Task4.Magazines.Formats;
import java.util.Objects;
import java.util.logging.Logger;

public class Polygraphy implements PrintingEdition {

    private final Logger log = Logger.getLogger(String.valueOf(Polygraphy.class));
    private String countOfPages;
    private String yearOfPublish;
    private String authorName;
    private String publishHouse;
    private String cityOfPublish;
    private String title;
    private Colors coverColor;
    private PublicationType type;
    private Formats format;
    CheckFile checkFile = new CheckFile();

    public Polygraphy(String[] param){
        this.title = param[0];
        this.authorName = param[1];
        this.countOfPages = param[2];
        this.yearOfPublish = param[3];
        this.cityOfPublish = param[4];
        this.publishHouse = param[5];
    }

    public Polygraphy(String title, String yearOfPublish, String countOfPages){
        this.title = title;
        this.yearOfPublish = yearOfPublish;
        this.countOfPages = countOfPages;
    }

    public String getAuthorName() {
        String str = authorName;
        String separator = "/";
        String[] subStr = str.split(separator);
        return subStr[1];
    }

    @Override
    public int getNumOfPages() {
        String str = countOfPages;
        String separator = "/";
        try {
            if(checkFile.isContains(str, separator)){
                String[] subStr = str.split(separator);
                return Integer.parseInt(subStr[1]);
            }
        } catch (ContainsException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Genres getGenre() {
        return null;
    }

    public Colors getCoverColor() {
        return coverColor;
    }

    public Formats getFormat(){return format;}

    @Override
    public int getYearOfPublishing() {
        String str = yearOfPublish;
        String separator = "/";
        try {
            if(checkFile.isContains(str, separator)){
                String[] subStr = str.split(separator);
                return Integer.parseInt(subStr[1]);
            }
        } catch (ContainsException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public String getPublishingHouse() {
        String str = publishHouse;
        String separator = "/";
        try {
            if(checkFile.isContains(str, separator)){
                String[] subStr = str.split(separator);
                return subStr[1];
            }
        } catch (ContainsException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getCityOfPublishing() {
        String str = cityOfPublish;
        String separator = "/";
        try {
            if(checkFile.isContains(str, separator)){
                String[] subStr = str.split(separator);
                return subStr[1];
            }
        } catch (ContainsException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getTitle() {
        String str = title;
        String separator = "/";
        try {
            if(checkFile.isContains(str, separator)){
                String[] subStr = str.split(separator);
                return subStr[1];
            }
        } catch (ContainsException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PublicationType getType(){
    return type;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polygraphy that = (Polygraphy) o;
        return Objects.equals(countOfPages, that.countOfPages) &&
                Objects.equals(yearOfPublish, that.yearOfPublish) &&
                Objects.equals(authorName, that.authorName) &&
                Objects.equals(publishHouse, that.publishHouse) &&
                Objects.equals(cityOfPublish, that.cityOfPublish) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(countOfPages, yearOfPublish, authorName, publishHouse, cityOfPublish, title);
    }
}
