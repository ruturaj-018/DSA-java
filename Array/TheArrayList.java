package Array;

import java.util.ArrayList;
    public class TheArrayList {

        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>(8);

            list.add("Prithviraj");
            list.add("Darshan");
            list.add("Sammed");
            list.add("Sanskar");
            list.add("Vishwesh");
            list.add("Appaso");
            list.add("Babasaheb");
            list.add("Bhushan");
            list.add("Nikhil");
            list.add("Shrut");
            list.add("Meeth");

            System.out.println("ArrayList Elements:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println("[" + i + "] " + list.get(i));
            }
            System.out.println("Size of list: " + list.size() + "\n");

            int insertIndex = 5;
            String insertName = "Sammed";
            if (insertIndex >= 0 && insertIndex <= list.size()) {
                list.add(insertIndex, insertName);
                System.out.println("Inserted '" + insertName + "' at index " + insertIndex);
            } else {
                System.out.println("Invalid index for insertion.");
            }

            int updateIndex = 2;
            String newName = "Ruturaj";
            if (updateIndex >= 0 && updateIndex < list.size()) {
                String old = list.get(updateIndex);
                list.set(updateIndex, newName);
                System.out.println("Updated '" + old + "' to '" + newName + "' at index " + updateIndex);
            } else {
                System.out.println("Invalid index for update.");
            }

            int deleteIndex = 7;
            if (deleteIndex >= 0 && deleteIndex < list.size()) {
                String removed = list.remove(deleteIndex);
                System.out.println("Deleted '" + removed + "' from index " + deleteIndex);
            } else {
                System.out.println("Invalid index for deletion.");
            }

            String searchName = "Bhushan";
            if (list.contains(searchName)) {
                int index = list.indexOf(searchName);
                System.out.println("'" + searchName + "' found at index " + index);
            } else {
                System.out.println("'" + searchName + "' not found in the list.");
            }

            System.out.println("\nFinal ArrayList:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println("[" + i + "] " + list.get(i));
            }
            System.out.println("Size of list: " + list.size());
        }
    }

