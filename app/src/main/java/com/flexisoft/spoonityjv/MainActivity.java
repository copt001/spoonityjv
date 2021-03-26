package com.flexisoft.spoonityjv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.flexisoft.spoonityjv.modelo.BodyOnScreen;
import com.flexisoft.spoonityjv.modelo.data;
import com.flexisoft.spoonityjv.modelo.onscreen;
import com.flexisoft.spoonityjv.modelo.onscreenCardNumber;
import com.flexisoft.spoonityjv.servicio.ServicioSpoonity;
import com.flexisoft.spoonityjv.servicio.SpoonityAdaptadorApi;
import com.flexisoft.spoonityjv.servicio.SpoonityServicioApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity  {

    private static final String LOG_TAG = "spoonityjvAPP";
    private EditText etIdentificacion;
    private ServicioSpoonity servicio;
    private Button btnContinuar;
    private Button btnBuscar;
    private TextView tvRespuesta;
    SpoonityServicioApi apiInterface;

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
        apiInterface = SpoonityAdaptadorApi.getApiService();
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //consultaPuntos(etIdentificacion.getText().toString());
//                tvRespuesta.setText("Puntos: " + Math.floor(Math.random() * (3000 - 1 + 1) + 3000));
//                btnContinuar.setVisibility(View.VISIBLE);
                consultaHash();
            }
        });
        etIdentificacion.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    //consultaPuntos(etIdentificacion.getText().toString());
                    /*tvRespuesta.setText("Puntos: " + Math.floor(Math.random() * (3000 - 1 + 1) + 3000));
                    btnContinuar.setVisibility(View.VISIBLE);*/
                    consultaHash();
                    return true;
                }
                return false;
            }
        });

/*        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value1 = extras.getString("Key1");
            tvRespuesta.setText(value1);
        } else {
            tvRespuesta.setText("No llego nada");
        }*/
        etIdentificacion.setText("70852351");


    }

   /* private String consultaPuntos(String identificacion) {
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
    }*/

    public void consultaHash() {
        BodyOnScreen bodyOnScreen = new BodyOnScreen();
        bodyOnScreen.setCard_number(etIdentificacion.getText().toString());

        Call<onscreen> call = apiInterface.onscreen("7501609d9fae1ce49dd33f7072564894", bodyOnScreen);
        call.enqueue(new Callback<onscreen>() {
            @Override
            public void onResponse(Call<onscreen> call, Response<onscreen> response) {
                if (response.isSuccessful()) {
                    onscreen resp = response.body();
                    Log.d("on Response onscreeen", "tamaño " + resp.toString());
                    consultaPuntos(resp.getPos_session().getHash().toString());
                }
            }


            @Override
            public void onFailure(Call<onscreen> call, Throwable t) {

            }
        });

    }

    public void consultaPuntos(String pos_session_hash) {

        Call<onscreenCardNumber> call = SpoonityAdaptadorApi.getApiService().getOnScreenCardNumber("7501609d9fae1ce49dd33f7072564894", pos_session_hash);
        call.enqueue(new Callback<onscreenCardNumber>() {
            @Override
            public void onResponse(Call<onscreenCardNumber> call, Response<onscreenCardNumber> response) {
                if (response.isSuccessful()) {
                    onscreenCardNumber resp = response.body();
                    Log.d("on Response onscreeen", "tamaño " + resp.toString());
                    List<data> data=resp.getLoyalty_balance().getData();
                    tvRespuesta.setText("Puntos: "+resp.getLoyalty_balance().getData().get(0).getAmount().toString());
                }
            }

            @Override
            public void onFailure(Call<onscreenCardNumber> call, Throwable t) {

            }
        });

    }




   /* private class TareaWSOnScreen extends AsyncTask<String, Integer, String> {

        protected String doInBackground(String... params) {
            return servicio.onscreen(params[0]);
        }

        protected void onPostExecute(String result) {

            if (result.isEmpty()) {
                tvRespuesta.setText("Error.");
            } else {
                tvRespuesta.setText(result);
            }
        }
    }*/
}