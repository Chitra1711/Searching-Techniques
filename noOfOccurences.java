import java.util.Scanner;
class Main
{
    static int countOccurrences(int arr[], int n, int x)
    {
        int res = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i])
              res++;
        return res;
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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the element you want to search:");
        int x = input.nextInt();
        System.out.println(countOccurrences(arr, n, x));
    }
}
