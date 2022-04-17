package FrequencyInArray;

public class Main {
    static boolean isFind(int[] list, int value) {
        for(int element : list) {
            if(element == value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequencyList = new int[list.length];
        int count = 0;
        int startIndex = 0;

        System.out.println("Repeating numbers :");
        for(int i : list) {
            if(isFind(frequencyList,i)) {
                for(int j : list) {
                    if(i == j) {
                        count++;
                        frequencyList[startIndex++] = i;
                    }
                }
                System.out.println("Number " + i + " is repeated " + count + " times");
                count = 0;
            }
        }
    }
}
