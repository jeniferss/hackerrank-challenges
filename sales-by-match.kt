fun sockMerchant(n: Int, ar: Array<Int>): Int {

    var hashSet = HashSet<Int>()
    var pairs = 0

    ar.sort()

	    for (index in 0..(n-1)) {

      var currentElement = ar[index]

      if (hashSet.contains(currentElement)) {
        hashSet.remove(currentElement)
        pairs++
      } else {
       hashSet.add(currentElement)
      }
    }

    return pairs
}
