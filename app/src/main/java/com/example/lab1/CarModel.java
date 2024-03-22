package com.example.lab1;

public class CarModel {
    private  String id;
    private String ten;
    private int namSx;
    private String hang;
    private double gia;

    public CarModel(String id, String ten, int namSx, String hang, double gia) {
        this.id = id;
        this.ten = ten;
        this.namSx = namSx;
        this.hang = hang;
        this.gia = gia;
    }

    public String getId() {
        return id;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSx() {
        return namSx;
    }

    public void setNamSx(int namSx) {
        this.namSx = namSx;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
}
