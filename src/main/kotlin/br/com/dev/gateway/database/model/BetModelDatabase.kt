package br.com.dev.gateway.database.model

import java.util.*
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class BetModelDatabase(
        @field:ManyToOne(cascade = [CascadeType.PERSIST]) val client: ClientModelDatabase,
        val bet: String? = null,
) {
    @Id
    var betId: String = UUID.randomUUID().toString()
}