package com.example.ormawapolines;

import java.util.ArrayList;

public class HmjData {

    public static String[][] data = new String[][]{
            {
                "0", "HMJ Elektro", "Himpunan Mahasiswa Jurusan Teknik Elektro adalah salah satu Himpun\n" +
                    "an Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organ\n" +
                    "isasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Tek\n" +
                    "nik Elektro untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi.",
                    "https://i.postimg.cc/QxdcLRBk/hme.jpg"
            },
            {
                "1", "HMJ Teknik Sipil", "Himpunan Mahasiswa Jurusan Teknik Sipil adalah salah satu Himpunan\n" +
                    "Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organis\n" +
                    "asi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Tekni\n" +
                    "k Sipil untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi.",
                    "https://i.postimg.cc/yxBXSxYw/hms.jpg"
            },
            {
                    "2", "HMJ Teknik Mesin", "Himpunan Mahasiswa Jurusan Teknik Mesin adalah salah satu Himpunan\n" +
                    "Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organis\n" +
                    "asi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Tekni\n" +
                    "k Mesin untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi.",
                    "https://i.postimg.cc/LsL1BS7R/hmm.jpg"
            },
            {
                    "3", "HMJ Akutansi", "Himpunan Mahasiswa Jurusan Akutansi adalah salah satu Himpunan Mah\n" +
                    "asiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi\n" +
                    "kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan akutansi\n" +
                    "untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi.",
                    "https://i.postimg.cc/3NS4Jxyj/hmak.jpg"
            },
            {
                    "4", "HMJ Administrasi Bisnis", "Himpunan Mahasiswa Jurusan Administrasi Bisnis adalah salah satu \n" +
                    "Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan\n" +
                    "organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusa\n" +
                    "n Administrasi Bisnis\n" +
                    "untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi.",
                    "https://i.postimg.cc/pLYvD1Z4/hmab.jpg"
            },
    };
    public static ArrayList<Hmj> getlistData(){
        ArrayList<Hmj> list = new ArrayList<>();
        for (String[] aData : data){
            Hmj hmj = new Hmj();
            hmj.setId(Integer.parseInt (aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);
            list.add(hmj);
        }
        return list;
    }
    }



