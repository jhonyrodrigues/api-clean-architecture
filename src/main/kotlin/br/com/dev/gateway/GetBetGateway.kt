package br.com.dev.gateway

import br.com.dev.response.BetResponse

interface GetBetGateway {
    fun findByEmail(email: String): List<BetResponse>
}