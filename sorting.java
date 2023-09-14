public class sorting {
    void printarray(int arr[]) {
        System.out.println("sorted array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void bubble_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printarray(arr);
    }

    void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        printarray(arr);
    }

    void insertion_sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        printarray(arr);
    }

    void move_zero_to_end(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printarray(arr);
    }

    void lexicographical(String[] lexo) {
        for (int i = 0; i < lexo.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < lexo.length; j++) {
                if (lexo[j].compareTo(lexo[min_index]) < 0) {
                    min_index = j;
                }
            }
            String temp = lexo[i];
            lexo[i] = lexo[min_index];
            lexo[min_index] = temp;
        }
        for (int i = 0; i < lexo.length; i++) {
            System.out.println(lexo[i]);
        }
    }

    void merge_sort(int []arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        merge_sort(arr, l, mid);
        merge_sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    void merge(int []arr, int l, int mid, int r) {
        int i,j,k;
        //int[] ans = new int[];
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int []left = new int[n1];
        int []right = new int[n2];
        for (i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = l;
        while (i<n1 && j<n2) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
    void swap(int []arr,int start,int piviot_index){
        int temp=arr[start];
        arr[start]=arr[piviot_index];
        arr[piviot_index]=temp;
    }
    int partition(int []arr,int start,int end){
        int piviot=arr[start];
        int count=0;
        for(int i=start+1;i<arr.length;i++){
            if(arr[i]<piviot){
                count++;
            }
        }
        int piviot_index=start+count;
        swap(arr,start,piviot_index);
        while(start<piviot_index && end>piviot_index){
            while(start<piviot_index){
                start++;
            }
            while (end>piviot_index){
                end--;
            }
            if(start<piviot_index && end>piviot_index){
                swap(arr,start,end);
            }
        }
        return piviot_index;
    }
    void quick_sort(int []arr,int start,int end){
        if(start>=end){
            return;
        }
        int pi=partition(arr,start,end);
        quick_sort(arr,start,pi-1);
        quick_sort(arr,pi+1,end);
    }
    public static void main(String[] args) {
        int []arr={5,4,3,2,1,0};
        //String []lexo={"rishabh","ashmitha","hemant","alka"};
        sorting obj=new sorting();
        //obj.bubble_sort(arr);
        //obj.selection_sort(arr);
        //obj.insertion_sort(arr);
        //obj.move_zero_to_end(arr);
        //obj.lexicographical(lexo);
        //obj.merge_sort(arr,0,arr.length-1);obj.printarray(arr);
        //obj.quick_sort(arr,0,arr.length-1);obj.printarray(arr);

    }
}
