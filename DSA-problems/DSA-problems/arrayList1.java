import java.util.*;

public class arrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Adding elements to the ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(6);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(4);
        System.out.println("Initial List: " + list);

        // Getting a particular element by index
        System.out.println("Element at index 3: " + list.get(3));

        // Modifying an element at a specific index
        list.set(3, 33); // index 2 -> value changed to 33
        System.out.println("After set at index 2: " + list);

        // Adding an element at a specific index
        list.add(2, 9); // insert 9 at index 2
        System.out.println("After inserting 9 at index 2: " + list);

        // Removing element at index 0
        list.remove(0);
        System.out.println("After removing element at index 0: " + list);

        // Number of elements in the list
        System.out.println("Size of list: " + list.size());

        // Check if a value is present
        System.out.println("List contains 9? " + list.contains(9));

        // Sorting the list in ascending order
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Max and Min elements
        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));

        // Swapping elements at indices 2 and 4
        Collections.swap(list, 2, 4);
        System.out.println("After swap at index 2 and 4: " + list);
        
        // count how many number of times particular element repeat
        System.out.println( "frequency of 4: "+ Collections.frequency(list,4));

        // Shuffling the list randomly
        Collections.shuffle(list);
        System.out.println("After shuffle: " + list);

        // checking list is empty or not befor clear
        System.out.println(list.isEmpty());

        // clearing entire list
        list.clear();

         // checking list is empty or not befor clear
        System.out.println(list.isEmpty());


        sc.close(); // Always close the scanner
    }
}
