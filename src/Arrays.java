//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
       int[] arr=new int[]{1,2,3,4,5};
       bsearch(arr);
        }
        /// /////////printing elements of array
    public static void printa(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    ///////////////////reversing an array
    public static void reva(int[] arr){
        int[] arr2=new int[arr.length];
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            arr2[j]=arr[i];
            j--;
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
    /// ///////////////sum
    public static void suma(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    /// //////////////rotate
    public static void rotatea(int[] arr){
        System.out.println("enter no. of right operations to be performed:");
        Scanner sc=new Scanner(System.in);
        int j=sc.nextInt();
        for(int m=1;m<=j;m++) {

            int a = arr[arr.length - 1];
            for (int k = arr.length - 1; k >= 0; k--) {
                if (k == arr.length - 1) {
                } else {
                    arr[k + 1] = arr[k];
                }
            }
            arr[0] = a;
            System.out.println("after rotation number:"+j);
            for (int l = 0; l < arr.length; l++) {
                System.out.println(arr[l]);
            }
        }

    }
    /// /////////////////////insert
    public static void inserta(int[] arr){
        int[] arr2=new int[arr.length+1];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter position");
        int i=sc.nextInt();
        System.out.println("enter element");
        int j=sc.nextInt();
        for(int k=0;k<arr.length;k++){
            if(k<i){
                arr2[k]=arr[k];
            }
            else{
                arr2[k+1]=arr[k];
            }
        }
        arr2[i]=j;
        for(int l = 0; l < arr2.length; l++) {
            System.out.println(arr2[l]);
        }
    }
    /// //////////////delete
    public static void dela(int[] arr){
        int[] arr2=new int[arr.length-1];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter position of element to delete");
        int i=sc.nextInt();
        for(int j=0;j<i;j++){
            arr2[j]=arr[j];
        }
        for(int j=i;j<arr.length-1;j++){
            arr2[j]=arr[j+1];
        }
        ;
        for (int l = 0; l < arr2.length; l++) {
            System.out.println(arr2[l]);
        }
    }
    /// ///////////searching
    public static void searcha(int[] arr){
        int flag=0;
        System.out.println("enter element to be searched");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        for(int j=0;j<arr.length;j++){
            if(arr[j]==i){
                System.out.println("found at:"+j);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("not found");
        }
    }
    /// ////////////////////////binary search
    public static void bsearch(int[] arr){
        int high=arr.length-1;
        int low=0;
        int flag=0;
        System.out.println("enter element to be searched");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=0;
        while(low<=high&&j<arr.length) {
            int mid=(high+low)/2;
            if (arr[mid] < i) {
                low = mid;
                j++;
            } else if (arr[mid] > i) {
                high = mid;
                j++;
            } else {
                System.out.println("element found at:" + mid);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("element not found");
        }
    }
    /// //////////////////sorting
    public static void sorta(int[] arr){
        int temp=0;
        for(int i=arr.length-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }

            }
        }
        for (int l = 0; l < arr.length; l++) {
            System.out.println(arr[l]);
        }
    }

}