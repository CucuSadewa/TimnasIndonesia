package com.example.timnasindonesia;

import android.os.Parcel;
import android.os.Parcelable;

public class Pemain implements Parcelable {
    private String name;
    private String posisi;
    private String tl;
    private String klub;
    private int photo;

    protected Pemain(Parcel in) {
        name = in.readString();
        posisi = in.readString();
        tl = in.readString();
        klub = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Pemain> CREATOR = new Creator<Pemain>() {
        @Override
        public Pemain createFromParcel(Parcel in) {
            return new Pemain(in);
        }

        @Override
        public Pemain[] newArray(int size) {
            return new Pemain[size];
        }
    };

    public Pemain() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(posisi);
        parcel.writeString(tl);
        parcel.writeString(klub);
        parcel.writeInt(photo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getTl() {
        return tl;
    }

    public void setTl(String tl) {
        this.tl = tl;
    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

}
