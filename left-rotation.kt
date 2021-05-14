fun rotLeft(a: Array<Int>, d: Int): Array<Int> {

var finAr = a.toMutableList()
var uncompleteRounds = d % a.size
if(d < a.size) uncompleteRounds = d

    for(e in 0..a.size-1){
    if(e - uncompleteRounds < 0) finAr[(e - uncompleteRounds + a.size)] = a[e]
    if(e - uncompleteRounds >= 0) finAr[(e - uncompleteRounds)] = a[e]
    }

    return finAr.toTypedArray()
}
