import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class recursion {
    void print_natural_1_to_n(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        else{
            print_natural_1_to_n(n-1);
            System.out.println(n);
        }
    }
    void print_natural_n_to_1(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        else{
            //print_natural_n_to_1(n-1);
            System.out.println(n);
            print_natural_n_to_1(n-1);
        }
    }
    int factorial(int n){
        if(n==1){
            return n;
        }
        else{
            return n*factorial(n-1);
        }
    }
    int fibonachi(int n){
        if(n==0||n==1){
            return n;
        }
        else{
            return fibonachi(n-1)+fibonachi(n-2);
        }
    }
    int sum_of_digit(int n){
        if(n>=0&&n<=9){
            return n;
        }
        else{
            return sum_of_digit(n/10)+n%10;
        }
    }
    int power(int p,int q){
        if(q==0){
            return 1;
        }
        else{
            return p*power(p,q-1);
        }
    }
    void multiple_of_num(int p,int q){
        if(q==0){
            return ;
        }
        else{
            multiple_of_num(p,q-1);
            System.out.println(p+"*"+q+"="+p*q);
        }
    }
    static int sum_of_natural_number_with_alternative_sign(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return(sum_of_natural_number_with_alternative_sign(n-1))-n;
        }
        if(n%2==1){
            return(sum_of_natural_number_with_alternative_sign(n-1))+n;
        }
        return n;
    }
    void print_array(int arr[],int idx){
        if(idx==arr.length){
            System.out.println("are element of array ");
            return;
        }
        else{
            System.out.print(arr[idx]+" ");
            print_array(arr,idx+1);
        }
    }
    int max_value(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        else{
            int ans=max_value(arr,idx+1);
            return (Math.max(arr[idx],ans));
        }
    }
    static int sum_of_array(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        else{
            return(sum_of_array(arr,idx+1)+arr[idx]);

        }
    }
    boolean target_exist_or_not(int arr[],int n,int target,int idx){
        if(idx>=n){
            return false;
        }
        if(idx==target){
            return true;
        }
        return target_exist_or_not(arr,n,target,idx+1);
    }
    String remove_occurence_of_element(String name,int idx){
        if(idx==name.length()){
            return " ";
        }
        else{
            String ans=remove_occurence_of_element(name,idx+1);
            char currchar=name.charAt(idx);
            if(currchar!='a'){
                return currchar+ans;
            }
            else{
                return ans;
            }
        }
    }
    String reverse_of_string(String name,int idx){
        if(name.length()==idx){
            return "";
        }
        else{
            String ans =reverse_of_string(name,idx+1);
            char element=name.charAt(idx);
            String result=ans+element;
            return result;
        }
    }
    String palindrome(String name,int idx){
        if(name.length()==idx){
            return "";
        }
        else{
            String ans =reverse_of_string(name,idx+1);
            char element=name.charAt(idx);
            String result=ans+element;
            return result;
        }
    }
    void subsequent(String name,String currans){
        if(name.length()==0){
            System.out.println(currans);
            return;
        }
        else{
            char curr=name.charAt(0);
            String remstring=name.substring(1);
            subsequent(remstring,currans+curr);
            subsequent(remstring,currans);
        }
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
//        System.out.println("enter natural number");
//        int n=Sc.nextInt();
//        System.out.println("enter base");
//        int p=Sc.nextInt();
//        System.out.println("enter power");
//        int q=Sc.nextInt();
//        int []array=new int[n];
//        System.out.println("enter the element");
//        for(int i=0;i<n;i++){
//            array[i]=Sc.nextInt();
//        }
//        System.out.println("enter target element");
//        int t=Sc.nextInt();
        System.out.println("enter the name");
        String name=Sc.next();
        //String element=Sc.next();
        recursion obj=new recursion();
        //obj.print_natural_1_to_n(n);
        //obj.print_natural_n_to_1(n);
        //System.out.println(obj.factorial(n));
        //System.out.println(obj.fibonachi(n));
        //System.out.println(obj.sum_of_digit(n));
        //System.out.println(obj.power(p,q));
        //obj.multiple_of_num(p,q);
        //System.out.println(obj.sum_of_natural_number_with_alternative_sign(n));
        //obj.print_array(array,0);
        //System.out.println(obj.max_value(array,0));
        //System.out.println(sum_of_array(array,0));
        //if(obj.target_exist_or_not(array,n,t,0))System.out.println("yes");System.out.println("no");
        //System.out.println(obj.remove_occurence_of_element(name,0));
        //System.out.println(obj.reverse_of_string(name,0));
//        if((obj.palindrome(name,0))equals(name));System.out.println("yes it is palindrome");
//        System.out.println("no it is not a palindrome");
//        if(obj.palindrome(name,0).equals(name)){
//            System.out.println("yes it is palindrome");
//        }
//        else{
//            System.out.println("no it is not a palindrome");
//        }
        //obj.subsequent(name,"");
    }
}
