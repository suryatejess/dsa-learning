package data_structures.hasht_ables.first_recurring_character;

import java.util.HashSet;

public class FirstRecurringCharacter {
    public static Integer firstRecurringCharacter(int[] array) {
        HashSet<Integer> temp = new HashSet<>();

        for(int element : array) {
            if (temp.contains(element)) {
                System.out.println(element);
                return element;
            }
            else{
                temp.add(element);
            }
        }
        System.out.println("null");
        return null;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 33, 3, 5, 6, 66, 4, 8};

        firstRecurringCharacter(array);
    }
}
