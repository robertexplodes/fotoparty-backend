package org.fotoparty.fotopartybackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FotopartyBackendApplication

fun main(args: Array<String>) {
    runApplication<FotopartyBackendApplication>(*args)
}
