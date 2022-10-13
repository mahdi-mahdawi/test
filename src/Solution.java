/**

 Find the first non repeating integer in an array
 arr = {9,2,3,2,6,6} , result = 9
 arr = {4,5,1,2,0,4} , result = 5
 */


import java.io.*;
import java.util.*;


class Solution {
    public static void main(String[] args) {

        int[] case1 = {9,2,3,2,6,6};
        int[] case2 ={4,5,1,2,0,4};
        int[] case3 ={4,5,1,2,0,4};
        int[] case4 ={};

        System.out.println("Case 1 "  + getNonRepeatingInt(case1));
        System.out.println("Case 2 " + getNonRepeatingInt(case2));
        System.out.println("Case 3 " + getNonRepeatingInt(case3));
        System.out.println("Case 5 " + getNonRepeatingInt(case4));

    }
    static int getNonRepeatingInt(int[] arr){
        Map<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }else{
                h.put(arr[i], 1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(h.get(arr[i]) == 1){
                return arr[i];
            }
        }
        return -1;

    }
}
