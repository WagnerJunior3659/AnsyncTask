package android.fasa.edu.br.ansynctaskactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Wagner Junior on 23/04/2018.
 */

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void processar (View V) {
        TextView t = (TextView) findViewById(R.id.texto);
        Button b = (Button) findViewById(R.id.botao);

        CounterTask ct = new CounterTask (t, b);

        ct.execute(20);
    }
}
