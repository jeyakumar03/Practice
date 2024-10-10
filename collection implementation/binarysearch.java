import java.util.Scanner;
import java.util.Arrays;
class binarysearch
{
   public static void main(String[] args)
   {
      Scanner ob=new Scanner(System.in);
      System.out.println("Enter the size:");
      int n=ob.nextInt();
      System.out.println("Enter the array element:");
      int[] ar=new int[n];
      for(int i=0;i<n;i++)
      {
        ar[i]=ob.nextInt();
      }
      System.out.println("Enter the element to be searched:");
      int target=ob.nextInt();
      System.out.println(binary(ar,target));
   }
   static int  binary(int[] ar,int target)
   {
      Arrays.sort(ar);
      int start =0;
      int end=ar.length-1;
      while(start<=end)
      {
        int mid=(start+end)/2;
        if(target>ar[mid])
        {
          start=mid+1;
        }
        else if(target<ar[mid])
        {
           end=mid-1;
        }
        else 
        {
          return mid;
        }
     }
     return -1;
    }
  } 
