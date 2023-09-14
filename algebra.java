import java.util.Scanner;
class algebra1 {
    int add(int a,int b){
        int ans=a+b;
        return ans;
    }
}
public class algebra{
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        algebra1 obj=new algebra1();
        //int y=Sc.nextInt();
       // Scanner Sc=new Scanner(System.in);
        System.out.println("enter first number");
        int x=Sc.nextInt();
        System.out.println("enter second number");
        int y=Sc.nextInt();
        System.out.println("sum of input number is");
        int ans=obj.add(x,y);
        System.out.println(ans);
    }
}