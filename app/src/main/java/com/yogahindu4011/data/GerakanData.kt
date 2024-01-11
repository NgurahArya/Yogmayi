package com.yogahindu4011.data

import androidx.annotation.DrawableRes
import com.yogahindu4011.R


data class GerakanYoga(
    val id: Int = 0,
    @DrawableRes val imageUrl: Int = 0,
    val namaGerakan: String = "",
    val namaGerakanLoc: String = "",
    val caraMelakukan: List<String> = emptyList(),
    val tips: List<String> = emptyList()
)


val gerakan1 =
    GerakanYoga(
        id = 1,
        imageUrl = R.drawable.ic_stand_pose,
        namaGerakan = "Pranamasana",
        namaGerakanLoc = "Sikap Berdoa",
        caraMelakukan = listOf(
            "1. Berdiri tegak dengan kedua kaki merapat",
            "2. Letakkan kedua telapak tangan bersamaan di depan dada.",
            "3. Tahan posisi ini dengan pernafasan yang dalam dan teratur."
        ),
        tips = listOf(
            "Bernafas dengan dalam menggunakan pernafasan perut ulangi selama 5-7 kali."
        )
    )

val gerakan2 =
    GerakanYoga(
        id = 2,
        imageUrl = R.drawable.ic_handsup_pose,
        namaGerakan = "Hasta Uttanasana",
        namaGerakanLoc = "Sikap Kedua Lengan Terangkat",
        caraMelakukan = listOf(
            "1. Tarik nafas kemudian angkatlah kedua lengan di atas kepala.",
            "2. Kedua lengan direggangkan sesuai lebar bahu.",
            "3. Buang  nafas kemudian tekuklah kepala dan tubuh bagian atas ke belakang semampunya.",
            "4. Tahan posisi semampunya sambil melakukan pernafasan yang dalam dan teratur.",
            "5. Tarik nafas kemudian kembali ke posisi semula perlahan-lahan."
        ),
        tips = listOf(
            "1. Untuk variasi yang lebih mudah tekuk lutut selama melakukan sikap atau hanya mengangkat kedua tangan.",
            "2. Perempuan yang sedang hamil dan menstruasi dianjurkan tidak melakukan sikap ini."
        )
    )

val gerakan3 =
    GerakanYoga(
        id = 3,
        imageUrl = R.drawable.ic_feettouch_pose,
        namaGerakan = "Padahastasana",
        namaGerakanLoc = "Sikap Tangan Menyentuh Kaki",
        caraMelakukan = listOf(
            "1. Berdiri tegak, tarik nafas dalam kemudian membungkuklah ke depan hingga jari-jari tangan atau kedua tangan menyentuh tanah pada sisi atau depan kedua kaki.",
            "2. Cobalah menyentuh lutut dengan dahi anda.",
            "3. Buang nafas perlahan sambil mencoba agar tangan menyentuh lantai.",
            "4. Tahan selama yang anda mampu dengan pernafasan yang dalam dan teratur."
        ),
        tips = listOf(
            "1. Cobalah untuk mempertahankan agar punggung tidak melengkung.",
            "2. Jika terlalu sulit cobalah dengan lutut seidikit di tekuk."
        )
    )

val gerakan4 =
    GerakanYoga(
        id = 4,
        imageUrl = R.drawable.ic_stretch_pose,
        namaGerakan = "Asva Sancalanasana",
        namaGerakanLoc = "Sikap Menunggang Kuda",
        caraMelakukan = listOf(
            "1. Tarik nafas kemudian rentangkan kaki kanan ke belakang sejauh mungkin.",
            "2. Pada waktu bersamaan tekuklah lutut kiri tetapi tahanlah agar kaki kiri tetap pada posisi yang sama.",
            "3. Tempatkan dada pada lutut kiri dengan tangan berada pada samping kiri dan kanan kaki kiri.",
            "4. Kepala harus dimiringkan ke belakang, punggung dilekungkan dan pandangan ditujukan ke atas."
        ),
        tips = listOf(
            "Cari keseimbangan yang sesuai saat merenggangkan kaki ke belekang."
        )
    )

val gerakan5 =
    GerakanYoga(
        id = 5,
        imageUrl = R.drawable.ic_mountain,
        namaGerakan = "Parvatasana",
        namaGerakanLoc = "Sikap Gunung",
        caraMelakukan = listOf(
            "1. Dari Sikap Menunggang Kuda, hembuskan nafas kemudian luruskan kaki kiri sehingga sejajar dengan kaki kanan.",
            "2. Tarik nafas dalam kemudian angkat pinggul menggantung dan turunkan kepala sehingga berada di antara kedua lengan.",
            "3. Cobalah untuk menahan agar kedua tumit bersentuhan dengan lantai dan punggung tetap lurus pada sikap ini."
        ),
        tips = listOf(
            "1. Tekuk lutut agar punggung tidak membungkuk.",
            "2. Beri jarak antar kaki agar tumit dapat bersentuhan dengan lantai."
        )
    )

val gerakan6 =
    GerakanYoga(
        id = 6,
        imageUrl = R.drawable.ic_face_posture_sit,
        namaGerakan = "Astanga Namaskara",
        namaGerakanLoc = "Sikap Pemberian Hormat",
        caraMelakukan = listOf(
            "1.Dari Sikap Gunung, hembuskan nafas kemudian rendahkan dagu, dada dan lutut ke lantai.",
            "2.Posisikan kaki dimana hanya jari-jari kaki menyetuh lantai.",
            "3.Pinggul dan perut tetap dalam posisi terangkat."
        ),
        tips = listOf(
            "Turunkan lutut terlebih dahulu jika terasa sulit"
        )
    )

val gerakan7 =
    GerakanYoga(
        id = 7,
        imageUrl = R.drawable.ic_face_posture_sit,
        namaGerakan = "Bhujangasana",
        namaGerakanLoc = "Sikap Cobra",
        caraMelakukan = listOf(
            "1. Dari Sikap Pemberian Hormat, tarik nafas dalam kemudian angkat badan dengan luruskan kedua tangan.",
            "2. Lengkungkan punggung dan kepla ke belakang perlahan dan semampunya."
        ),
        tips = listOf(
            "Jaga posisi leher tetap lurus jika anda memiliki keadaan darah tinggi"
        )
    )

