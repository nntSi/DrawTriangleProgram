fun main(args: Array<String>){
    var num = arrayOf(" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ")
    fun printResult(){
        println(num[0]+num[1]+num[2]+num[3]+num[4]+num[5]+num[6]+num[7]+num[8]+num[9]+num[10]+num[11]+num[12]+num[13]+num[14]+num[15]+num[16]+num[17]+num[18])
    }
    fun Reset(){
        num = arrayOf(" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ")
    }
    fun Full(){
        num = arrayOf(" X", " ", "X", " ", "X", " ", "X", " ", "X", " ", "X", " ", "X", " ", "X", " ", "X", " ", "X")
        printResult()
    }
    for (i in 1..19){
        if (i == 1){
            num[10] = "X"
            printResult()
            Reset()
        }
        if (i == 2){
            num[9] = "X"
            num[11] = "X"
            printResult()
            Reset()
        }
        if (i == 3){
            num[8] = "X"
            num[12] = "X"
            printResult()
            Reset()
        }
        if (i == 4){
            num[7] = "X"
            num[13] = "X"
            printResult()
            Reset()
        }
        if (i == 5){
            num[6] = "X"
            num[14] = "X"
            printResult()
            Reset()
        }
        if (i == 6){
            num[5] = "X"
            num[15] = "X"
            printResult()
            Reset()
        }
        if (i == 7){
            num[4] = "X"
            num[16] = "X"
            printResult()
            Reset()
        }
        if (i == 8){
            num[3] = "X"
            num[17] = "X"
            printResult()
            Reset()
        }
        if (i == 9){
            num[2] = "X"
            num[18] = "X"
            printResult()
            Reset()
        }
        if (i == 10){
            Full()
        }
    }
}