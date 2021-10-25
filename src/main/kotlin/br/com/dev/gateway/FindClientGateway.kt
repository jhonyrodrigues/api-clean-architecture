package br.com.dev.gateway

import br.com.dev.domain.ClientDomain

interface FindClientGateway {
    fun execute(email: String): ClientDomain?
}