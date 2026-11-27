package ph.edu.nu.severino.eventregistration;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        EditText emailField = findViewById(R.id.editEmail);
        Button registerButton = findViewById(R.id.btnRegister);
        TextView statusLabel = findViewById(R.id.txtStatus);

        registerButton.setOnClickListener(v -> {

            String email = emailField.getText()
                    .toString().trim();

            if (email.isEmpty()) {

                statusLabel.setText(
                        "Enter your personal email first."
                );

            } else {

                statusLabel.setText(
                        "Registered: " + email
                );

            }

        });
    }
}