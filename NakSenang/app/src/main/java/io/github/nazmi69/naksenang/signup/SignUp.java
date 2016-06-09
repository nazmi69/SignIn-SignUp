package io.github.nazmi69.naksenang.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import io.github.nazmi69.naksenang.R;
import io.github.nazmi69.naksenang.signin.SignIn;

public class SignUp extends AppCompatActivity {

    TextView _loginActivityText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        _loginActivityText = (TextView) findViewById(R.id.link_login);
        _loginActivityText.setClickable(true);
        _loginActivityText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(getApplicationContext(), SignIn.class));
            }
        });
    }
}
