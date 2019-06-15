package Task4.Entity.Parent;

import Task4.Exception.CheckFile;
import Task4.Enums.Colors;
import Task4.Enums.Genres;
import Task4.Enums.PublicationType;
import Task4.Exception.ContainsException;
import Task4.Enums.Formats;

import java.util.Objects;

public class Polygraphy implements PrintingEdition {

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
private final String SEPARATOR = "/";


public Polygraphy(String[] param) {
    this.title = param[0];
    this.authorName = param[1];
    this.countOfPages = param[2];
    this.yearOfPublish = param[3];
    this.cityOfPublish = param[4];
    this.publishHouse = param[5];
}

public Polygraphy(String title, String yearOfPublish, String countOfPages) {
    this.title = title;
    this.yearOfPublish = yearOfPublish;
    this.countOfPages = countOfPages;
}

public String getAuthorName() {
    return splitLine(authorName);
}

@Override
public int getNumOfPages() {
    try {
        if (checkFile.isContains(countOfPages, SEPARATOR)) {
            return Integer.parseInt(splitLine(countOfPages));
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

public Formats getFormat() {
    return format;
}

@Override
public int getYearOfPublishing() {
    try {
        if (checkFile.isContains(yearOfPublish, SEPARATOR)) {
            return Integer.parseInt(splitLine(yearOfPublish));
        }
    } catch (ContainsException e) {
        e.printStackTrace();
    }
    return 0;
}

@Override
public String getPublishingHouse() {
    try {
        if (checkFile.isContains(publishHouse, SEPARATOR)) {
            return splitLine(publishHouse);
        }
    } catch (ContainsException e) {
        e.printStackTrace();
    }
    return null;
}

@Override
public String getCityOfPublishing() {
    try {
        if (checkFile.isContains(cityOfPublish, SEPARATOR)) {
            return splitLine(cityOfPublish);
        }
    } catch (ContainsException e) {
        e.printStackTrace();
    }
    return null;
}

@Override
public String getTitle() {
    try {
        if (checkFile.isContains(title, SEPARATOR)) {
            return splitLine(title);
        }
    } catch (ContainsException e) {
        e.printStackTrace();
    }
    return null;
}

public PublicationType getType() {
    return type;
}

private String splitLine(String param) {
    String[] subStr = param.split(SEPARATOR);
    return subStr[1];
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
