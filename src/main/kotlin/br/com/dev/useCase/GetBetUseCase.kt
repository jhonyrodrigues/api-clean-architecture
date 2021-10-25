package br.com.dev.useCase

import br.com.dev.gateway.GetBetGateway
import br.com.dev.response.BetResponse
import org.springframework.stereotype.Component

@Component
class GetBetUseCase(private val betGateway: GetBetGateway) {
    fun execute(email: String): List<BetResponse> {
        return betGateway.findByEmail(email)
    }
}