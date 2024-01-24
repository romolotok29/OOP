import Task2.WrongLoginException;
import Task2.WrongPasswordException;

import static Task2.UserInfo.validateUserInfo;

public class Main {
    public static void main(String[] args) {

        try {

            String login = "validLogin";
            String password = "ValidPassword1";
            String confirmPassword = "ValidPassword1";

            if (validateUserInfo(login, password, confirmPassword)) {
                System.out.println("User information is valid.");
            }

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}