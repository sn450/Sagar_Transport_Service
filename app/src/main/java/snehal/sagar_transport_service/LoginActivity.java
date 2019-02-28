package snehal.sagar_transport_service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView signupText, registerText;
    EditText emailEdittext, passwordEdittext;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signupText = findViewById(R.id.login);
        emailEdittext = findViewById(R.id.email);
        passwordEdittext = findViewById(R.id.password);
        loginButton = findViewById(R.id.signin);
        registerText = findViewById(R.id.newuser);
    }

    public void goHome(View view) {
        Intent home = new Intent(getApplicationContext(), HomeActivity.class);
        startActivity(home);
    }

    public void registerNow(View v) {

        //Toast.makeText(LoginActivity.this, "Hello", Toast.LENGTH_SHORT).show();
        Intent register = new Intent(getApplicationContext(), RegistrationActivity.class);
        startActivity(register);
    }
}