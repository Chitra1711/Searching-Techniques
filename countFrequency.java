import java.util.Scanner;
import java.util.Arrays;
class Main
    {
    public static void Freq(int arr[], int n)
    {
        boolean visited[] = new boolean[n];
     
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
public static void main(String []args)
{
    Scanner s = new Scanner(System.in);
    System.out.print("Enter no. of elements you want in array:");
    int n = s.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter all the elements:");
    for(int i = 0; i < n; i++)
    {
        arr[i] = s.nextInt();
    }
    Freq(arr, n);
}
}
 
