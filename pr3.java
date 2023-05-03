import java.util.*;
public class pr3 {
    public static void main(String[] args){
        int[][] a = new int[3][3];
        int[][] a2 = new int[3][3];
        int[][] sum = new int[3][3];
        Scanner a1 = new Scanner(System.in);
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter the 1 matrix numbers :");
                a[i][j]=a1.nextInt();
            }
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter the 2  matrix numbers :");
                a2[i][j]=a1.nextInt();
            }
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=a[i][j]+a2[i][j];
            }
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
