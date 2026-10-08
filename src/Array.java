import java.util.Scanner;

public class Array {
    static void main(String[] args) {
        //decalaration
//    int arr[];
//    //Allocation
//       arr=new int[5];
//       //inti
//       int brr[]={12,36,48};
//
//       System.out.println("Element of 0 index "+brr[0]);
//       System.out.println("Element of 1 index "+brr[1]);
//       System.out.println("Element of 2 index "+brr[2]);
//
//       int n= brr.length;
//       for (int index=0;index<=n-1;index++){
//           System.out.println(brr[index]);
//       }
        //for Each Loop
//       for (int val:brr){
//           System.out.println(val);
//       }

//       int arr[]=new int[5];
//       Scanner sc=new Scanner(System.in);
//       //I/p
//
//       for (int i=0;i< arr.length;i++){
//           System.out.println("Enter the Array:"+i);
//           arr[i]=sc.nextInt();
//       }
//        //o/p
//       for (int val:arr){
//           System.out.println(val);
//       }


        //ARRAY SUM
//       int arr[]=new int[4];
//       Scanner sc=new Scanner(System.in);
//       for (int i=0;i<arr.length;i++){
//           System.out.println("Enter The Number:"+i);
//           arr[i]=sc.nextInt();
//       }
//       int sum=0;
//       for (int i=0;i< arr.length;i++){
//           sum=sum+arr[i];
//       }
//       System.out.println("Total "+sum);

//       //ARRAY Product
//       int arr[]=new int[4];
//       Scanner sc=new Scanner(System.in);
//       for (int i=0;i<arr.length;i++){
//           System.out.println("Enter The Number:"+i);
//           arr[i]=sc.nextInt();
//       }
//       int product=1;
//       for (int i=0;i< arr.length;i++){
//           product=product*arr[i];
//       }
//       System.out.println("Total "+product);

//       //ARRAY MAX Element
//       int arr[]=new int[4];
//       Scanner sc=new Scanner(System.in);
//       for (int i=0;i<arr.length;i++){
//           System.out.println("Enter The Number:"+i);
//           arr[i]=sc.nextInt();
//       }
//       int max =arr[0];
//       for (int i=0;i< arr.length;i++){
//           if(max<arr[i]){
//               max=arr[i];
//           }
//       }
//       System.out.println("MAX Element "+max);

//       //ARRAY MIN Element
//       int arr[]=new int[4];
//       Scanner sc=new Scanner(System.in);
//       for (int i=0;i<arr.length;i++){
//           System.out.println("Enter The Number:"+i);
//           arr[i]=sc.nextInt();
//       }
//       int min =arr[0];
//       for (int i=0;i< arr.length;i++){
//           if(min>arr[i]){
//               min=arr[i];
//           }
//       }
//       System.out.println("MIN Element "+min);

        //2D ARRAY
//       int arr[][];
//
//       arr=new int[3][4];
//
//       int [][] brr={
//               {1,2},
//               {2,3,4,10},
//               {3,4,5},
//               {4}
//       };
////       System.out.println(brr[3][1]);
//
//       for (int i=0;i< brr.length;i++){
//           for (int j=0;j<brr[i].length;j++){
//               System.out.print(brr[i][j]+" ");
//           }
//           System.out.println();
//       }

//       int arr[][]=new int[3][4];
//       Scanner sc=new Scanner(System.in);
//       for (int i=0;i< arr.length;i++){
//           for (int j=0;j<arr[i].length;j++){
//               System.out.println("Enter Elem for Row:"+i +"And Elem for Col:"+j);
//               arr[i][j]= sc.nextInt();
//           }
//       }
//              for (int i=0;i< arr.length;i++){
//           for (int j=0;j<arr[i].length;j++){
//               System.out.print(arr[i][j]+" ");
//           }
//           System.out.println();
//       }

        //SUM
//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println("Enter Elem for Row:" + i + "And Elem for Col:" + j);
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum=sum+arr[i][j];
//            }
//        }
//        System.out.println("Total:"+ sum);

        //MAX Element
        int arr[][] = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter Elem for Row:" + i + "And Elem for Col:" + j);
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max){
                max = arr[i][j];
                }
            }
        }
        System.out.println("Total:"+ max);
    }
}
