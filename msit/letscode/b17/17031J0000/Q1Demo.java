package ex;
public class Q1Demo
{
     public int[] fib(int n)
     {
        // write code here 
       // NOTE: don't  write System.out.println. assign value to array	
     int arr[]=new int[n];
         int a=0,b=1,c;
         if(n==0 || n==1)
         {
            arr[0]=a;
         }
         else if(n==2)
         {
            arr[0]=a;
            arr[1]=b;
         }    
         else 
         {
            arr[0]=a;
            arr[1]=b;
            for(int i=2;i<n;i++)
            {
               c=a+b;
               arr[i]=c;
               a=b;
               b=c;
            }
            
         }   
          

        return arr;
     }
}
        