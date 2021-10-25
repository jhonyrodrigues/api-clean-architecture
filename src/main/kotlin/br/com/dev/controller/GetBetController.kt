package br.com.dev.controller

import br.com.dev.controller.api.GetBetApi
import br.com.dev.response.BetResponse
import br.com.dev.useCase.GetBetUseCase
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class GetBetController(private val getBetUseCase: GetBetUseCase) : GetBetApi {

    private val LOGGER = LoggerFactory.getLogger(GetBetController::class.java)

    override fun execute(email: String): ResponseEntity<List<BetResponse>> {

        val response = getBetUseCase.execute(email)

        LOGGER.info("listing bets, user: $email")

        return ResponseEntity.ok(response)
    }
}