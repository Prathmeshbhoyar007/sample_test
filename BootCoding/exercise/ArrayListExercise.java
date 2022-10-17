package exercise;

import java.util.ArrayList;

public class ArrayListExercise {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList ages = new ArrayList();
        ages.add(10);
        ages.add(20);
        ages.add(30);
        ages.add(40);
        ages.add(50);

        for(int j=0; j< ages.size(); j++){
            System.out.println(ages.get(j));
        }
    }
}

// MAVEN
// Project Build Tool

