import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int count = 0;
        for (int i = 0; i < list.size(); i++){
            int index = list.get(i);
            if (index % 2 != 0){ count++; }
        }
        return count;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for (int i = 0; i < list1.size(); i++){
            for (int j = 0; j < list2.size(); j++){
                int index = list1.get(i);
                int index2 = list2.get(j);
                if (index == index2) { return true; }
        }
    }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> fromArray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            fromArray.add(arr[i]);
        }
        return fromArray;
    }


    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        testList.add(7);
        testList.add(10);
        testList.add(34);
        testList.add(23);
        testList.add(9);
        ArrayList<Integer> testList2 = new ArrayList<Integer>();
        testList2.add(90);
        testList2.add(105);
        testList2.add(78);
        testList2.add(46);
        testList2.add(7);
        int[] arr = {5, 4, 3, 2, 1}; 

        System.out.println(countOdd(testList));
        System.out.println(countOdd(testList2));
        System.out.println(checkDuplicates(testList, testList2));
        System.out.println(convertToArrayList(arr));
    }
}
