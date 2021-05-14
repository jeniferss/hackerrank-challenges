fun hourglassSum(arr: Array<Array<Int>>): Int {

var max = 3;
var sumFinal = -64;


for (c in 0..max) {
    for (l in 0..max) {
        var sum = arr[c][l] + arr[c][l+1] + arr[c][l+2];
        sum += arr[c+1][l+1];
        sum += arr[c+2][l] + arr[c+2][l+1] + arr[c+2][l+2]

            if (sumFinal < sum)
                 sumFinal = sum
        }
    }

    return sumFinal;
}
