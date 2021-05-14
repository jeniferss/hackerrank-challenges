fun jumpingOnClouds(c: Array<Int>): Int {

    var arSize = c.size
    var clouds = mutableListOf<Int>()
    var currentCloud = 0
    var jumps = 0
    var e = 0

    for (i in 0..(arSize-1)) {
        if(c[i] == 0) clouds.add(i)
    }

     while (e < clouds.size-1) {
        currentCloud = clouds[e]
            if((e+2 < clouds.size-1) && (currentCloud + 2) == clouds[e+2]) {
                jumps++
                e = e+2
            } else {
		            e++
		            jumps++
            }
     }

    return jumps
}
