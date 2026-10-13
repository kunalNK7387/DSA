package ArrayProblem;

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
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            max=Math.max(arr[i],max);
        }
        return max;
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
        int arr[]={1,2,3,4};
        System.out.println(getMaximum(arr));
    }
}