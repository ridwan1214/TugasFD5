class Controller(private val callBack: CallBack) {
    fun hitungLuas(angka1: Int){
        val hasilLuas = angka1 * angka1
        callBack.tampilkanHasil(hasilLuas)
    }
    fun hitungKeliling(angka1: Int){
        val hasilKeliling = 4 * angka1
        callBack.tampilkanHasil(hasilKeliling)
    }

    fun luasSegitiga(angka1: Int, angka2: Int) {
        val luasSeg = angka1 * angka2 * 0.5
        callBack.tampilkanHasilDouble(luasSeg)
    }

    fun kelilingSegitiga(angka1: Int){
        val kelSeg = 3 * angka1
        callBack.tampilkanHasil(kelSeg)
    }
}