package com.example.studente3.lab_14_opendata.api;

import android.util.Log;

import com.example.studente3.lab_14_opendata.beans.TaipeiAttractionsBean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by student on 2016/4/26.
 */
public class TaipeiOpenDataUtil {
    public static final String TAG = "LoadOpenData";
    public static void loadTaipeiAttractions(){
        Call<TaipeiAttractionsBean> call = TaipeiAttractionsOpenData.apiService.getTaipeiAttractionsBean();
        call.enqueue(new Callback<TaipeiAttractionsBean>() {
            @Override
            public void onResponse(Call<TaipeiAttractionsBean> call, Response<TaipeiAttractionsBean> response) {
                if(!response.isSuccessful()){
                    Log.d(TAG,"onResponse() : Unsuccessful , response_code = " + response.code());
                    return;
                }
                Log.d(TAG,"onResponse() : successful");
                TaipeiAttractionsBean bean = response.body();

                Log.d(TAG,"count = "+bean.getResult().getCount());
            }

            @Override
            public void onFailure(Call<TaipeiAttractionsBean> call, Throwable t) {

            }
        });
    }
}
