package br.com.dev.gateway.database.repository

import br.com.dev.gateway.database.model.ClientModelDatabase
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ClientRepository : CrudRepository<ClientModelDatabase, String> {
    fun findByEmail(email: String): Optional<ClientModelDatabase>
}