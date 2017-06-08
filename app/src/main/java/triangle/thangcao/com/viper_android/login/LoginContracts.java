package triangle.thangcao.com.viper_android.login;

import android.app.Activity;

import triangle.thangcao.com.viper_android.enity.Account;

/**
 * This class used to define all user case in login features
 *
 * @author ThangCao
 */

class LoginContracts {

    /**
     * What do you expect to show on your view
     */
    public interface View {
        void showError(String message);
    }

    /**
     * Used to navigate to another activity
     */
    interface Router {
        void goToHomeScreen(Activity activity);
    }

    interface Presenter {
        void destroy();

        void onLoginButtonPressed(Account account);
    }

    interface Interactor {
        void login(Account account);
    }

    interface InteractorOutput {
        void onLoginSuccess(Account account);

        void onLoginError(String message);
    }
}
