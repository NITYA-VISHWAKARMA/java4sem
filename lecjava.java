import java.util.Scanner;

// public class lecjava {
//     public static void main(String[] args) {
//     // int count = frequencycount(int n , int d);
//     int result = decimaltobinary(n,d)

//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int d = sc.nextInt();
    // System.out.println(a+b);
//     int arr[] = new int[6];
//     arr[0] = 1;
//     arr[1] = 2;
//     arr[2] = 3;
//     arr[3] = 4;
//     arr[4] = 5;
//     arr[5] = 6;
//     int n = arr.length;
//     int num = 6;
//     int count = 0;
//     for (int i=0;i<n;i++){
//         if(arr[i]==num){
//             count++;
//         }
//     }
//         System.out.println(count);
    
// public static int frequencycount(int n,int d) {
//     int count= 0;
//     while (n > 0) {
//         int rem = n%10;
//         if(rem==d){
//             count++;
//         }
//         n = n/10;
//         return count;
//     }



// }
public class lecjava {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // int d = sc.nextInt();
    // int count = frequencycount(int n , int d);
    int result = decimaltobinary(n);
    System.out.println(result);
    }


public static int decimaltobinary(int n){
int ans = 0, pos=1;
while(n>0){
    int rem = n%2;
    ans+=rem*pos;
    pos*=10;
    n=n/2;
}
return ans;

}





}

// init-used to create anew git repo
// git init
// git remote add origin-<-link->
// git remote -v  (to verify remote)
// git branch     (to check branch)
// git branch -m main ( to rename branch)
// git push origin main




  




    
