package com.ervr.webfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText urlEditText;
    private Button openButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        urlEditText = findViewById(R.id.urlEditText);
        openButton = findViewById(R.id.openButton);

        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = urlEditText.getText().toString();

                WebFragment webFragment = new WebFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragmentContainer, webFragment);
                transaction.addToBackStack(null);  // Agregar a la pila de retroceso
                transaction.commit();

                getSupportFragmentManager().executePendingTransactions();  // Ejecutar transacciones pendientes
                webFragment.loadUrl(url);
            }
        });
    }
}
