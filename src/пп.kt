fun main () {
    var HP = 100
    var damage = 10
    var enemyHP = 50
    var enemydamage = 20
    while (HP > 0 && enemyHP > 0) {
        println(" да/нет")
        var p = readLine()
        if (p == "да")
            enemyHP -= damage
        println("нанести урон ? да / нет")
        var o = readLine()

        if (o == "да")
            HP -= enemydamage
        println(HP)
        println(enemyHP)
    }
    if (HP == 0)
        println(" ты умер ")
    else println("я умер ")

}