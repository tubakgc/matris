import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {2, 3, 4},
                {5, 6, 4},
                {1, 7, 8,}
        };

        int[][] d=new int[3][3];

        for (int i = 0; i<3; i++){
            for (int j=0; j<3;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("matrisin transpozu");

        for (int i = 0; i<3; i++){
            for (int j=0; j<3;j++){
                d[i][j]=a[j][i];
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }





    }
}