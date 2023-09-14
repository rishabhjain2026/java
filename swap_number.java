import java.util.Scanner;
public class swap_number {
    void with_third_varible(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping a= "+a);
        System.out.println("after swapping b= "+b);
    }
    void without_third_varible(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping a= "+a);
        System.out.println("after swapping b= "+b);
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=Sc.nextInt();
        System.out.println("enter second number");
        int b=Sc.nextInt();
        swap_number obj=new swap_number();
        //obj.with_third_varible(a,b);
        //obj.without_third_varible(a,b);
    }
}
