package ArrayProblem;

import java.util.Arrays;

public class ArrayProblems {

    static int[] multiplyBy10(int[] arr) {
        int size = arr.length;
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }//due to travsing array TC is O(n)

        return newArray;
    }

// Liner Search
    static boolean findTarget(int arr[],int target){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }

    //Maximum Number in arrray
//    static int getMaximum(int arr[]){
//        int max=arr[0];
//        for (int i=0;i< arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        return max;
//    }
    //By using Math.max()
    static int getMaximum(int arr[]){
        int max=arr[0]; //\(O(1)\)
        for(int i=0;i< arr.length;i++){
            max=Math.max(arr[i],max);
        } //\(O(n)\)
        return max;
    }

    //Return Sum of postive no.s and negetive no.s
    static int[] getSumPosNeg(int arr[]){
        int posSum=0;
        int negSum=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posSum=posSum+arr[i];
            }else {
                negSum=negSum+arr[i];
            }
        }//O(n) TC
        int ans[]={posSum,negSum}; //O(1)
        return ans;
    }

    //Return count of the 1 and 0
    static int[] getZeroOneCount(int arr[]){
        int zeroCount=0;
        int oneCount=0;
        for (int i=0;i< arr.length;i++){
            if(arr[i]==0){
                zeroCount++;
            }else {
                oneCount++;
            }
        }
        int ans[]={zeroCount,oneCount};
        return ans;
    }

    //Find the array is sorted or not  print Unsorted element in array
    static int getUnsortedElement(int arr[]){
        for (int i=0;i< arr.length;i++){
            if(arr[i+1]<=arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }

    //swap alternate elements of an arr

    static int[] getSwapArray(int[] arr){
        for (int i=0;i<arr.length; i+= 2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }


    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4};
//
//        int[] ans = multiplyBy10(arr);
//
//        System.out.println("Printing ans array:");
//
//        for (int i : ans) {
//            System.out.println(i);
//        }

        //Liner Search
//        int arr[]={1,2,3,4};
//        boolean ans=findTarget(arr,9);
//        System.out.println(ans);

        //Maximum number in array
//        int arr[]={1,2,3,4};
//        System.out.println(getMaximum(arr));

        //Return Sum of postive no.s and negetive no.s
//        int arr[]={1,-2,5,9,-5,-3};
//        int ans[]=getSumPosNeg(arr);
//        System.out.println("positive sum:"+ans[0]);
//        System.out.println("Negative sum:"+ans[1]);

        //Return count of the 1 and 0
//        int arr[]={1,1,0,1,0,0,1};
//        int ans[]=getZeroOneCount(arr);
//        System.out.println("Count of Zero:"+ans[0]);
//        System.out.println("Count of One:"+ans[1]);

        //Find the array is sorted or not & print Unsorted element in array
//        int arr[]={1,2,5,4,9};
//        System.out.println(getUnsortedElement(arr));

        //swap alternate elements of an arr
        int[] arr={1,2,3,4,5,6};
        int[] result = getSwapArray(arr);
        System.out.println(Arrays.toString(result));
    }
}