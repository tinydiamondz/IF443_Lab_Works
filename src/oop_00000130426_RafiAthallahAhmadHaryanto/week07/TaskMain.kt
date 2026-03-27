package oop_00000130426_RafiAthallahAhmadHaryanto.week07

fun main() {

    // 🔥 Start Game
    GameManager.startGame()
    GameManager.startGame()

    // 🎲 Enum Simulation
    println("\nLegendary Item Drop Chance: ${ItemRarity.LEGENDARY.dropChance}%")

    // ⚔️ Factory - Starter Weapon
    val starterWeapon = Weapon.forgeStarterSword()

    println("\nStarter Weapon:")
    println("Nama: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")

    // 🔨 Blacksmith Upgrade (copy)
    val upgradedItem = starterWeapon.item.copy(damage = 25)

    println("\nSetelah upgrade di Blacksmith:")
    println("Nama: ${upgradedItem.name}")
    println("Damage: ${upgradedItem.damage}")
    println("Rarity: ${upgradedItem.rarity}")

    // 🎮 Simulasi Event
    println("\n=== Simulasi Event ===")

    processEvent(BattleState.SafeZone)

    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))

    processEvent(BattleState.LootDropped(upgradedItem))

    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}