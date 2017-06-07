package triangle.thangcao.com.viper_android.utils;

import android.app.AlertDialog;
import android.content.Context;

import triangle.thangcao.com.viper_android.R;

public class AlertDialogUtils {

    public static AlertDialog.Builder buildConfirmAlertDialog(Context context, int messageId) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.AppAlertDialog);
        builder.setTitle("Alert")
                .setMessage(messageId)
                .setNegativeButton(R.string.txt_cancel, null);
        return builder;
    }
}
