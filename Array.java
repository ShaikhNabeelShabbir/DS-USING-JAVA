import java.util.*;
public class Array {
    public static int search(int Array[],int key) {
        for (int i = 0; i < Array.length; i++) {
            if (Array[i]==key) {
                return i;
            } 
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] A1=new int[10];
        
        for (int i = 0; i < A1.length; i++) {
            int temp=i*2;
            A1[i]=temp;
        }

        for (int i = 0; i < A1.length; i++) {
            // System.out.print(i);
            System.out.println(A1[i]+"  "+i);
        }
            System.out.println("0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x");
        int [][] A2=new int [5][5];
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <5; j++) {
                int temp=i*j;
                A2[i][j]=temp;
            }
        }
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print(A2[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x");

        int A3[]=new int[]{5,1,7,9,3};
        for (int i : A3) {
            System.out.println(i);
        }
        System.out.println("0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x0x");

        Arrays.sort(A3);
        for (int i: A3) {
            System.out.println(i);
        }

        int result=search(A3,5);
        System.out.println(result);




    }
}
