import java.util.Scanner;

public class Calculator {
public static void main(String[] args) throws MyException {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    Main.calc(input);
    }
}

