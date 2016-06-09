package io.github.nazmi69.naksenang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.github.nazmi69.naksenang.logged.LandingPage;
import io.github.nazmi69.naksenang.signin.SignIn;

public class MainActivity extends AppCompatActivity {

    Button button, lmain_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(getApplicationContext(), SignIn.class));
            }
        });

        lmain_page = (Button) findViewById(R.id.link_main_page);
        lmain_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LandingPage.class));
            }
        });
    }
}
