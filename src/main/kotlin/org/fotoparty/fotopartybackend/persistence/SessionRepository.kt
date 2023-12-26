package org.fotoparty.fotopartybackend.persistence

import org.fotoparty.fotopartybackend.persistence.entity.GameSession
import org.springframework.data.mongodb.repository.MongoRepository


interface SessionRepository : MongoRepository<GameSession, Int> {
}