import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int celsius = scanner.nextInt();
        double fahrenheit = convert(celsius);
        System.out.println(fahrenheit);

    }
    public static double convert(int celsius){
        return (celsius * 9 / 5 ) + 32;
    }
}
