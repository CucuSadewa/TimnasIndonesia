package com.example.timnasindonesia;

import java.util.ArrayList;

public class PemainData {
    private static String[] pemainName = {

            "Teguh Limas Sarendra",
            "Muhammad Nazil Purnama",
            "Rio Pangestu",
            "Sunny Rizky Suhendra",
            "Marvin Alexa",
            "Ardiansyah Runtuboy",
            "Muhamad iqbal Iskandar",
            "Sauqy Saud",
            "Bambang Bayu Saptaji",
            "Randy Satria",
            "Andri Kustiawan",
            "Subhan Faidasa"
    };

    private static String[] pemainPosisi = {

            "Kiper",
            "Kiper",
            "Anchor",
            "Anchor",
            "Anchor ",
            "Flank",
            "Flank",
            "Flank",
            "Flank",
            "Flank",
            "Pivot",
            "Pivot"
    };

    private static String[] pemainTL= {

            "21 Januari 1990",
            "23 Maret 1992",
            "30 Agustus 1997",
            "11 Juli 1993",
            "12 Mei 1992",
            "15 Juli 1998",
            "23 Agustus 1995",
            "29 Januari 1997",
            "8 September 1992",
            "9 Desember 1989",
            "6 Agustus 1991",
            "4 Juli 1994"

    };
    private static String[] pemainKlub = {

            "SKN FC Kebumen",
            "Bintang Timur Surabaya",
            "Black Steel Manokwari",
            "Bintang Timur Surabaya",
            "Vamos Mataram",
            "Black Steel manokwari",
            "Bintang timur Surabaya",
            "Black Steel Manokwari",
            "Halus FC Jakarta",
            "IPC Pelindo",
            "Vamos Mataram",
            "Black Steel Manokwari"

    };

    private static int[] pemainImage = {
            R.drawable.teguh_limas_sarendra,
            R.drawable.muhammad_nazil_purnama,
            R.drawable.rio_pangestu,
            R.drawable.sunny_rizky_suhendra,
            R.drawable.marvin_alexa,
            R.drawable.ardiansyah_runtuboy,
            R.drawable.muhammad_iqbal_iskandar,
            R.drawable.sauqy_saud,
            R.drawable.bambang_bayu_saptaji,
            R.drawable.randy_satria,
            R.drawable.andri_kustiawan,
            R.drawable.subhan_faidasa
    };

    static ArrayList<Pemain> getListData() {
        ArrayList<Pemain> list = new ArrayList<>();
        for (int position = 0; position< pemainName.length; position++) {
            Pemain pemain = new Pemain();
            pemain.setName(pemainName[position]);
            pemain.setPosisi(pemainPosisi[position]);
            pemain.setTl(pemainTL[position]);
            pemain.setKlub(pemainKlub[position]);
            pemain.setPhoto(pemainImage[position]);
            list.add(pemain);
        }
        return list;
    }
}
