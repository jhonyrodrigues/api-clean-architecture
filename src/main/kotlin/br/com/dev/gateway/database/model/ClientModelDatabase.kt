package br.com.dev.gateway.database.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class ClientModelDatabase(
        @Id
        val email: String?,
)