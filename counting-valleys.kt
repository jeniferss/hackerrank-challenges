fun countingValleys(steps: Int, path: String): Int {

    val chars: CharArray = path.toCharArray()
    var level = 1
    var v = 0

    for (index in 0..(steps-1)) {
        if(chars[index].toString() == "U") level++
        if(chars[index].toString() == "D") level--
        if(chars[index].toString() == "U" && level == 1) v++
    }

    return v
}
