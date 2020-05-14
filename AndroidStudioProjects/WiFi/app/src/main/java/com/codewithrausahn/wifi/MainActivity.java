package com.codewithrausahn.wifi;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Context;
        import android.net.wifi.WifiManager;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button enableButton,disableButton;
 private WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enableButton= findViewById(R.id.button1);
        disableButton= findViewById(R.id.button2);

        enableButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this,  "  wifi enable", Toast.LENGTH_SHORT).show();
                WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(true);
            }
        });

        disableButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "wifi disable", Toast.LENGTH_SHORT).show();
                WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(false);
            }
        });
    }
}
