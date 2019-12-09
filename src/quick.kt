fun partition(cafe: IntArray, l: Int, r: Int): Int {
    var left = l
    var right = r
    val pivot = cafe[left]
    while (left <= right){
        while (cafe[left] < pivot)
            left++
        while (cafe[right] > pivot)
            right--
        if (left <= right){
            swapCafe(cafe,left,right)
            left++
            right--


        }

    }
    return left
}

fun quicksort(cafe: IntArray, left: Int, right: Int) {
    val index = partition (cafe, left, right)
    if(left < index-1) {
        quicksort(cafe, left,index-1)
    }
    if(index < right) {
        quicksort(cafe, index, right)
    }
}


fun main(args: Array<String>) {
    val cafe = intArrayOf(50, 5, 49, 3, 6, 99, 10, 10, 3, 9, 45, 0)
    quicksort(cafe, 0, cafe.size-1)
    for(i in cafe) println(i)
}

fun swapCafe(a: IntArray, b: Int, c: Int){
    val temp = a[b]
    a[b] = a[c]
    a[c] = temp
}