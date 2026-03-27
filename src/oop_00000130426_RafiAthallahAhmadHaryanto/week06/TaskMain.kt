package oop_00000130426_RafiAthallahAhmadHaryanto.week06

fun main() {
    val hub = SmartHomeHub()
    hub.addDevice(SmartLamp("1", "Ruang Tamu"))
    hub.addDevice(SmartSpeaker("1", "Google Nest Dapur"))
    hub.addDevice(SmartCCTV("1", "Ezviz Garasi"))

    hub.activateSecurityMode()  // Activate Security Mode
    hub.turnOffAllSwitches()    // Turn off all devices
}