package com.example.synhse160311_pe_prm.api;

import com.example.synhse160311_pe_prm.models.PhongBan;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PhongBanAPIService {
    @GET("phongban")
    Call<List<PhongBan>> getPhongBanList();

    @DELETE("phongban/{id}")
    Call<Void> deletePhongBan(@Path("id") String phongBanId);

    @POST("phongban")
    Call<Void> createPhongBan(@Body PhongBan phongBan);
}
