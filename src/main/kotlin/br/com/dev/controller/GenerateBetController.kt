package br.com.dev.controller

import br.com.dev.controller.api.GenerateBetApi
import br.com.dev.domain.BetDomain
import br.com.dev.useCase.GenerateBetUseCase
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class GenerateBetController(val generateBetUseCase: GenerateBetUseCase) : GenerateBetApi {

    private val LOGGER = LoggerFactory.getLogger(GenerateBetController::class.java)

    override fun execute(email: String): ResponseEntity<BetDomain> {

        val response = generateBetUseCase.execute(email)

        LOGGER.info("new register, betId: ${response.betId}")

        return ResponseEntity.status(HttpStatus.CREATED).body(response)
    }
}