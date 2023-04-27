import java.util.*;
public class Quicksort{
     static int partition(int arr[],int low,int high){
        int i=low;
        int j=high;
        int temp=0;
        int pivot=arr[low];
        while(i<j){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    static void sort(int arr[],int low,int high){
        if(low<high){
            int part=partition(arr,low,high);
            sort(arr,low,part-1);
            sort(arr,part+1,high);
        }
    }
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter The Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("The Array Before Sorting: ");
        print(arr);
        sort(arr,0,n-1);
        System.out.println("The Array After Sorting: ");
        print(arr);

    }
}
