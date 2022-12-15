class DataType {
    fun main() {
        var a: Byte = 1
        var b: Short = 2
        var c: Int = 3
        var d: Long = 4

        println("tipe data $a adalah "+a::class.simpleName)
        println("tipe data $b adalah "+b::class.simpleName)
        println("tipe data $c adalah "+c::class.simpleName)
        println("tipe data $d adalah "+d::class.simpleName)

        var e: Float = 1F
        var f: Double = 2.50

        println("tipe data $e adalah "+e::class.simpleName);println("tipe data $f adalah "+f::class.simpleName)


        var g: Boolean = true
        var h: Boolean = false

        println("tipe data g adalah "+g::class.simpleName);println("tipe data h adalah "+h::class.simpleName)

        var i: Char = '='
        var j: Char = '\u0058'

        println("$i adalah "+i::class.simpleName);println("$j adalah "+j::class.simpleName)

        var k = "Universitas Sumatera Utara"
        var l = "Teknologi Informasi"
        var m = "Ilmu Komputer"

        var n = "Program Studi S-1 $l, $k"
        var o = "Fakultas "+m+" dan "+l+", $k"

        println("$n adalah "+n::class.simpleName)
        println("$o adalah "+o::class.simpleName)

        var q: Short = 2
        val r = "Universitas Sumatera Utra"

        var s = q.toFloat()
        var t = r.uppercase()

        println("Fungsi toFloat() pada tipe data Short: $s")
        println("Fungsi uppercase() pada tipe data String: $t")

        val firstName: String? = null
        val lastName: String? = "mahardika"

        print("check if lastName not null, print to uppercase: "+lastName?.uppercase())

        firstName?.let {
            var fullName = "$firstName $lastName"
            print("name: $fullName")
        }
    }

}