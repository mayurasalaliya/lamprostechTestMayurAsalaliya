import java.util.*;

public class MergeSort {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        //taking length of num1
        System.out.print("Enter length of num1 : ");
        int m = scan.nextInt();
        
        int[] num1 = new int[m];

        //taking element of num1
        for(int i=0; i<m; i++)
        {
            System.out.print("Enter num1["+i+"] : ");
            num1[i] = scan.nextInt();
        }

        //taking length of num2
        System.out.print("Enter length of num2 : ");
        int n = scan.nextInt();
        
        int[] num2 = new int[n];

        //taking element of num2
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter num1["+i+"] : ");
            num2[i] = scan.nextInt();
        }

        int i = 0, j = 0, k = 0;

        int[] merge = new int[m+n];

        //comparing both array element one by one
        while (i < m && j < n) {
            if (num1[i] < num2[j])
               merge[k++] = num1[i++];
            else
               merge[k++] = num2[j++];
         }
         
         while (i < m)
            merge[k++] = num1[i++];
         
         while (j < n)
            merge[k++] = num2[j++];

        System.out.print("Output :[");    
        
        for(i=0;i<merge.length;i++)
        {
            System.out.print(merge[i]);
            if(i != merge.length)
                System.out.print(",");
        }
        
        System.out.print("]");
    }
}
