package oop_00000130426_RafiAthallahAhmadHaryanto.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Loot didapat: $name (Damage: $damage, Rarity: $rarity)")
        }

        is BattleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Kamu berada di zona aman. Istirahat dulu.")
        }
    }
}