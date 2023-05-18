package com.thomasvitale.edgeservice.multitenancy.security;

import java.net.URI;

import reactor.core.publisher.Mono;

import org.springframework.security.web.server.DefaultServerRedirectStrategy;
import org.springframework.security.web.server.ServerRedirectStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;

@RestController
public class LoginController {

	private final ServerRedirectStrategy redirectStrategy = new DefaultServerRedirectStrategy();

	@GetMapping("tenant-login")
	Mono<Void> login(ServerWebExchange exchange) {
		return Mono.defer(() -> {
			return null;
		});
	}

}
