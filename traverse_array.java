import java.util.Scanner;

class printer{
    int target(){
        Scanner Sc=new Scanner (System.in);
        System.out.println("enter the target element");
        int target=Sc.nextInt();
        return target;
    }
    void printing(int ages[]){    ////print 1d array
        int n=ages.length;
        for(int i=0;i<n;i++){
            System.out.println(ages[i]);
        }
    }
    void array2d(int array[][]){
        int n=array.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.println(array[i][j]);
            }
        }

    }
    void sum(int ages[]){
        int n=ages.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=+ages[i];
        }
        System.out.println(sum);
    }
    void max_value(int ages[]){
        int max_value=ages[0];
        int n=ages.length;
        for(int i=1;i<n;i++){
            if(ages[i]>max_value){
                max_value=ages[i];
            }
        }
        System.out.println(max_value);
    }
    int search_element(int ages[],int target) {
        target = 74;
        int index = -1;
        int n = ages.length;
        for (int i = 0; i < n; i++) {
            if (ages[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }
    int count_element(int ages[],int target){
        int n=ages.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(ages[i]==target){
                count++;
            }
        }
        return count;
    }
    int last_occurence(int ages[],int target){
        int n=ages.length;
        int index=-1;
        for(int i=0;i<n;i++){
            if(ages[i]==target){
                index=i;
            }
        }
        System.out.println("last occurence of "+target+" is "+index);
        return index;
    }
//    int smallest_and_largest(int[] ages){
//        int array=new int(2);
//        ages.Sort(int[ages]);
//        int n=ages.length;
//        array ans[]={ages[0],ages[n-1]};
//    }
    int double_sum(int ages[],int target){
        int n=ages.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ages[i]+ages[j]==target) {
                    count++;
                }
            }
        }
        return count;
    }
    int triplet_sum(int ages[],int target){
        int n=ages.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(ages[i]+ages[j]+ages[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    int single_element(int ages[]) {
        //int result = 0;
        int n = ages.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ages[i] == ages[j]) {
                    ages[i] =-1;
                    ages[j] =-1;
                }
            }
        }
        int result=0;
        for (int i = 0; i < n; i++) {
            if (ages[i] > 0) {
                result = i;
            }
        }
        return result;
    }
//        obj.print_single_element(ages[]);
//        //return ages[];
//        int print_single_element(int ages[]){
//                int n=ages.length;
//                for(int i=0;i<n;i++){
//                    if(ages[i]>0){
//                        int ans=i;
//                }
//            }
//        }
//        return ans;
//    }
//    int print_single_element(int ages[]){
//        int n=ages.length;
//        for(int i=0;i<n;i++){
//            if(ages[i]>0){
//                int ans=i;
//            }
//        }
//        return ans;
//    }
}
public class traverse_array {
    public static void main(String[] args) {
        printer obj=new printer();
       // int[]ages=new int[3];
       // int[]ages={5,6,1,7,3,8,12,74};
        //int[][]array={{4,5,6},{7,8,9}};


        Scanner Sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=Sc.nextInt();
        int ages[]=new int[n];
        //int array=new int(2);
        System.out.println("enter the element");
        for(int i=0;i<n;i++){
            ages[i]=Sc.nextInt();
        }
//        System.out.println("enter the target element");
//        int target=Sc.nextInt();
        //int target=8;
        //obj.printing(ages);
        //obj.array2d(array);
        //obj.sum(ages);
        //obj.max_value(ages);
        //System.out.println(obj.search_element(ages,target));
        //System.out.println(obj.count_element(ages,target));
        //System.out.println(obj.last_occurence(ages,target));
        //obj.smallest_and_largest(ages);
        //System.out.println("total number of pair is "+obj.double_sum(ages,target));
        //System.out.println("total number of triplet is "+obj.triplet_sum(ages,target));
        //System.out.println("single element is"+obj.single_element(ages));

    }
}
