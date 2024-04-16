import java.util.Scanner;
public class Staircase {
    public static void generateStaircase(int n){
        for(int i=1;i<=n;i++)
        {
            System.out.println("#".repeat(Math.max(0, i)));
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the staircase: ");
        int n= Integer.parseInt(scanner.nextLine());
        generateStaircase(n);
    }
}
