import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of an array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        
        System.out.println("enter the elements of array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]= in.nextInt();
            sum+=arr[i];
        }
        // for(int i=0 ; i<n ;i++)
        // {
        //     System.out.println(arr[i]);
        // }
        // System.out.println(sum);
        // reverse

        // for(int i=n-1 ; i>=0 ;i--)
        // {
        //     System.out.println(arr[i]);
        // }

        // int[] temp = new int[n];
        // int j =0;
        //  for(int i=n-1 ; i>=0 ;i--)
        // {
        //     temp[j] = arr[i];
        //     j++;
        // }
        // System.out.println();
        // for(int i=0 ; i<n ;i++)
        // {
        //     System.out.println(temp[i]);
        // }

        
    } 
}