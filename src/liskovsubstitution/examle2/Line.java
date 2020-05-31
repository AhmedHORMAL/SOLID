package liskovsubstitution.examle2;

import java.awt.*;

public class Line extends LinearObject {

    public Line(Point p1, Point p2) {
        super(p1, p2);
    }

    @Override
    public boolean IsOn(Point p) {
        return false;
    }
}
