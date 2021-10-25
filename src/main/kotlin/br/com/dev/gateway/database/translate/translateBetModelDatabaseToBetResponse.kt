package br.com.dev.gateway.database.translate

import br.com.dev.gateway.database.model.BetModelDatabase
import br.com.dev.response.BetResponse

fun translateBetModelDatabaseToBetResponse(betModelDatabase: BetModelDatabase) = BetResponse(
        betModelDatabase.betId,
        betModelDatabase.bet!!
)