second highest value:

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};

        int highest = arr[0];
        int secondHighest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] != highest) {
                secondHighest = arr[i];
            }
        }

        
            System.out.println("Second highest value is: " + secondHighest);
        }
    }
