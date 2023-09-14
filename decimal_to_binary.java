import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args){
    Scanner Sc=new Scanner (System.in);
    System.out.println("enter the decimal number");
    int decimal_num=Sc.nextInt();
    int ans=0;
    int pw=1;
    while(decimal_num>0){
        int parity=decimal_num%2;
        ans+=(parity*pw);
       // binary_num/=10;
        pw*=10;
        decimal_num/=2;
    }
    System.out.println(ans);
}
}
