package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {
        int integer;
        if( o1.getCost() - o2.getCost() >= 1){
             integer = 1;
        } else if( o1.getCost() - o2.getCost() == 0){
            integer = 0;
        } else {
            integer = -1;
        }
        return integer;
    }
}
