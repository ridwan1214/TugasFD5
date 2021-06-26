class Main {
    companion object : CallBack {

        @JvmStatic
        fun main(args: Array<String>) {

            val ulang = true
            do {
                println("Mau Hitung bangun datar apa ? ")
                println("1. Hitung Luas Persegi")
                println("2. Hitung Keliling Persegi")
                println("3. Hitung Luas Segitiga")
                println("4 Hitung Keliling Segitiga")
                print("Tentukan pilihanmu : ")
                val input = readLine()?.toInt() ?: 0

                var angka1: Int = 0
                var angka2: Int = 0
                when (input){
                    1,2,4 -> {
                        print("Masukkan Nilai 1 : ")
                        angka1 = readLine()?.toInt() ?: 0
                    }
                    3 -> {
                        print("Masukkan Nilai 1 : ")
                        angka1 = readLine()?.toInt() ?: 0
                        print("Masukkan Nilai 2 : ")
                        angka2 = readLine()?.toInt() ?: 0
                    }
                }


                val controller = Controller(this)
                when (input) {
                    1 -> controller.hitungLuas(angka1)
                    2 -> controller.hitungKeliling(angka1)
                    3 -> controller.luasSegitiga(angka1, angka2)
                    4 -> controller.kelilingSegitiga(angka1)
                    else -> println("Salah input pilihan")
                }

            } while (ulang)
        }

        override fun tampilkanHasil(nilai: Int) {
            println("hasil nya adalah $nilai")
        }

        override fun tampilkanHasilDouble(nilai: Double) {
            println("hasil nya adalah $nilai")
        }
    }
}