package triangle.thangcao.com.viper_android.login;

import triangle.thangcao.com.viper_android.enity.Account;
import triangle.thangcao.com.viper_android.login.LoginContracts;


public class LoginInteractor implements LoginContracts.Interactor {


    @Override
    public void login(Account account, LoginContracts.InteractorOutput interactorOutput) {
        if (isValidateAccount(account)) {
            interactorOutput.onLoginError("Login error");
            return;
        }
        interactorOutput.onLoginSuccess(account);
    }

    private boolean isValidateAccount(Account account) {
        return account.getUsername().isEmpty()
                || account.getPassword().isEmpty();
    }
}
