package com.example.synhse160311_pe_prm.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://636db51a91576e19e32dceed.mockapi.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
