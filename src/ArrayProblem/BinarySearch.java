package ArrayProblem;

public class BinarySearch {

    static int getLowerBound(int[] arr,int target){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=n;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]>=target){
                ans=mid;

                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }

    //Upper Bound
    static int getUpperBound(int [] arr,int target){
        int n= arr.length;
        int s=0;
        int e=n-1;
        int ans=n;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]<=target){
                s=mid+1;
            }else {
                ans = mid;
                //move to left
                e=mid-1;
            }
        }
        return ans;
    }
   static int countFreq(int[] arr, int target) {
        // code here
        int lbIndex=getLowerBound(arr,target);
        int ubIndex=getUpperBound(arr,target);
        int ans=ubIndex-lbIndex;
        return ans;

    }

    //Find the Pivot index of a Roadated array
    static int findPivotIndex(int[] arr){
        int n= arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        if(arr[s]<arr[e]){
            return -1;
        }
        //binary searc logic
        while (s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<=arr[n-1]){
                //we are on L2 Line
                //answer is on L1 line
                //move to left
                e=mid-1;
            }else {
                ans=mid;
                s=mid+1;
            }
        }
        return ans;
    }
    class Solution {
        public int mySqrt(int x) {
            int start = 0;
            int end = x;
            int ans = 0;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (mid <= x / mid && mid != 0) {
                    ans = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            return ans;
        }
    }

    static void main(){
          //lowerBound
//        int arr[]={10,20,30,30,30,30,30,40,50};
//        int target=30;
//        int ans=getLowerBound(arr,target);
//        System.out.println("Ans: "+ans);

        //UpperBound
//        int arr[]={10,20,30,30,30,30,30,40,50};
//        int target=25;
//        int ans=getUpperBound(arr,target);
//        System.out.println("Ans: "+ans);

        //Total Number of Occurenace
//        int arr[]={10,20,30,30,30,30,30,40,50};
//        int target=30;
//        int ans= countFreq(arr,target);
//        System.out.println("Ans: "+ans);

        //Find the Pivot index of a Roadated array
        int arr[]={4,5,6,7,0,1,2};
        int ans= findPivotIndex(arr);
        System.out.println("Ans: "+ans);
    }
}
