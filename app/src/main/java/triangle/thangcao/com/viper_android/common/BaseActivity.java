package triangle.thangcao.com.viper_android.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initToolBar();
        mappingUI();
        initEvents();
    }
    protected abstract void initToolBar();

    protected abstract void mappingUI();

    protected abstract void initEvents();

    protected abstract void initView();
}
