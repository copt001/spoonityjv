package com.flexisoft.spoonityjv.servicio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ServicioSpoonity {

    public String onscreen(String identificacion) {
        String response = "";
        try {

            URL url = new URL("https://api-juanvaldez.spoonity.com/onscreen?api_key=7501609d9fae1ce49dd33f7072564894");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Content-Type", "application/json");
            String input = "{\"card_number\":\""+identificacion+"\"}";

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }


            String line;
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while ((line = br.readLine()) != null) {
                response += line;
            }
            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return response;
    }
    public String onscreenCardNumber(String posSessionHash) {
        String response = "";
        try {

            URL url = new URL("https://api-juanvaldez.spoonity.com/onscreen?api_key=7501609d9fae1ce49dd33f7072564894&pos_session_hash="+posSessionHash);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Content-Type", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }


            String line;
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while ((line = br.readLine()) != null) {
                response += line;
            }
            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return response;
    }
}
