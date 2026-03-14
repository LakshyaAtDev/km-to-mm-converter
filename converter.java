package company;
import java.util.Scanner;
public class converter {
    static void main() {
        System.out.println("km to mm converter");
        System.out.println("Enter your number below (not write kilometer,only number) which you want to convert into mili meter");
        Scanner ab=new Scanner(System.in);
        int a=ab.nextInt();
        int mm=a*1000000;
        System.out.println(a+"km = "+mm+"mm");

    }
}
