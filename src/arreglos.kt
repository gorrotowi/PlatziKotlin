fun main(args: Array<String>) {

    val arrA = intArrayOf(1, 232, 435, 6, 21, 6)
    val listA = arrayListOf("Hola", "Kotlin", "Java", "Android")

    val num = arrA[0]
    arrA[2] = 10

    val mutableList = mutableListOf(2, 3, 4, 5, 6, 7)
    mutableList.add(9)
    mutableList.add(2, 10)
    mutableList[0] = 1

    val map = mutableMapOf<String, Int>(Pair("Key", 30))
    map.put("key2", 40)

}