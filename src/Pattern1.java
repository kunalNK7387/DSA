import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class Pattern1 {
    void main() {
        //Pattern1 Square
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print("* ");};
//            System.out.println();
//        };

        //Pattern2 rectangle
//        for(int i=1;i<=3;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print("* ");};
//            System.out.println();
//        };
//    };

        //Pattern3 left side right angle tra
//    for(int i=1;i<=4;i++){
//        for(int j=1;j<=i;j++){
//            System.out.print("* ");};
//        System.out.println();
//    };

        //Pattern4 parralogram
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5-i;j++){
//                System.out.print(" ");
//
//            };
//            for(int j=1;j<=5;j++){
//                System.out.print("* ");
//            };
//            System.out.println();
//        };

        //pattern5 left side right angle inverted tra
//        for(int i=1 ;i<=5;i++){
//            for(int j=1;j<=5-i+1;j++){
//                System.out.print("* ");
//            };
//            System.out.println();
//        };

        // Pattert6 ppraymid
//        for(int i=1 ;i<=4;i++){
//            for(int j=1;j<=4-i;j++){
//                System.out.print("  ");
//            };
//
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("* ");
//            };
//
//            System.out.println();
//        };
//pattern 6+7=diamond
//        // Pattert7 inverted praymid
//        for(int i=1 ;i<=4;i++){
//            if(i==1){
//                continue;
//            }
//            for(int j=1;j<= i-1 ;j++){
//                System.out.print("  ");
//            };
//
//            for(int j=1;j<=2*4-2*i+1;j++){
//                System.out.print("* ");
//            };
//
//            System.out.println();
//        };

//        // Pattert8 hallow square
//        for(int i=1 ;i<=4;i++){
//            for(int j=1;j<=6;j++){
//                if(i==1 || i==4){
//                System.out.print("* ");
//                }else{
//                    if(j==1){
//                        System.out.print("* ");
//                    } else if (j==6) {
//                        System.out.print("* ");
//                    }else {
//                        System.out.print("  ");
//                    }
//                }
//            };
//            System.out.println();
//        };

//        // Pattert9 hallow right angle tra
//        for(int i=1 ;i<=5;i++){
//            if(i==1 || i==2 || i== 5){
//                for(int j=1;j<=i;j++){
//                    System.out.print("* ");
//                };
//            }else{
//                System.out.print("* ");
//                for (int j=1;j<=(i-2);j++){
//                    System.out.print("_");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        };

        // Pattert9 hallow praymid
//        int n=4;
//        for(int i=1;i<=n;i++){
//
//            for(int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            if(i==1 /*|| i==4*/ ){
//                for(int j=1;j<=2*i-1;j++){
//                    System.out.print("* ");
//                };
//            }else{
//                System.out.print("* ");
//                for (int j=1;j<=2*i-3;j++ ){
//                    System.out.print("  ");
//                }
//
//                    System.out.print("* ");
//            };
//            System.out.println();
//        };
//pattern 9+10 =hallow diamond
        //Pattert10 hallow inverted praymid
//        for(int i=1;i<= n-1;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("  ");
//            }
//            if(i==(n-1)){
//                System.out.print("* ");
//            }else {
//                System.out.print("* ");
//                for (int j=1;j<=2*(n-i)-3;j++ ){
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        };
//pattern 11
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print("  ");
//
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//
//            System.out.println();
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i + 1; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 1; j <= (i-1)*2 ; j++) {
//                System.out.print("  ");
//
//            }
//            for (int j = 1; j <= n-i+1; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }

        //Pattern12 number tra
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j );
//            }
//            System.out.println();
//        };
// pattern 13 no. count tra
//        int n = 5;
//        int count=1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(count+" " );
//                count++;
//            }
//            System.out.println();
//        };

        // Pattern 14
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                int a=j;
//                int b=('A'-1);
//                int ans=a+b;
//                char finalAns=(char)ans;
//                System.out.print(finalAns + " ");
//            }
//            System.out.println();
//        };

//Pattern 15
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                int a=n-j;
//                int b='A';
//                int ans=a+b;
//                char finalAns=(char)ans;
//                System.out.print(finalAns + " ");
//            }
//            System.out.println();
//        };

// Pattern 16
//        for(int i=1 ;i<=4;i++){
//
//            for(int j=1;j<= i-1 ;j++){
//                System.out.print("  ");
//            };
//
//            for(int j=1;j<=2*4-2*i+1;j++){
//                System.out.print("* ");
//            };
//
//            System.out.println();
//        };
//
//        for(int i=1 ;i<=4;i++){
//            if(i==1){
//                continue;
//            }
//            for(int j=1;j<=4-i;j++){
//                System.out.print("  ");
//            };
//
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("* ");
//            };
//
//            System.out.println();
//        };

//Pattern 17

//        int n=4;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print(j +" ");
//            }
//            int rowValue=i;
//            int decRowvalue=i-1;
//            for (int j=1;j<=i-1;j++){
//                if (i==1){
//                    continue;
//                }
//                System.out.print(decRowvalue + " ");
//                decRowvalue --;
//            }
//
//            System.out.println();
//        }

//Pattern 18
//
//        int n=4;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=2*i-1;j++){
//                System.out.print(i + " ");
//            }
//
//            System.out.println();
//        }

//Pattern 19
//        int n=4;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            };
//            for (int j=1;j<=i;j++){
//                int a=j;
//                int b='A' - 1 ;
//                int ans=a+b;
//                char finalAns=(char)ans;
//                System.out.print(finalAns +" ");
//            };
//            char toPrint=(char) (i+ 'A'-2 );
//            for (int j=1;j<=i-1;j++){
//                System.out.print( toPrint +" ");
//                toPrint--;
//
//            };
//
//            System.out.println();
//        };


        int n = 9;

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <=n; j++) {
                if((i+j) % 4==0 || (i==2 && j%4==0 ) ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }


    }

    ;
};