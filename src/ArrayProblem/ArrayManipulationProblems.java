package ArrayProblem;

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
    static void main() {
        int arr[]={1,2,3,4};
        reverseArray(arr);
    }
}
