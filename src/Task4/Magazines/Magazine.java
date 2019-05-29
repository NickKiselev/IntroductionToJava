package Task4.Magazines;

import Task4.Enums.Colors;
import Task4.Enums.Genres;
import Task4.Enums.PublicationType;
import Task4.Parent.Polygraphy;

import java.util.Objects;

public class Magazine extends Polygraphy {

    private Colors coverColor;
    private Genres genre;
    private String magazineNum;
    private String months;
    private Formats format;

    public Magazine(String[] param, Colors coverColor, Genres genre, Formats format) {
        super(param[0], param[1], param[2]);
        this.magazineNum = param[3];
        this.months = param[4];
        this.coverColor = coverColor;
        this.genre = genre;
        this.format = format;
    }

    public String getMonths() {
        String str = months;
        String separator = "/";
        String[] subStr = str.split(separator);
        return subStr[1];
    }

    public int getMagazineNum() {
        String str = magazineNum;
        String separator = "/";
        String[] subStr = str.split(separator);
        return Integer.parseInt(subStr[1]);
    }

    public Formats getFormat() {
        return format;
    }

    public Colors getCoverColor() {
        return coverColor;
    }

    public Genres getGenre() {
    return genre;
    }

    public PublicationType getType(){
        return PublicationType.MAGAZINE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return coverColor == magazine.coverColor &&
                genre == magazine.genre &&
                Objects.equals(magazineNum, magazine.magazineNum) &&
                Objects.equals(months, magazine.months) &&
                format == magazine.format;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), coverColor, genre, magazineNum, months, format);
    }
}
