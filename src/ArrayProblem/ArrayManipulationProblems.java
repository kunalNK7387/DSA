package ArrayProblem;

import java.sql.SQLOutput;
import java.util.HashMap;

public class ArrayManipulationProblems {

    // Reverse Array
    static void reverseArray(int arr[]){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        for (int k:arr){
            System.out.println(k);
        }
    }

    //Shift Element by one position
    static void shiftBy1(int[] arr) {
        //Step1: Store Last index value in temp
        int n= arr.length;
        int temp = arr[n-1];
        //Step2: shift the all value by 1
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        //Step3: put the temp value in 0th index
        arr[0]=temp;

    }

    //Print Extrem Alternate Element
    static void printAlternate(int[] arr ){
        int n= arr.length;
        int i=0;
        int j=n-1; //we use all variables So SC is O(1) constant SC
        while (i<=j){ //TC O(n)
            if (i==j){
                System.out.println(arr[i]);
                return;
            }else {
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }

    //Find the mode in of an value od array
    static int findMode(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxCount = 0;
        int mode = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = map.getOrDefault(arr[i], 0) + 1;

            map.put(arr[i], count);

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        return mode;
    }

    //Print highet and lowest frqency
    static int[] getHigestLowestFreq(int[] arr){
        HashMap<Integer,Integer> map1=new HashMap<>();

        int maxCount=0;
        int minCount=0;
        int highest=arr[0];
        int lowest=arr[0];
        for(int i=0;i< arr.length;i++){
            int count =map1.getOrDefault(arr[i],0)+1;
            map1.put(arr[i],count);

            if(count>maxCount){
                maxCount=count;
                highest=arr[i];

            }
        }
        for(int i=0;i< arr.length;i++){
            int count =map1.getOrDefault(arr[i],0)+1;
            map1.put(arr[i],count);

            if(count<minCount){
                minCount=count;
                lowest=arr[i];

            }
        }

      int ans[]={highest,lowest};

      return ans;

    }

    static void main() {
//        int arr[]={1,2,3,4,5};
//        reverseArray(arr);

        //Shift Element by one position
//        int arr[]={1,2,3,4,5};
//        shiftBy1(arr);
//        for(int a:arr){
//            System.out.println(a+" ");
//        }
//        System.out.println();

        //Print Extrem Alternate Element
//        int arr[]={1,2,3,4,5};
//        printAlternate(arr);

        //Print Mode
//        int[] arr = {1, 2, 3, 2, 4, 2, 5, 3};
//        int result = findMode(arr);
//        System.out.println("Mode = " + result);

        // print Higest And Lowest Frequency
        int[] arr = {1, 2, 3, 2, 4, 2, 5, 3};
        int ans[] = getHigestLowestFreq(arr);
        System.out.println("highest "+ ans[0]);
        System.out.println("lowest " + ans[1]);
    }
}
