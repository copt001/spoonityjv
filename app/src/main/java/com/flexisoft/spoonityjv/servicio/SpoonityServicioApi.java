package com.flexisoft.spoonityjv.servicio;

import com.flexisoft.spoonityjv.modelo.BodyOnScreen;
import com.flexisoft.spoonityjv.modelo.onscreen;
import com.flexisoft.spoonityjv.modelo.onscreenCardNumber;
import com.flexisoft.spoonityjv.servicio.respuesta.OnscreenResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface SpoonityServicioApi {


    @POST("onscreen")
    Call<onscreen> onscreen(
            @Query("api_key") String api_key,
            @Body  BodyOnScreen bodyOnScreen

    );

    @GET("onscreen")
    Call<onscreenCardNumber> getOnScreenCardNumber(
            @Query("api_key") String api_key,
            @Query("pos_session_hash") String pos_session_hash
    );

}
