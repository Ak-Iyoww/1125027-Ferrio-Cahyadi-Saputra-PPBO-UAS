package CliUtil;
import exception.InvalidInput;
import java.util.Scanner;

public class yh {
    private static final Scanner scanner = new Scanner(System.in);
    public static String getString(String req) throws InvalidInput {
        System.out.print(req);
        String input = scanner.nextLine().trim();
        if (input.isEmpty()) {
            throw new InvalidInput("teks kosong");
        }
        return input;
    }

    public static int getInt(String req) throws InvalidInput {
        System.out.print(req);
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            throw new InvalidInput("input harus angka");
        }
    }

    public static double getPositiveDouble(String req) throws InvalidInput {
        System.out.print(req);
        try {
            double val = Double.parseDouble(scanner.nextLine().trim());
            if (val <= 0) {
                throw new InvalidInput("nilai hrs gede dr 0");
            }
            return val;
        } catch (NumberFormatException e) {
            throw new InvalidInput("anka desimal harus bener");
        }
    }

}


