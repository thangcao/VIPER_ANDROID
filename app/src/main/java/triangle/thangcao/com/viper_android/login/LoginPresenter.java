package triangle.thangcao.com.viper_android.login;

import android.app.Activity;

import triangle.thangcao.com.viper_android.enity.Account;

public class LoginPresenter implements LoginContracts.Presenter, LoginContracts.InteractorOutput {

    private LoginContracts.View view;
    private Activity activity;
    private LoginContracts.Router router = new LoginRouter();
    private LoginInteractor loginInteractor = new LoginInteractor(this);

    public LoginPresenter(LoginContracts.View view, Activity activity) {
        this.view = view;
        this.activity = activity;
    }

    @Override
    public void destroy() {
        view = null;
        loginInteractor = null;
    }

    @Override
    public void onLoginButtonPressed(Account account) {
        loginInteractor.login(account);
    }

    @Override
    public void onLoginSuccess(Account account) {
        router.goToHomeScreen(activity);
    }

    @Override
    public void onLoginError(String message) {
        view.showError(message);
    }
}
