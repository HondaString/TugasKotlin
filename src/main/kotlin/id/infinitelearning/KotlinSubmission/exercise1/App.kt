package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */

fun myProfile() {
    val firstName: String = "Andika Kurnia"
    println("My First Name is : $firstName")

    val lastName: String = "Sandi Yuda"
    println("My Last Name is : $lastName")

    val sex: String = "Laki-Laki"
    println("My Gender is : $sex")

    val age: Int = 25
    println("My Age is : $age")

    val Single: Boolean = false
    val TidakSingle: Boolean = true

    println("Status Kamu adalah = " +  (Single && TidakSingle)) // Mengembalikan nilai true jika kedua operan benar
    println("Status Kamu adalah = " +  (Single || TidakSingle)) // Mengembalikan nilai true jika salah satu operan benar
    println("Status Kamu adalah = " +  (!TidakSingle)) // Membalikkan hasilnya, mengembalikan false jika operannya true
    println("Status Kamu adalah = " +  (Single > TidakSingle))

}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println(groupId)
    println(groupMember)
    println(session)
    return arrayOf(groupId, groupMember, session)
}


/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun myName(): String {
    val team: String = "Andika Kurnia Sandi Yuda, Yuris, Luciana, Sandy, Thariqi"
    println("My team is : $team")
    return "Andika Kurnia Sandi Yuda"
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Sani", "Ardy", "Reza")
    val countOfGroup = 5
    return mentor.count()  + countOfGroup;

}

fun main() {

    myProfile()

    val myName = myName()
    println("My Name is: $myName")


    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Group 3",listOf("5 member", "Infinite Learning", "Food & Beverage"), "Afternoon")

}