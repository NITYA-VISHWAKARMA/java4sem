public class lec5 {
    static void count(int[] arr, int i, int sum, int k, int size, int [] ans ){
        if (i==arr.length) {
            if (sum==k) {
                for(int j=0;j<size;j++)
                {
                    System.out.println(ans[j] + " ");
                }
                System.out.println();
            }
            return;
        }
        ans[size] = arr[i];
        count(arr, i+1, sum+arr[i], k, ans,size+1);
        count(arr, i+1, sum, k, ans, size);
    }
    public static void main(String[] args) {
        int[] ar = {1,2,1};
        int k = 2;
        int i = 0;
        int sum = 0;
        int [] ans =new int[ar.length];
        int size = 0;
        count(arr,0, sum,k, ans,size); 



    }
    
}
