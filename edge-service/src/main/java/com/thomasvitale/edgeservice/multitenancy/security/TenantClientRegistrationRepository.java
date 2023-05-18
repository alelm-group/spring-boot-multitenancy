package com.thomasvitale.edgeservice.multitenancy.security;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.thomasvitale.edgeservice.multitenancy.TenantSecurityProperties;
import reactor.core.publisher.Mono;

import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrations;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
import org.springframework.stereotype.Component;

@Component
public class TenantClientRegistrationRepository implements ReactiveClientRegistrationRepository {

	private static final Map<String,Mono<ClientRegistration>> clientRegistrations = new ConcurrentHashMap<>();

	@Override
	public Mono<ClientRegistration> findByRegistrationId(String registrationId) {
		return null;
	}

}
