package com.example.synhse160311_pe_prm.api;

public class NhanVienAPI {
    public static NhanVienAPIService nhanVienService = APIClient.retrofit.create(NhanVienAPIService.class);
}
