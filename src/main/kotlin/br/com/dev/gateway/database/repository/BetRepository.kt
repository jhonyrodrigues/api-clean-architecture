package br.com.dev.gateway.database.repository

import br.com.dev.gateway.database.model.BetModelDatabase
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BetRepository : CrudRepository<BetModelDatabase, String> {
    fun findByClientEmail(email: String): List<BetModelDatabase>
}