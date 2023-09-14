//import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;


public class Main {
    static void operation(){
        Scanner Sc=new Scanner(System.in);
        System.out.println(("enter first number"));
        int num=Sc.nextInt();
        System.out.println("enter second number");
        int num1=Sc.nextInt();
        System.out.println(num&num1);
        System.out.println(num|num1);
        System.out.println(num%num1);
    }
    static void product(){
    int i=1;
    while(i<=200){
        if(i%5==0 &i%3==0){
            System.out.println("not valid");
        }
        else{
            System.out.println(i);
        }
        i++;
    }}

    public static void main(String[] args) {
       //operation();
       //product();
        }}


