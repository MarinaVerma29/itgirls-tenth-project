package in.verma.app10.main;
import java.util.Scanner;
import in.verma.app10.model.Account;
import in.verma.app10.exception.WrongLoginOrPasswordException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваш логин: ");
        String loginUser = scanner.nextLine();
        System.out.print("Введите Ваш пароль: ");
        String passwordUser = scanner.nextLine();

        Account account = new Account();
        try {
            String result = account.checkLoginAndPassword(loginUser, passwordUser);
            System.out.println(result);
        } catch (WrongLoginOrPasswordException e) {
            throw new RuntimeException(e);
        }


    }
}



