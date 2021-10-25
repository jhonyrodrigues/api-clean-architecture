package br.com.dev.gateway.database.translate

import br.com.dev.domain.BetDomain
import br.com.dev.domain.ClientDomain
import br.com.dev.gateway.database.model.BetModelDatabase

fun translateBetModelDatabaseToBetDomain(betModelDatabase: BetModelDatabase) =
        BetDomain(betModelDatabase.betId, ClientDomain(betModelDatabase.client.email), betModelDatabase.bet)