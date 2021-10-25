package br.com.dev.controller.api

import br.com.dev.domain.BetDomain
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/registration")
interface GenerateBetApi {

    @PostMapping("/{email}")
    fun execute(@PathVariable email: String): ResponseEntity<BetDomain>
}