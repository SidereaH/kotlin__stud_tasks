package kotlinstud

import kotlin.random.Random

class kt2 {
    fun main() {
        /*
        Задание 1 Создать массив из 10 чисел, заполнить его случайными числами от 1 до 50,
и вывести все элементы на экран.
Найти в массиве максимальное и минимальное значение, используя цикл.
Найти сумму всех чисел в массиве с помощью цикла for и функции sum().
         */

        var array1 : Array<Int>  = Array(50) {0}
        var max = 0
        var min = 50
        var sum = 0
        for (i in 0..49) {
            array1[i] = Random.nextInt(1,50);
            println(array1[i])
            if (max < array1[i]) {
                max = array1[i]
            }
            if(min > array1[i]) {
                min = array1[i]
            }
            sum+=array1[i]
        }
        println("sum = $sum, min = $min, max = $max")

        println("sum2 " + array1.sum())

        /*
        Задание 2. Преобразовать массив чисел из прошлого задания в массив их квадратов,
используя функцию map.
Для двумерных массивов
         */
        val quads = array1.map { it * it }
        quads.forEach(::println)
        /*
        Задание 3. Создать матрицу 3x3 и заполнить её случайными числами от 1 до 9,
вывести на экран в виде таблицы.
Найти сумму всех элементов двумерного массива.
Найти сумму элементов каждой строки и вывести отдельно.
Найти сумму элементов каждой колонки и вывести отдельно.
         */

        val triparr = Array(3) {  Array<Int>(3) { 0 } }
        var allSum = 0
        var lineSum = 0
        var columnSum = 0
        for(i in 0 .. triparr.size-1) {
            println()
            for(j in triparr[i]){
                triparr[i][j] = Random.nextInt(1,9)
                allSum+=triparr[i][j]
                print(triparr[i][j].toString()+" \t")
            }
        }
        println()
        for(i in 0..triparr.size-1) {
            for(j in 0..triparr[i].size-1) {
                lineSum+=triparr[i][j]

            }
            println("$i line sum = $lineSum")
            for (j in 0..triparr[i].size-1) {
                columnSum+=triparr[j][i]
            }
            println("$i column sum = $lineSum")
        }
        /*
        Задание 4. Создать двумерный массив 4x4, заполнить случайными числами от 1 до
100 и вывести элементы, которые больше 50.
Для коллекций
         */
        val fourarr = Array(4) {  Array<Int>(4) { 0 } }

        for(i in 0 .. fourarr.size-1) {
            println()
            for(j in 0 .. fourarr[i].size-1){
                fourarr[i][j] = Random.nextInt(1,100)
                allSum+=fourarr[i][j]
//                print(triparr[i][j].toString()+" \t")
            }
        }
        fourarr.map { it.filter { it > 50 } }.forEach(::println)

    /*
    Задание 5. Есть список слов. Составить новый список, содержащий длину каждого
слова.
     */
        val wordList = listOf("Hello", "World", "Java", "Kotlin")
        val lengthList = wordList.map { it.length}
        println(lengthList)

        /*
        Задание 6. Дан список чисел. С помощью filter выберите только положительные числа,
а затем с помощью map преобразуйте их в строки вида "Число: <значение>".
С помощью цепочки функций (filter, map, sum) посчитайте сумму квадратов всех чётных чисел.
         */
        val numList = listOf(-1,-2,-3,-4,5,6,7,8,9,10)
        println(numList.filter { it > 0 }.map { "Число: $it" })
        println(numList.filter { it%2 == 0 }.map { it*it }.sum())


    }
}