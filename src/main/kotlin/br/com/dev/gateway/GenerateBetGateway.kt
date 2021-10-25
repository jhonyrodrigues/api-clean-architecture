package br.com.dev.gateway

import br.com.dev.domain.BetDomain

interface GenerateBetGateway {
    fun execute(betDomain: BetDomain): BetDomain
}