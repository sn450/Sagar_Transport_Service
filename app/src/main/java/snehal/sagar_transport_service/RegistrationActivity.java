package snehal.sagar_transport_service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    TextView joinusText;
    EditText userNameText, contactNumber, addressText, industryText, gstNumber;
    RadioGroup customerTypebtn;
    Button submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        joinusText = findViewById(R.id.title);
        userNameText = findViewById(R.id.userName);
        contactNumber = findViewById(R.id.contact);
        addressText = findViewById(R.id.address);
        industryText = findViewById(R.id.industry);
        gstNumber = findViewById(R.id.gstnumber);
        customerTypebtn = findViewById(R.id.customerType);
        submitbtn = findViewById(R.id.submit);
    }
    public void loginuser(View view) {
        Intent log = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(log);
    }
}
