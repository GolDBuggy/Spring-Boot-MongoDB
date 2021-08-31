package com.javasource.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document
public class Kullanici {
    @Id
    private String id;
    private String adi;
    private String soyadi;
    private String gorunum;
    private HashMap ozellikler;

    public String getGorunum() {
        return gorunum;
    }

    public void setGorunum(String gorunum) {
        this.gorunum = gorunum;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public HashMap getOzellikler() {
        return ozellikler;
    }

    public void setOzellikler(HashMap ozellikler) {
        this.ozellikler = ozellikler;
    }


}
