package br.com.dev.domain

data class BetDomain(
        var betId: String? = null,
        val client: ClientDomain? = null,
        val bet: String? = null,
)