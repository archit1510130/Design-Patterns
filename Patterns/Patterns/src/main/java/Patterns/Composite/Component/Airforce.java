package Patterns.Composite.Component;

import java.util.ArrayList;
import java.util.Iterator;

import Patterns.Composite.IAlliance;

public class Airforce implements IAlliance{


    ArrayList<IAlliance> planes = new ArrayList<>();
 
    public void add(IAlliance alliancePart) {
        planes.add(alliancePart);
    }

    @Override
    public int getPersonnel() {
 
        // We iterator over the entire air force which can
        // contain leaf nodes (planes) or other composites
        // (air forces). This iteration is an example of an
        // internal iterator.
        Iterator<IAlliance> itr = planes.iterator();
        int staff = 0;
 
        while (itr.hasNext()) {
            staff += itr.next().getPersonnel();
        }
 
        return staff;
    }
}