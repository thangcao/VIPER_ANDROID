package triangle.thangcao.com.viper_android.login;


import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import triangle.thangcao.com.viper_android.R;
import triangle.thangcao.com.viper_android.common.BaseActivity;
import triangle.thangcao.com.viper_android.enity.Account;


public class LoginActivity extends BaseActivity implements LoginContracts.View {

    private EditText username;
    private EditText password;

    private LoginContracts.Presenter presenter = new LoginPresenter(this, this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void initToolBar() {
        // Hide Toolbar
    }

    @Override
    protected void mappingUI() {
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
    }

    @Override
    protected void initEvents() {
        findViewById(R.id.sign_in_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onLoginButtonPressed(new Account(username.getText().toString(), password.getText().toString()));
            }
        });
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_login);
    }

    @Override
    public void showError(String message) {
        new AlertDialog.Builder(this)
                .setMessage(message)
                .setPositiveButton(android.R.string.yes, null)
                .setCancelable(false)
                .show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.destroy();
    }
}
