package in.verma.app10.model;
import java.util.HashMap;
import in.verma.app10.exception.WrongLoginOrPasswordException;

public class Account {
    private HashMap<String, String> users = new HashMap<>();

    public Account() {
        users.put("admin", "admin");
        users.put("konfetka", "12345");
        users.put("privet_mEEEdved", "mishka");
    }

    public String checkLoginAndPassword(String login, String password) throws WrongLoginOrPasswordException {
        if (!users.containsKey(login)) throw new WrongLoginOrPasswordException("Указанный логин не существует");
        if (!users.get(login).equals(password)) throw new WrongLoginOrPasswordException("Не корректный пароль");

        return "Вы успешно вошли в аккаунт!";
    }
}
