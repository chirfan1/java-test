import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Size : ");
        int num = sc.nextInt();

        for (int i = 1; i<=num; i++){
            for (int j = 1;j<num-(i-1);j++){
                System.out.println(" ");
            }
            for (int k = 1; k<=i;k++){
                System.out.print("*");
                for (int k1 = 1;k1<k;k1+=k){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
