public class return_index_of_sum {
//    int[] index(int []arr, int target){
//        int first=-1;
//        int second=-1;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==target){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }
    public static void main(String[] args) {
        int []arr={2,5,11,15};
        int target=7;
        //return_index_of_sum obj=new return_index_of_sum();
        //obj.index(arr,target);
        //int[] index(int []arr, int target){
            int first=-1;
            int second=-1;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j]==target){
                        //return new int[]{i, j};
                    }
                }
            }
            //return null;
        }
    }
//class return_index_of_sum {
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) {
//                    return new int[] { i, j };
//                }
//            }
//        }
//        // In case there is no solution, we'll just return null
//        return null;
//    }
//}
//class Solution{
//    int[] index(int []num, int target){
//        for(int i=0;i<num.length;i++){
//            for(int j=i+1;j<num.length;j++){
//                if(num[i]+num[j]==target){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }
//    public int[] twoSum{int[] nums,target};{
//        //public static void main(String[] args) {
//        int[]num={2,7,11,15};
//        target=9;
//        solution obj=new solution();
//        obj.index(num,target);
//   }
////}