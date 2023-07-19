package sample;

import java.util.Scanner;

public class SumofSubArray {
	public class Sub_array {

		public static void main(String[] args) {
			        Scanner sc = new Scanner(System.in);
			        System.out.println("Enter size:");
			        int n = sc.nextInt();
			        int[] arr= new int[n];
			        System.out.println("Enter the array");
			        for(int i=0;i<n;i++){
			            arr[i] = sc.nextInt();
			        }
			        int sum=0;
			        for(int j=0;j<n;j++){
			            for(int k=j;k<n;k++){
			                for(int l=j;l<=k;l++){
			                    sum+=arr[l];
			                }
			            }
			        }
			        System.out.println("The sum is"+sum);
			    }
			}

}
