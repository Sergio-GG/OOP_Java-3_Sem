package working;

import java.util.Comparator;

public class ClassComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getClass().toString().compareTo(o2.getClass().toString());
        }
    }

