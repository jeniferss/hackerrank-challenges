fun repeatedString(s: String, n: Long): Long {

var c = 0
var ca = 0
var r = n % s.length

 for (i in 0..(s.length-1)) {
    if (s[i] == 'a') ++c
    if (i < r) ++ca
  }
  return (((n - r) / s.length * c) + ca)
}
