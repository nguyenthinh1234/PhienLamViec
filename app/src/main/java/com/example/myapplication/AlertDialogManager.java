package com.example.myapplication;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
public class AlertDialogManager {

    public void showAlertDialog(Context context, String title, String message,
                                Boolean status) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).create();

        // Dialog Title
        alertDialog.setTitle(title);

        // Dialog Message
        alertDialog.setMessage(message);

        if(status != null)
            // alert dialog icon
            alertDialog.setIcon((status) ? R.drawable.ic_launcher_foreground : R.drawable.ic_launcher_background);

        // OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        // Alert Message
        alertDialog.show();
    }
}
