package br.com.elisfernanda.eventoapp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonUtil {
    public static List<itemVideo> fromJson(String json) throws JSONException{

        List<itemVideo> lista = new ArrayList<>();

        JSONArray jsonArray = new JSONArray(json);
        for(int i = 0; i < jsonArray.length(); i++){
            JSONObject object = (JSONObject) jsonArray.get(i);
            String titulo = (String) object.get("titulo");
            String data = (String) object.get("data");
            String url = (String) object.get("url");

            lista.add(new itemVideo(titulo,data,url));
        }
        return lista;
    }
}
