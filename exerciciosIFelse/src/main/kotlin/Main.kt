fun main(args: Array<String>) {
    //exercicio1()
    //exercicio2()
    //exercicio3()
    //exercicio4()
}

///////////EXERCÍCIO 1 - TRIÂNGULO

fun exercicio1():Unit {

    println("Digite a medida do 1ª lado do triângulo:")
    val side1 = readLine()!!.toFloat()
    println("Digite a medida do 2ª lado do triângulo:")
    val side2 = readLine()!!.toFloat()
    println("Digite a medida do 3ª lado do triângulo:")
    val side3 = readLine()!!.toFloat()

    if ((side1 == side2) && (side2 == side3) && (side1 == side3)) {
        println("O triângulo é Equilátero.")
    } else if ((side1 != side2) && (side2 != side3) && (side1 != side3)) {
        println("O triângulo é Escaleno.")
    } else if ((side1 != side2) || (side2 != side3) || (side1 != side3)) {
        println("O triângulo é isósceles.")
    } else println("Algo deu errado...")
}
///////////EXERCÍCIO 2 - ANO BISSEXTO

fun exercicio2():Unit {

    println("Digite um ano:")
    val leapYearCheck = readLine()!!.toInt()

    if ((leapYearCheck % 4 == 0) && (leapYearCheck % 100 != 0)) {
        println("O ano $leapYearCheck é bissexto.")
    } else if ((leapYearCheck % 4 == 0) && (leapYearCheck % 100 == 0) && (leapYearCheck % 400 == 0)) {
        println("O ano $leapYearCheck é bissexto.")
    } else println("O ano $leapYearCheck não é bissexto.")

}
///////////EXERCÍCIO 3 - ASSASSINATO

fun exercicio3():Unit{

    var answerCount:Int = 0

    println("Responda as perguntas com 's' ou 'n' (sim ou não)")

    println("Telefonou para a vítima?")
    val q1 = readLine()!!
    if(q1.equals("s",true)) {answerCount++}

    println("Esteve no local do crime?")
    val q2 = readLine()!!
    if(q2.equals("s",true)) {answerCount++}

    println("Mora perto da vítima?")
    val q3 = readLine()!!
    if(q3.equals("s",true)) {answerCount++}

    println("Devia para a vítima?")
    val q4 = readLine()!!
    if(q4.equals("s",true)) {answerCount++}

    println("Já trabalhou com a vítima?")
    val q5 = readLine()!!
    if(q5.equals("s",true)) {answerCount++}

    if(answerCount==5) {
        println("Você é o Assassino!!!")
    } else if ((answerCount<5)&&(answerCount>2)) {
        println("Você é um cúmplice.")
    } else if (answerCount==2) {
        println("Você é suspeito.")
    } else println("Você é inocente.")

}

///////////EXERCÍCIO 4 - ÁLCOOL E GASOLINA

fun exercicio4():Unit{

    val a_price:Float = 0.19f
    val g_price:Float = 0.39f

    println("Digite 'a' para Álcool ou 'g' para Gasolina:")
    val fill_decide = readLine()!!
    if(fill_decide.equals("a",true)) {
        println("Faça seu pedido de Álcool (em litros):")
        val fill_amount = readLine()!!.toFloat()

        if (fill_amount>20) {
            val checkout:Float = ((a_price*fill_amount)*0.95f)
            System.out.printf("Valor a pagar em Álcool: %.2fR$\n",checkout)
            println("(Você teve 5% de desconto)")
        } else {
            val checkout:Float = ((a_price*fill_amount)*0.97f)
            System.out.printf("Valor a pagar em Álcool: %.2fR$\n",checkout)
            println("(Você teve 3% de desconto)")
        }
    }

    else if (fill_decide.equals("g",true)) {

        println("Faça seu pedido de Gasolina (em litros):")
        val fill_amount = readLine()!!.toFloat()

        if (fill_amount>20) {
            val checkout:Float = ((g_price*fill_amount)*0.94f)
            System.out.printf("Valor a pagar em Gasolina: %.2fR$\n",checkout)
            println("(Você teve 6% de desconto)")
        } else {
            val checkout:Float = ((g_price*fill_amount)*0.96f)
            System.out.printf("Valor a pagar em Gasolina: %.2fR$\n",checkout)
            println("(Você teve 4% de desconto)")
        }

    } else println("<OPÇÃO INVÁLIDA>");
}