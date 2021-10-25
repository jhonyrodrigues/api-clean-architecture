package br.com.dev.gateway.database.translate

import br.com.dev.domain.BetDomain
import br.com.dev.gateway.database.model.BetModelDatabase
import br.com.dev.gateway.database.model.ClientModelDatabase

fun translateBetDomainToBetModelDatabase(betDomain: BetDomain) =
        BetModelDatabase(ClientModelDatabase(betDomain.client!!.email), betDomain.bet)
