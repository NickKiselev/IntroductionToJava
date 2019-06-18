package Task4.Entity.Magazines;

import Task4.Enums.Colors;
import Task4.Enums.Formats;
import Task4.Enums.Genres;
import Task4.Enums.PublicationType;
import Task4.Entity.Parent.Polygraphy;

import java.util.Objects;

public class Magazine extends Polygraphy {

    private Colors coverColor;
    private Genres genre;
    private String magazineNum;
    private String months;
    private Formats format;

    public Magazine(String[] param, Colors coverColor, Genres genre, Formats format) {
        super(param[0], param[1], param[2]);
        if(param[3] != null && param[4] != null && coverColor != null && genre != null && format != null) {
            this.magazineNum = param[3];
            this.months = param[4];
            this.coverColor = coverColor;
            this.genre = genre;
            this.format = format;
        }
    }

    public String getMonths() {
        return splitLine(months);
    }

    public int getMagazineNum() {
        return Integer.parseInt(splitLine(magazineNum));
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
