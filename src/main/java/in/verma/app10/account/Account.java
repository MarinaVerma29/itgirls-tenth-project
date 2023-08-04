package in.verma.app10.account;
import java.util.Scanner;

public class Account {
    public String password;
    public Account() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        this.password = sc.nextLine();
        System.out.print("Подтвердите пароль: ");
        String passwordCheck = sc.nextLine();

        if (checkPassword(passwordCheck)) {
            System.out.println("Пароли совпадают!");
        } else {
            System.out.println("Пароли не совпадают!");
        }
    }

        public boolean checkPassword (String passwordCheck){
            return this.password.equals(passwordCheck);
        }

        public static void main(String[] args) {
        new Account();
    }
}


