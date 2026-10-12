public class BitwiseOperator {

    static void main() {
//        int a=5;
//        int b=6;
//        System.out.println(a&b);
//        System.out.println(a|b);
//        System.out.println(a^b);
//        System.out.println(~a);

//        int n=1;
//        for (int i=1;i<=32;i++){
//            n=n << 1;
//            System.out.println(n);
//            System.out.println();
//        }
//        int n;
//        int n=100;
//        for (int i=1;i<=10;i++){
//            n = n >> 1;
//            System.out.println(n);
//            System.out.println();
//        }

//        int n=11;
//        if((n&1)==0){
//            System.out.println("Even" +" "+ n);
//
//        }else {
//            System.out.println("Odd" +" "+ n);
//        }

//        int n=7;
//        int count=0;
//        while(n !=0){
//            if((n&1)!=0){
//                // 1 set bit milegi
//                count++;
//            }
//                //right shift to remove this bit
//                n=n>>1;
//
//
//
//        }
//        System.out.println("Set bit Count: "+count  );

//        int n=31;
//        if((n&(n-1))==0){
//            System.out.println("The Number Is power of 2");
//        }else {
//            System.out.println("The Number is Not Power of 2");
//        }
//
//        int a=5;
//        int b=6;
//        a=a^b;
//        b=a^b;
//        a=a^b;
//
//        System.out.println(a);
//        System.out.println(b);

        //By removing the last set bit
//        int n=10;
//        System.out.println((n&(n-1)));
//        System.out.println((n& -(n)));

//Find unique element (all others appear twice)
//        int a=10;
//        int b=20;
//        int c=10;
//        int d=20;
//        int e=13;
//
//        int n=a^b^c^d^e;
//        System.out.println(n);

//       Check if number is power of 4
        int n = 2;

        if (n > 0 && (n & (n - 1)) == 0 && (n % 3 == 1)) {
            System.out.println("Power Of 4");
        } else {
            System.out.println("Not Power Of 4");
        }
    }
}
