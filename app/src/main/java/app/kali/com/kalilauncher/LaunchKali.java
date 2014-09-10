package app.kali.com.kalilauncher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LaunchKali extends Activity {

    /**
     * LAUNCH KALI CHROOT
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_kali_launcher);
        addClickListener(R.id.button_start_kali, new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =
                        new Intent("jackpal.androidterm.RUN_SCRIPT");
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.putExtra("jackpal.androidterm.iInitialCommand", "su\nbootkali");
                startActivity(intent);
            }
        });

        /**
         * LAUNCH KALI MENU
         */
        addClickListener(R.id.button_start_kalimenu, new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =
                        new Intent("jackpal.androidterm.RUN_SCRIPT");
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.putExtra("jackpal.androidterm.iInitialCommand", "su\nbootkali\nkalimenu");
                startActivity(intent);
            }
        });

        /**
         * SHUTDOWN KALI CHROOT
         */
        addClickListener(R.id.button_stop_kali, new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =
                        new Intent("jackpal.androidterm.RUN_SCRIPT");
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.putExtra("jackpal.androidterm.iInitialCommand", "su\nkillkali");
                startActivity(intent);
            }
        });

        /**
         * Start Webserver
         */
        addClickListener(R.id.button_start_web, new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =
                        new Intent("jackpal.androidterm.RUN_SCRIPT");
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.putExtra("jackpal.androidterm.iInitialCommand", "su\nstart-web");
                startActivity(intent);
            }
        });

        /**
         * Stop Webserver
         */
        addClickListener(R.id.button_stop_web, new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =
                        new Intent("jackpal.androidterm.RUN_SCRIPT");
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.putExtra("jackpal.androidterm.iInitialCommand", "su\nstop-web");
                startActivity(intent);
            }
        });
    }

    private void addClickListener(int buttonId, View.OnClickListener onClickListener) {
        ((Button) findViewById(buttonId)).setOnClickListener(onClickListener);
    }
}