package ArrayProblem;

import java.sql.SQLOutput;
import java.util.Arrays;
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

    //Shift Element by the K Element
    static void shiftElementByK(int[] arr){
        int n= arr.length;
        int[] temp=new int[2];
        temp[0]=arr[n-1];
        temp[1]=arr[n-2];
        for(int i=n-1;i>1;i--){
            arr[i]=arr[i-2];
        }
        arr[0]=temp[1];
        arr[1]=temp[0];
    }
    //Union in two array
    static void unionElement(int[] arr, int[] brr) {

        // Print unique elements from the first array
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(arr[i]);
            }
        }
        // Print elements from the second array that are not already present
        for (int j = 0; j < brr.length; j++) {
            boolean found = false;
            // Check the first array
            for (int i = 0; i < arr.length; i++) {
                if (brr[j] == arr[i]) {
                    found = true;
                    break;
                }
            }
            // Check previous elements of the second array
            for (int k = 0; k < j && !found; k++) {
                if (brr[j] == brr[k]) {
                    found = true;
                }
            }
            if (!found) {
                System.out.println(brr[j]);
            }
        }
    }

    //Sort The array by the 0's and 1's left side all zero and right side all one
    static int[] sortArray(int[] arr){
        int n= arr.length;
        int i=0;
        int j=n-1;

        while (i<j){
            if(arr[i]==1 && arr[j]==0){
                //swap taking basic swap i dont need of 3 step swap
                //int temp=arr[i];
                arr[i]=0;
                arr[j]=1;

            }
            if(arr[i]==0){
                // move i forward
                i++;
            }
            if(arr[j]==1){
                //move j backword decrement
                j--;
            }
        }
        return arr;

    }

    //Find the unique
        public int singleNumber(int[] nums) {
            int xorSum = 0;

            for (int n : nums) {
                xorSum = xorSum ^ n;
            }

            return xorSum;
        }

        //sort the 0's ,1's And 2's

            public void sortColors(int[] nums) {
                int n = nums.length;
                int i=0;

                int count0 = 0;
                int count1 = 0;
                int count2 = 0;

                for(int num:nums){
                    if(num==0){
                        count0++;
                    }
                    if(num==1){
                        count1++;
                    }
                    if(num==2){
                        count2++;
                    }
                }

                for(int k=0;k<count0;k++){
                    nums[i]=0;
                    i++;
                }
                for(int k=0;k<count1;k++){
                    nums[i]=1;
                    i++;
                }
                for(int k=0;k<count2;k++){
                    nums[i]=2;
                    i++;
                }
            }

            //Two Sum

                public int[] twoSum(int[] nums, int target) {
                    int n= nums.length;
                    for(int i=0;i<n-1;i++){
                        for(int j=i+1;j<=n-1;j++){
                            if(nums[i]+nums[j]== target){
                                int ans[]={i,j};
                                return ans;
                            }
                        }
                    }
                    int ans[]={};
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

        // Print Higest And Lowest Frequency
//        int[] arr = {1, 2, 3, 2, 4, 2, 5, 3};
//        int ans[] = getHigestLowestFreq(arr);
//        System.out.println("highest "+ ans[0]);
//        System.out.println("lowest " + ans[1]);

        //Shift Element by one position
//        int arr[]={1,2,3,4,5,6};
//        shiftElementByK(arr);
//        for(int a:arr){
//            System.out.println(a+" ");
//        }
//        System.out.println();

        //Get Union
//        int[] arr={1,2,3,4};
//        int[] brr={6,1,2,7};
//
//        unionElement(arr, brr);

        //short 1 and 0
        int [] arr={1,0,1,0,1,1};
        sortArray(arr);
        System.out.println(Arrays.toString(arr) );
    }
}
