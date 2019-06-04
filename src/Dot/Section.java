package Dot;

public class Section extends Point {

    private int x1;
    private int y1;

    public Section(int x, int y, int x1, int y1) {
        super(x, y);
        this.x1 = x1;
        this.y1 = y1;
    }

    public double sectionLength(){
        return Math.sqrt((x1 - getX())*(x1 - getX()) + (y1 - getY())*(y1 - getY()));
    }


}
