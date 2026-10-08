import java.util.Scanner;

public class StringDemo {
    static void printString(String str){
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            System.out.println(ch);
        }

    }
    static int getLength(String str){
        int count=0;
        char [] arr = str.toCharArray();
        int len=arr.length;
        return len;

    }
    static void main() {
        printString("Kunal");
        System.out.println(getLength("kunal"));

        String firstName = "Kunal";
        String lastName = new String("Khairnar");
        System.out.println(firstName+" "+lastName);

        System.out.println(firstName.length());
        System.out.println(firstName.charAt(3));

        Scanner sc=new Scanner(System.in);
        System.out.println("Provide the line");
        String str1=sc.nextLine();
        System.out.println(str1);
        System.out.println("Provide the line");
        String str2=sc.next();
        System.out.println(str2);

        String name="Kunal";
        char[] crr=name.toCharArray();

        for (char ch:crr){
            System.out.println("vale os char:"+ ch);
        }


    }
}
