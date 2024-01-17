import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ArrayColl {
    public static void main(String[] args) {
        // Methods

        int[] array = { 12, 3, 65, 4 };
        int[] array2 = { 12, 3, 65, 4 };
        int[] array3 = { 12, 3, 65, 4 };

        Arrays.sort(array); // {3,4,12,65}
        Arrays.sort(array, 2, 3); // {12, 3, 4, 65}

        System.out.println(Arrays.binarySearch(array, 2)); // -1 TODO: array should be sorted order!
        System.out.println(Arrays.equals(array3, array2)); // true TODO: comparison on value

        System.out.println(Arrays.copyOf(array, 11)); // { 12, 3, 65, 4, 11 }
        Arrays.fill(array, 11); // { 11, 11, 11, 11, 11 }

        int newArr[] = new int[5]; // { 0, 0, 0, 0, 0,}
        Arrays.fill(newArr, 11); // { 11, 11, 11, 11, 11 }

        int copyArray[] = Arrays.copyOf(newArr, newArr.length); // { 11, 11, 11, 11, 11 }
        System.out.println(copyArray);

        // Array List

        ArrayList<String> list = new ArrayList<String>();
        list.add("car");
        list.add("bike");
        list.add("motorbike"); // [car, bike, motorbike]

        Collections.sort(list); // [bike, car, motorbike]

        list.set(2, "horse carriage");
        list.get(2); // horse carriage

        System.out.println(list.get(2));

        list.size(); // 3
        list.remove(2); // [car, bike]
        list.remove("car"); // [bike]

        // Array List iterating

        list.add("bike");
        list.add("motorbike");

        // 1.
        Iterator<String> vehicleIterator = list.iterator();

        while (vehicleIterator.hasNext()) {
            System.out.println(vehicleIterator.next());
        }

        // 2.
        for (String vehicle : list) {
            System.out.println(vehicle);
        }

        // Linked List

        LinkedList<String> lList = new LinkedList<String>();
        lList.add("blue");

        lList.add("green"); // [blue, green] (return true/false)
        lList.add(1, "yellow"); // [blue, yellow, green]
        lList.addFirst("brown"); // [brown, blue, yellow, green]
        lList.addLast("black"); // [brown, blue, yellow, green, black]

        LinkedList<String> lListClone = new LinkedList<String>();
        lListClone = (LinkedList<String>) lList.clone();

        lListClone.removeFirst(); // [blue, yellow, green, black] (return "brown")
        lListClone.removeLast(); // [blue, yellow, green] (return "black")
        lListClone.remove(2); // [blue, yellow] (return "green")
        lListClone.clear(); // []

        System.out.println(lList.get(2)); // yellow
        System.out.println(lList.getFirst()); // brown
        System.out.println(lList.getLast()); // black

        System.out.println(lList.set(3, "purple")); // [brown, blue, yellow, purple, black] (return "green")
        System.out.println(lList.size()); // 5

        System.out.println(lList.indexOf("yellow"));// 2 (return -1 if no found)

        lList.add("blue");
        System.out.println(lList.lastIndexOf("blue"));// 5 (return -1 if no found)

        // Vector class (vector in synchronized)

        Vector<String> floatVector = new Vector<String>();

        floatVector.add("2");
        floatVector.add("5");
        floatVector.add("212");
        floatVector.remove(1); // (returned 5)
        floatVector.clear(); //
        floatVector.add("5");
        floatVector.add("212");
        floatVector.add("17");
        floatVector.add(1, "12");
        floatVector.remove(1); // (returned 212)
        floatVector.remove("12"); // (returned bool)
        floatVector.set(2, "77");
        System.out.println(floatVector.get(2)); // 77
        System.out.println(floatVector.size()); // 3
        System.out.println(floatVector.contains("3")); // false
        System.out.println(floatVector.indexOf("77")); // 2

        floatVector.add("77");
        System.out.println(floatVector.lastIndexOf("77")); // 3

        // Stack class

        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.empty()); // true
        stack.add(12);
        stack.add(24);
        System.out.println(stack.peek()); // 24 (see last element)
        System.out.println(stack.pop()); // remove last element (returned 24)
        System.out.println(stack.peek()); // 12 (see last element)
        System.out.println(stack.add(33)); // (returned bool (true))
        System.out.println(stack.push(44)); // (returned 44)

        System.out.println(stack.peek()); // 44 (see last element)
        System.out.println(stack.search(44)); // 1 (or -1 if no found)

        // Hash-Map class (key-value pairs)

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        System.out.println(hashMap.size()); // 0
        hashMap.put("first", 12);
        hashMap.put("second", 33);
        hashMap.put("third", 55);
        System.out.println(hashMap.get("second")); // 33 (or -null if no found)
        System.out.println(hashMap); // {third=55, first=12, second=33}
        System.out.println(hashMap.keySet()); // (returned Set [third, first, second])
        System.out.println(hashMap.values()); // (returned [55, 12, 33])
        System.out.println(hashMap.remove("second")); // {third=55, first=12} (returned 33)

        System.out.println(hashMap.isEmpty()); // false
        System.out.println(hashMap.size()); // 2

        hashMap.clear();

    }
}
