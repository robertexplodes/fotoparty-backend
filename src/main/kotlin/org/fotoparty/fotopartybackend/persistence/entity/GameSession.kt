package org.fotoparty.fotopartybackend.persistence.entity

import org.springframework.data.annotation.Id


data class GameSession(
    @Id
    val gameCode: Int,
)
