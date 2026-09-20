fun main() {
    val player = Personagels(name = "Аня", hp = 1000, damage = 100)
    val elf = Personagels(name = "Эльф", 500, 50)
    val ork = Personagels("Орк", 600, 150)
    val killer = Personagels("Мастер Киллер", 1500, 200)
    val bear = Personagels("Мишка", 200, 30)

    while (true) {
        println("${player.name} (${player.hp})")
        println("${elf.name} (${elf.hp})")
        println("Вы встретили ${elf.name}. Ударить?")
        println("Ударить")
        println("Убежать, как подлый трус")
        val answer = readln()
        when (answer) {
            "1" -> {
            if(player.hp == 0){
                println("Вы умерли! Ваше HP восстановлено.")
                player.hp = 1000
            }
            if(elf.hp == 0){
                println("Твой враг умер! Ты победил!")
                break
            }
                player.attack(elf)
                    elf.attack( enemy = player)
            }
            "2" -> break
        }

    }
}

class Personagels (
    val name : String,
    var hp : Int,
    val damage : Int,
) {
    fun attack(enemy : Personagels) {
        enemy.hp -= damage
    }
}
