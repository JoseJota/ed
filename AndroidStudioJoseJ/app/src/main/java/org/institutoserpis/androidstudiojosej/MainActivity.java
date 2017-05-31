package org.institutoserpis.androidstudiojosej;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtRec = (TextView)findViewById(R.id.txtRecTemp);
        final TextView txtFarenheit = (TextView)findViewById(R.id.txtFarenheit);
        final TextView txtKelvin = (TextView)findViewById(R.id.txtKelvin);

        final SeekBar seekBar1 = (SeekBar)findViewById(R.id.seekBar);

        seekBar1.setMax(3000);

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                String texto = formatNumber (progress/10.0);
                texto +=" ºC";
                txtRec.setText(texto);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        final Button btnConverter = (Button)findViewById(R.id.btnConverter);
btnConverter.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        int foo = Integer.parseInt(String.valueOf(txtRec));
        double Farenheit = (((foo)*9/5+32));
        String texto = formatNumber(Farenheit);
        texto += "ºF";
        R.id.txtFarenheit.setText(texto);

        double Kelvin =(foo + 273);
        String texto2 = formatNumber(Kelvin);
        texto2 += "K";
        R.id.txtKelvin.setText(texto2);
    }
});
        });


    }
    private String formatNumber(double valor){
        return String.format(Locale.FRANCE,"0.2f", valor);
    }

}
