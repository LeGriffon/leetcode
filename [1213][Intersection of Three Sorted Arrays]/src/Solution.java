import java.util.*;

class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> list = new ArrayList<>();
        int ptr1 = 0, ptr2 = 0, ptr3 = 0;
        while(ptr1 < arr1.length && ptr2 < arr2.length && ptr3 < arr3.length) {
            if(arr1[ptr1] == arr2[ptr2] && arr2[ptr2] == arr3[ptr3]) {
                list.add(arr1[ptr1]);
                ptr1++;
                ptr2++;
                ptr3++;
            }
            else {
                if(arr1[ptr1] < arr2[ptr2]) {
                    ptr1++;
                }
                else if(arr2[ptr2] < arr3[ptr3]) {
                    ptr2++;
                }
                else {
                    ptr3++;
                }
            }
        }
        return list;
    }
}