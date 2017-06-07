package triangle.thangcao.com.viper_android.login;

import android.app.Activity;
import android.content.Intent;

import triangle.thangcao.com.viper_android.home.HomeActivity;


public class LoginRouter implements LoginContracts.Router{

    @Override
    public void goToHomeScreen(Activity activity) {
        Intent intent = new Intent(activity, HomeActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }
}
