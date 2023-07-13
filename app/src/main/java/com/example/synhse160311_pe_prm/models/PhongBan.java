package com.example.synhse160311_pe_prm.models;

public class PhongBan {
    private String id;
    private String name;

    public PhongBan(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getIdPB() {
        return id;
    }

    public void setIdPB(String id) {
        this.id = id;
    }

    public String getNamePB() {
        return name;
    }

    public void setNamePB(String namePB) {
        this.name = namePB;
    }
}
