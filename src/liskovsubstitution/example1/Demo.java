package liskovsubstitution.example1;

import java.util.List;

public class Demo {

    void printSet(List<Set> s)
    {
        for (Object o : s)
        System.out.println(o.toString());
    }
}
