package devandroid.kenede.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.kenede.applistacurso.R;
import devandroid.kenede.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    // Declarando um objeto pessoa
    Pessoa pessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // crinado um objeto pessoa (istanciando)
        pessoa = new Pessoa();

    }
}