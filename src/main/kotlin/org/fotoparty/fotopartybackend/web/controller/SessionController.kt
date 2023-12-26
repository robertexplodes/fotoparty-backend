package org.fotoparty.fotopartybackend.web.controller

import org.fotoparty.fotopartybackend.service.SessionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/game")
class SessionController(
    private val sessionService: SessionService
) {

    /**
     *  create a game session
     *
     * @return a six digit code, that identifies the game
     */
    @GetMapping("/create")
    fun createGame(): Int {
        return sessionService.createGame()
    }
}