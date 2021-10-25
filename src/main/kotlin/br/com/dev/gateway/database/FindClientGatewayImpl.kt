package br.com.dev.gateway.database

import br.com.dev.domain.ClientDomain
import br.com.dev.gateway.FindClientGateway
import br.com.dev.gateway.database.repository.ClientRepository
import br.com.dev.gateway.exception.FindClientGatewayException
import org.springframework.stereotype.Component

@Component
class FindClientGatewayImpl(private val clientRepository: ClientRepository) : FindClientGateway {
    override fun execute(email: String): ClientDomain? {
        try {
            val clientModelDatabase = clientRepository.findByEmail(email)

            if (clientModelDatabase.isPresent) {
                return ClientDomain(email)
            }
            return null

        } catch (e: Exception) {
            throw FindClientGatewayException("[Gateway] - Problem to search client", e)
        }
    }
}