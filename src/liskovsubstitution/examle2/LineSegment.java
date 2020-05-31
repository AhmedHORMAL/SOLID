package liskovsubstitution.examle2;

import java.awt.*;

public class LineSegment extends LinearObject {

    public LineSegment(Point p1, Point p2) {
        super(p1, p2);
    }

    public double getLength() {
        /*code*/
        return 0;
    }

    @Override
    public boolean IsOn(Point p) {
        return false;
    }
}
