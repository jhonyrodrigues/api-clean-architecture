package br.com.dev.gateway.database

import br.com.dev.gateway.CreateClientGateway
import br.com.dev.gateway.database.model.ClientModelDatabase
import br.com.dev.gateway.database.repository.ClientRepository
import br.com.dev.gateway.exception.CreateClientGatewayException
import org.springframework.stereotype.Component

@Component
class CreateClientGatewayImpl(private val clientRepository: ClientRepository) : CreateClientGateway {
    override fun execute(email: String) {
        try {
            val client = ClientModelDatabase(email)
            clientRepository.save(client)
        } catch (e: Exception) {
            throw CreateClientGatewayException("[Gateway] - Problem to save client.", e)
        }
    }
}