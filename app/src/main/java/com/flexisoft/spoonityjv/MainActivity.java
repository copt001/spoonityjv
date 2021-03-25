package com.flexisoft.spoonityjv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.flexisoft.spoonityjv.servicio.ServicioSpoonity;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "spoonityjvAPP";
    private EditText etIdentificacion;
    private ServicioSpoonity servicio;
    private Button btnContinuar;
    private Button btnBuscar;
    private TextView tvRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        servicio = new ServicioSpoonity();
        etIdentificacion = findViewById(R.id.etIdentificacion);
        btnBuscar = findViewById(R.id.btnConsultar);
        btnContinuar = findViewById(R.id.btnContinuar);
        tvRespuesta = findViewById(R.id.tvRespuesta);
        //etIdentificacion.setText("70852351");
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //consultaPuntos(etIdentificacion.getText().toString());
                tvRespuesta.setText("Puntos: "+Math.floor(Math.random()*(3000-1+1)+3000));
                btnContinuar.setVisibility(View.VISIBLE);
            }
        });
        etIdentificacion.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    //consultaPuntos(etIdentificacion.getText().toString());
                    tvRespuesta.setText("Puntos: "+Math.floor(Math.random()*(3000-1+1)+3000));
                    btnContinuar.setVisibility(View.VISIBLE);
                    return true;
                }
                return false;
            }
        });
    }

    private String consultaPuntos(String identificacion) {
        tvRespuesta.setText("");
        String puntos = "";
        String respuestaOnscreen = servicio.onscreen(identificacion);

        JSONObject respuestaOnscreenJs = null;
        try {
            respuestaOnscreenJs = new JSONObject(respuestaOnscreen);
            String posSessionHash = respuestaOnscreenJs.getString("hash");
            String respuestaOnscreenCardNumber = servicio.onscreenCardNumber(posSessionHash);
            JSONObject respuestaOnscreenCardNumberJs = null;
            try {
                respuestaOnscreenCardNumberJs = new JSONObject(respuestaOnscreen);
                puntos = respuestaOnscreenJs.getString("loyalty_balance");
                tvRespuesta.setText(puntos);
            } catch (Exception e) {
                tvRespuesta.setText("Identificaci\u00f3n no existe");
                e.printStackTrace();
            }
        } catch (Exception e) {
            tvRespuesta.setText("Identificaci\u00f3n no existe");
            e.printStackTrace();
        }


        return puntos;
    }
    private class TareaWSOnScreen extends AsyncTask<String,Integer,String> {

        protected String doInBackground(String... params) {
            return servicio.onscreen(params[0]);
        }

        protected void onPostExecute(String result) {

            if (result.isEmpty())
            {
                tvRespuesta.setText("Error.");
            }else{
                tvRespuesta.setText(result);
            }
        }
    }
}