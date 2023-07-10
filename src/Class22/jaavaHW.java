package Class22;

import java.util.Scanner;

public class jaavaHW {
    public static void main(String[] args) {
        int nums[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Duplicate Numbers Are: ");
        int dupl[] = new int[10];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    dupl[j] = nums[j];
                    for (int k = j + 1; k < nums.length; k++) {
                        if (dupl[j] == nums[k]) {
                            dupl[j] = 0;
                            dupl[k] = nums[k];
                        }
                    }
                }
            }
        }
        for (int i = 0; i < dupl.length; i++) {
            if (dupl[i] != 0) {
                System.out.println(dupl[i] + " ");
            }
        }

    }
}
//System.out.println("Duplicate Numbers Are: ");
//int dupl[] = new int[10];
//for (int i = 0; i < nums.length; i++) {
//    for (int j = i + 1; j < nums.length; j++) {
//        if (nums[i] == nums[j]) {
//            dupl[j] = nums[j];
//            for (int k = j + 1; k < nums.length; k++) {
//                if (dupl[j] == nums[k]) {
//                    dupl[j] = 0;
//                    dupl[k] = nums[k];
//                }
//            }
//        }
//    }
//}
//for (int i = 0; i < dupl.length; i++) {
//    if (dupl[i] != 0) {
//        System.out.println(dupl[i] + " ");
//    }
//}