package br.com.dev.controller.api

import br.com.dev.response.BetResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("registration")
interface GetBetApi {

    @GetMapping("/{email}")
    fun execute(@PathVariable email: String): ResponseEntity<List<BetResponse>>
}