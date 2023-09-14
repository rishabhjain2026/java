import java.util.Scanner;
public class binary_to_decimal {
    public static void main(String[] args){
        Scanner Sc=new Scanner (System.in);
        System.out.println("enter the binary number");
        int binary_num=Sc.nextInt();
        int ans=0;
        int pw=1;
        while(binary_num>0){
            int unit_digit=binary_num%10;
            ans+=(unit_digit*pw);
            binary_num/=10;
            pw*=2;
        }
        System.out.println(ans);
    }
}
