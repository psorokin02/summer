import business.police.Policeman
import business.Room
import business.announcement.Announcer

class CoronaDisinfector() {

    private lateinit var policeman: Policeman
    private lateinit var announcer: Announcer

    fun start(room: Room) {
        announcer.announce("Начинаем дезинфекцию, все вон!")
        policeman.makePeopleLeaveRoom(room)
        disinfect(room)
        announcer.announce("Закончили дезинфекцию, заходите!")
    }

    private fun disinfect(room: Room) {
        println("Start to disinfect room: ${room.name}")
    }

}