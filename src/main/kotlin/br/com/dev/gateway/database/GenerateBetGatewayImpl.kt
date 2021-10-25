package br.com.dev.gateway.database

import br.com.dev.domain.BetDomain
import br.com.dev.gateway.GenerateBetGateway
import br.com.dev.gateway.database.repository.BetRepository
import br.com.dev.gateway.database.translate.translateBetDomainToBetModelDatabase
import br.com.dev.gateway.database.translate.translateBetModelDatabaseToBetDomain
import br.com.dev.gateway.exception.GenerateBetGatewayException
import org.springframework.stereotype.Component

@Component
class GenerateBetGatewayImpl(private val betRepository: BetRepository) : GenerateBetGateway {
    override fun execute(betDomain: BetDomain): BetDomain {
        try {
            val betModelDatabase = translateBetDomainToBetModelDatabase(betDomain)
            betRepository.save(betModelDatabase)
            return translateBetModelDatabaseToBetDomain(betModelDatabase)
        } catch (e: Exception) {
            throw GenerateBetGatewayException("[Gateway] - Problem to genereted bet.", e)
        }
    }
}