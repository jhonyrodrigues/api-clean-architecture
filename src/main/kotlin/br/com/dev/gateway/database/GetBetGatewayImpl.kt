package br.com.dev.gateway.database

import br.com.dev.gateway.GetBetGateway
import br.com.dev.gateway.database.repository.BetRepository
import br.com.dev.gateway.database.translate.translateBetModelDatabaseToBetResponse
import br.com.dev.gateway.exception.GetBetGatewayException
import br.com.dev.response.BetResponse
import org.springframework.stereotype.Component

@Component
class GetBetGatewayImpl(private val betRepository: BetRepository) : GetBetGateway {
    override fun findByEmail(email: String): List<BetResponse> {
        try {
            return betRepository.findByClientEmail(email).map { bet ->
                translateBetModelDatabaseToBetResponse(bet)
            }
        } catch (e: Exception) {
            throw GetBetGatewayException("[Gateway] - Problem to find all bet", e)
        }
    }
}