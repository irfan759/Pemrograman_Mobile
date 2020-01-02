package com.example.uts;
import java.util.ArrayList;
public class LpData {
    public static String[][] data = new String[][]{
            {
                    "0", "Chester  Bennington", "Nama aslinya adalah Chester Charles Bennington lahir di Phoenix, Arizona 20 Maret 1976.\n " +
                    "Chester Bennington merupakan vokalis utama Linkin Park dari tahun 1998 - 2017 yang menggantikan Mark Wakefield karena keluar dari band tersebut. Sebelum bergabung dengan Linkin Park, Chester sempat bergabung dengan Grey Daze sebagai vokalis juga. Sejak kecil Chester sudah tertarik dengan bidang music. Dia pernah terjerat narkoba dan sempat bekerja setelahnya di restoran Burger King sebelum menjadi musisi professional.\n" +
                    "Chester Bennington meninggal dunia pada tanggal 20 Juli 2017 karena gantung diri.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpoPSB5rzyYQCNI5Qa5DJWkAeRy2dcPANW7iUtM76AVz55n5LpBg&s"
            },
            {
                    "1", "Mike  Shinoda", "Nama aslinya adalah Michael Kenji Shinoda, lahir di kota Panorama California, 11 Februari 1976. \n" +
                    "Dia sebagai rapper di Linkin Park, terkadang memegang sebagai keyboardis dan gitaris. Ayah Mike Shinoda adalah keturunan Jepang sedangkan ibunya seorang Amerika Asli (Indian). Mike Shinoda juga merupakan anggota personel Linkin Park dari tahun 1996 sampai sekarang.\n" +
                    "Mike memiliki kakak laki-laki yang bernama Jason. Musik klasik memperkenalkan dia pertama kalinya dengan music. Selama 10 tahun lamanya Mike belajar piano klasik. Lalu dia beralih ke music Jazz karena bosan. Lalu beralih ke hip hop. Mike belajar membuat lirik saat dia berumur 14 tahun dan dia juga belajar rapping setelah melihat konser Antrhax dan Public Enemy. Mike juga mendesain cover album Linkin Park yang pertama, yaitu Hybrid Theory.",
                    "data:image/jpeg;base64,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"
            },
            {
                    "2", "Dave Farrell", "Nama aslinya adalah David Michael \"Phoenix\" Farrell lahir di Plymouth, 8 Februari 1977. \n" +
                    "Ia berperan sebagai Bassist di Linkin Park. Dia mempelajari gitar dari sang ibu dan dari kakaknya juga dia belajar instrument. Pada usia 5 tahun dia pindah ke Misi, vego, California saat usianya 5 tahun. Dia masuk ke daftar personil Linkin Park saat dia menjadi teman sekamar Brad Delson. \n" +
                    "Pada tahun 1998 ia sempat absen di Linkin Park karena ingin menyelesaikan tour project bandnya yang bernama Tasty Snax dan kembali  ke Linkin Park pada tahun 2000.",
                    "http://4.bp.blogspot.com/-yntAo12qp2s/Vj3G7in2dyI/AAAAAAAAAPc/Ek9Ct5whuLw/s1600/068764fd4e4b8ec6de406335b97e63f7.jpg"
            },
            {
                    "3", "Rob Bourdon", "Nama asli Robert Gregory Bourdon. Dia lahir 20 januari 1979 di Calabasas,California, USA.\n" +
                    "Brad delson di Linkin Park berperan sebagai Drummer. Ia mulai mengenal drum di usia 10 tahun setelah melihat konser konser Aerosmith. Pada masa remaja Rob, dan Brad Delson menempuh pendidikan menengah atas di sekolah yang sama. Bersama Brad, ia memulai kariernya sebagai musisi dan membentuk band bernama Relative Degree agar bisa tampil di theater Roxy, Hollywood.\n" +
                    "Setelah Relative Degree bubar Saat itu, Rob bergabung ke dalam Linkin Park bersama Brad Delson dan Mike Shinoda. Saat itu Linkin Park belum terbentuk sempurna hingga akhirnya mereka merekrut Dave Farell, Joe Hahn, dan Chester Bennington pada band ini.",
                    "https://i2.wp.com/www.moderndrummer.com/wp-content/uploads/2018/02/rb-4.jpeg?resize=469%2C647&ssl=1"
            },
            {
                    "4", "Joe Hahn", " Nama aslinya adalah Joseph Hahn lahir di Dallas, Texas, USA di tanggal 15 Maret 1977 dan besar di Glendale, California.\n" +
                    "Dia adalah anak terakhir dari tiga bersaudara. Joseph Hahn masuk ke dalam daftar personil Linkin Park saat dia bertemu dengan Mike Shinoda di bangku kuliah dan bergabung ke band Mike yaitu Xero lalu berganti nama menjadi Linkin Park. Mr Hahn adalah nama panggungnya. Dia di Linkin Park sebagai turntable, keyboard, dan sampling.",
                    "https://vignette.wikia.nocookie.net/linkinpark/images/9/9a/ALO-097716.jpg/revision/latest?cb=20110412014337"
            },
            {
                    "5", "Brad Delson", " Nama aslinya adalah Bradford Phillip Delson, lahir pada tanggal 1 Desember 1977 di Agoura, California.\n" +
                    "Di daftar personil Linkin Park ia sebagai gitaris. Brad merangkap sebagai bassis juga di album Hybrid Theory karena pada saat itu Dave atau Phoenix keluar dari Linkin Park hanya sebentar karena sedang tur dengan Tasty Snax, band lamanya. Brad dibesarkan di Agoura, California dan sudah berteman dengan Mike Shinoda sejak kecil. Brad merupakan lulusan sarjana bidang komunikasi dan memiliki rencana untuk melanjutkan ke sekolah hukum hingga Hybrid Theory mendapatkan kontrak rekaman.",
                    "https://upload.wikimedia.org/wikipedia/commons/d/d4/Linkin_Park-Rock_im_Park_2014-_by_2eight_3SC0285.jpg"
            },
    };
    public static ArrayList<Lp> getlistData(){
        ArrayList<Lp> list = new ArrayList<>();
        for (String[] aData : data){
            Lp lp = new Lp();
            lp.setId(Integer.parseInt (aData[0]));
           lp.setName(aData[1]);
            lp.setDescription(aData[2]);
           lp.setPhoto(aData[3]);
            list.add(lp);
        }
        return list;
    }
}

