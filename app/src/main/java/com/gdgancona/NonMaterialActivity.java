package com.gdgancona;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NonMaterialActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_material);

        Button buttonLogin = (Button) findViewById(R.id.buttonToast);
        final Button buttonMaterialActivity = (Button) findViewById(R.id.buttonMaterialActivity);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NonMaterialActivity.this, "Login effettuato", Toast.LENGTH_SHORT).show();
                buttonMaterialActivity.setVisibility(View.VISIBLE);
            }
        });

        buttonMaterialActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NonMaterialActivity.this, MaterialActivity.class);
                startActivity(intent);
                buttonMaterialActivity.setVisibility(View.GONE);

            }
        });
    }
}
