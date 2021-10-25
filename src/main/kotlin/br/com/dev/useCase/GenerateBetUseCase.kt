package br.com.dev.useCase

import br.com.dev.domain.BetDomain
import br.com.dev.domain.ClientDomain
import br.com.dev.gateway.CreateClientGateway
import br.com.dev.gateway.FindClientGateway
import br.com.dev.gateway.GenerateBetGateway
import org.springframework.stereotype.Component
import java.util.*

@Component
class GenerateBetUseCase(
        private val generateBetGateway: GenerateBetGateway,
        private val createClientGateway: CreateClientGateway,
        private val findClientGateway: FindClientGateway,
) {
    fun execute(email: String): BetDomain {

        val client = findClientGateway.execute(email)

        if (client == null) {
            createClientGateway.execute(email)
        }

        var sort = Random()

        var bet: String = ""

        for (i in 0..11) {
            bet += sort.nextInt(10).toString()
        }

        val betDomain = BetDomain(client = ClientDomain(email), bet = bet)

        return generateBetGateway.execute(betDomain)
    }
}