package org.fotoparty.fotopartybackend.service

import org.fotoparty.fotopartybackend.persistence.SessionRepository
import org.fotoparty.fotopartybackend.persistence.entity.GameSession
import org.springframework.stereotype.Service
import java.util.*

@Service
class SessionService(
    private val sessionRepository: SessionRepository
) {

    companion object {
        val random: Random = Random()
        const val GAME_CODE_LOWER_BOUND = 100_000
        const val GAME_CODE_UPPER_BOUND = 999_999
    }


    fun createGame(): Int {
        val gameCode = random.nextInt(GAME_CODE_LOWER_BOUND, GAME_CODE_UPPER_BOUND)
        val session = GameSession(gameCode)
        sessionRepository.save(session)

        return gameCode
    }
}