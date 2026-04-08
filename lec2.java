import java.util.Scanner;

// sum of diagonal

public class lec2{
public static void main(String[] args){
    int[][] arr = {{1,2,3}, {4,5,6,} , {7,8,9,}};
//     int sum = 0;
//     for (int i=0;i<arr.length;i++)
//     {
//         sum = sum + arr[i][i];
//     }
//     System.out.println(sum);
 
// int[][] transpose = new int [3][3];
//         for (int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//             transpose[j][i] =   arr[i][j];
//            }
//         }
//         for (int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//             transpose[j][i] =   arr[i][j];
//            }
//         }
//         for (int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//             transpose[j][i] =   arr[i][j];
//            }
//         }
//         for (int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//         System.out.println(transpose[j][i] + " ");
//            }
//            System.out.println();
// }
// int top = 0;
// int bottom =arr.length-1;
// int left = 0;
// int right = arr[0].length-1;

// while (top<=bottom && left<=right) {
//     for(int i=left;i<=right;i++){
//         System.out.println(arr[top][i] + " ");
//     }
//     top++;

//     // step  -2 top to bottom
//     for (int i=top; i<= bottom; i++)
//     {
//         System.out.println(arr[right][i] + " ");
//     }
//     right--;

//     // step -3 right to left
//     if(top<=bottom)
//     {
//         for(int i=right;i>=left;i--){
//             System.out.println(arr[bottom][i] + " ");
//         }
//         bottom--;
//     }
//     // step -4 bottom to top
//     if(left<=right)
//     {
//         for(int i=bottom;i>=top;i--){
//             System.out.println(arr[left][i] + " ");
//         }
//         left++;    
//     }

    
// }
// }
// }





// String = collection of characters
// immulated = change nhi hota once it will done then we cnnot change

// String str1 = "hello";   
// System.out.println(str1);
// String str2 = new String("hi");

// System.out.println(str2);
// System.out.println(str1.length());
// System.out.println(str1.charAt(1));
// System.out.println(str1.substring(0,3));
// System.out.println(str1.equals(str2));
// System.out.println(str1.toUpperCase());
// System.out.println(str1.toLowerCase());
// System.out.println(str1.contains("hello"));
// System.out.println(str1.replace('1' , '2'));
// String str3 = str1.concat("world");
// System.out.println(str3);
// String str = "name";
// String rev = " ";
// for (int i=str.length()-1;i>=0;i--){
//      rev = rev + str.charAt(i);
// } 
// System.out.println("reversed string:" + rev);
// }
// }