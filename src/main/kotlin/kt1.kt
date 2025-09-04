package kotlinstud

class kt1 {

    fun main() {
        // ex 1
        var a: Double
        var b: Double
        while (true) {
            try{
                println("type a")
                a = readln().toDouble()
                println("type b")
                b = readln().toDouble()
                break
            } catch (e: NumberFormatException) {
                print("print nums \n")
                continue
            }
        }

        println("type chymbol")
        val chymbol = readln()
        when(chymbol){
            "+" -> println(a+b)
            "-" -> println(a-b)
            "*" -> println(a*b)
            "/" -> println(a/b)
            else -> println("Неизвестная операция")
        }

        /*
        Задание 2. for if continue
    Выведи все числа от 1 до 20, но пропустите числа, которые делятся на 3.
         */
        for (i in 1..20) {
            if (i %3  ==0) {
                continue;
            }
            println(i)
        }
        /*
        Задание 3. while и do while
    Напиши программу, которая просит пользователя ввести пароль.
    Если пароль неверный - программа снова запрашивает ввод.
    Если пароль совпадает с заранее заданным значением, выводится сообщение
         */
        println("type password")
        val password = "andrey123"
        while(true){
            try{
                val typed = readln()
                if (typed == password){
                    print("Success! Доступ разрешен")
                    break;
                }
                throw RuntimeException("Invalid pass")
            }
            catch(e: RuntimeException){
                println(e.message)
            }
        }
        /*
        Задание 4. Игра «Угадай число»:
    Программа загадывает число от 1 до 100.
    Пользователь вводит предположения.
    После каждой попытки программа выводит подсказку «больше» или «меньше».
    Необходимо ограничить количество попыток (например, 10).
    Реализуйте возможность повторной игры после завершения раунда.
         */
        var playing = true
        while (playing){
            println("новый раунд, новое число")
            val number = Math.random() * 100
            val counts = 10;
            var attempts = 0
            var roundPlay = true;
            while (roundPlay){
                attempts++
                if (attempts > counts) roundPlay = false;
                try{
                    println("type number")
                    val typed = readln().toInt()
                    if (typed == number.toInt()){
                        print("Success! Доступ разрешен \n")
                        roundPlay = false
                        println("Играем дальше? +/-")
                        if (readln() == "+"){
                            playing = true
                        }
                        else playing = false

                    } else if (typed > number.toInt()){
                        print("Меньше!")
                    } else{
                        print("Больше!")
                    }
                } catch (e: NumberFormatException){
                    println("type just number")
                }
            }
        }

    }

}