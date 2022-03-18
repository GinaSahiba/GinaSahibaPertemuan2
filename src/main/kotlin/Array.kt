fun main() {
    //Array
    //menggunakan fungsi  arrayOf()
    //arrayOf(1,2,3) berarti membuat array dengan item[1,2,3]

    var arrA = arrayOf<Int>()
    arrA += 34
    println(arrA[0])

    var arrB = arrayOf<Int>()
    for (i in 1..10) {
        arrB += i
    }

    for (i in arrB) {
        print("$i ")
    }
}