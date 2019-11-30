fun main()
{
    val x = intArrayOf(3,4,2,5,1)
    for (i in 0..4)
    {
        for (j in 0 until 5-1)
        {

            if (x[j] > x[j + 1])
            {
                val temp = x[j]
                x[j] = x[j + 1]
                x[j + 1] = temp
            }
        }

    }
    println("sorted numbers")
    for (i in 0..4)
    {
        println(" "+x[i])

    }
}
