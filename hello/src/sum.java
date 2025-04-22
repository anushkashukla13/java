public class sum {
    public static void main(String[] args) {
        // int a=123;
        // int sum=0;
        // while(a!=0){
        //     sum=sum+a%10;
        //     a=a/10;
        // }
        // System.out.println(sum);

        //ARRAY
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            sum=sum+arr[i];

        }

         System.out.println(sum);
    }
    
}
