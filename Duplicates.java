import java.util.Scanner;
class Main
{
    public static int count(int arr[], int n)
    {
        int i,c=0,j;
        for(i=0; i<n; i++)
        {
             if(arr[i]!=-1)
		    {
		        for(j=i+1; j<n; j++)
                {
        	        if(arr[i]==arr[j])
        	        {
			            c++;
			            arr[j]=-1;
		            }
	            }
 	       	}
         
   
          
        }
    return c;
    }
     
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array:");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
        int c;
        c=count(arr,n);
    
	      System.out.print("duplicate numbers in the  array: " +c);
 
    }
}
