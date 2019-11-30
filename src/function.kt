fun largestNum()
{
    val x = intArrayOf(10,20,30,40,50)
    val y = intArrayOf(60,70,80,90,100)
    var i = 1

    while (i<5){
        if (i < x[i])
        {
             val temp = x[i]
            x[i] = temp

        }
        i = i + 1
        if (i < y[i])
        {
           val temp = y[i]
            y[i] = temp

        }
    }
}
fun main ()
{
    println("the largest no is ")
    largestNum()

}