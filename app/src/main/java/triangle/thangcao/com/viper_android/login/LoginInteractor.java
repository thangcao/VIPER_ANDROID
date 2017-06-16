package triangle.thangcao.com.viper_android.login;

import triangle.thangcao.com.viper_android.enity.Account;
import triangle.thangcao.com.viper_android.login.LoginContracts;


public class LoginInteractor implements LoginContracts.Interactor {

    LoginContracts.InteractorOutput interactorOutput;

    public LoginInteractor(LoginContracts.InteractorOutput interactorOutput) {
        this.interactorOutput = interactorOutput;
    }

    @Override
    public void login(Account account) {

        interactorOutput.onLoginSuccess(account);
    }

    private boolean isValidateAccount(Account account) {
        return account.getUsername().isEmpty()
                || account.getPassword().isEmpty();
    }
}
