import java.util.Objects;
import java.util.Scanner;
public class guess_the_number {
    void print_array(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
//        System.out.println();
//        System.out.println();
    }
    public static void main(String[] args) {
        guess_the_number obj=new guess_the_number();
        Scanner Sc=new Scanner(System.in);
//        int []arr_a=new int[8];
//        int []arr_b=new int[8];
//        int []arr_c=new int[8];
//        int []arr_d=new int[8];
        int []arr_1={1,3,5,7,9,11,13,15};
        int []arr_2={2,3,6,7,10,11,14,15};
        int []arr_3={4,5,6,7,12,13,14,15};
        int []arr_4={8,9,10,11,12,13,14,15};
        int result=0;
        System.out.println("guess the number game!!!   have funnn🎉🎉🎉🥳🥳🥳");
//        for(int i=1;i<5;i++){
//            int []arr_i;
        System.out.println("guess the number from 1 to 15😎😎😎");
        System.out.println("choose the list if the number you have guessed is present in it ");
        System.out.println("enter yes if present in given list");
        System.out.println("enter no if it is not present in given list");
        obj.print_array(arr_1);
        //System.out.println();
        String ans_1=Sc.next();
        if(Objects.equals(ans_1, "yes")) {
            result += arr_1[0];
            //System.out.println(result);
        }
        System.out.println();
        System.out.println("choose the list if the number you have guessed is present in it ");
        System.out.println("enter yes if present in given list");
        System.out.println("enter no if it is not present in given list");
        obj.print_array(arr_2);
        String ans_2=Sc.next();
        if(Objects.equals(ans_2,"yes")){
            result += arr_2[0];
        }
        System.out.println();
        System.out.println("choose the list if the number you have guessed is present in it ");
        System.out.println("enter yes if present in given list");
        System.out.println("enter no if it is not present in given list");
        obj.print_array(arr_3);
        String ans_3=Sc.next();
        if(Objects.equals(ans_3,"yes")){
            result += arr_3[0];
        }
        System.out.println();
        System.out.println("choose the list if the number you have guessed is present in it ");
        System.out.println("enter yes if present in given list");
        System.out.println("enter no if it is not present in given list");
        obj.print_array(arr_4);
        String ans_4=Sc.next();
        if(Objects.equals(ans_4,"yes")) {
            result += arr_4[0];
        }
        System.out.println();
        System.out.println("🥳🥳🥳your number was "+result);
        //System.out.println(result);
    }
}
