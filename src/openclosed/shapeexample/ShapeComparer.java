package openclosed.shapeexample;

import java.util.Comparator;
import java.util.Hashtable;

/// <summary>
/// This comparer will search the priorities
/// hashtable for a shape's type. The priorities
/// table defines the odering of shapes. Shapes
/// that are not found precede shapes that are found.
/// </summary>
public class ShapeComparer implements Comparator {

    private static Hashtable priorities = new Hashtable();

    public ShapeComparer() {
        priorities.put(Circle.class, 1);
        priorities.put(Square.class, 2);
    }

    private int priorityFor(Object object) {
        if (priorities.contains(object))
            return (int) priorities.get(object);
        else
            return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        int priority1 = priorityFor(o1.getClass());
        int priority2 = priorityFor(o2.getClass());
        return priority1 - priority2;
    }
}
