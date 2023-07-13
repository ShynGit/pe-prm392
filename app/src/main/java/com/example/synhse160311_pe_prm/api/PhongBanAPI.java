package com.example.synhse160311_pe_prm.api;

public class PhongBanAPI {
    public static PhongBanAPIService phongBanService = APIClient.retrofit.create(PhongBanAPIService.class);
}
