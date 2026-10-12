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

        int n=11;
        if((n&1)==0){
            System.out.println("Even" +" "+ n);

        }else {
            System.out.println("Odd" +" "+ n);
        }
    }
}
