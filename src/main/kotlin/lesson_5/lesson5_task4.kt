package org.example.lesson_5

fun main() {
    println("""Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold". 
        |[вздыхает...] 
        |Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. 
        |Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь.
        |[вздыхает ещё глубже...] 
        |Да, вперед, пожалуйста, вводите свои данные...""".trimMargin())

    val enteredUserLogin = readLine()
    val registeredUserLogin = "Zaphod"

    if (enteredUserLogin != registeredUserLogin) {
        println("Вам нужно пройти регистрацию")
        return
    }

    println("Теперь введите пароль")
    val enteredUserPassword = readLine()
    val registeredUserPassword = "PanGalactic"

    if (enteredUserPassword == registeredUserPassword) {
        println("""[вздыхает...]
            |Ваши данные проверены, и о, чудо, они верны... 
            |Пользователь "$enteredUserLogin", вам разрешено входить на борт корабля "Heart of Gold".
            |Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... 
            |[меланхолический вздох...] 
            |Надеюсь, вам понравится пребывание здесь больше, чем мне.""".trimMargin())
    }
    else println("Введен неверный пароль")
}