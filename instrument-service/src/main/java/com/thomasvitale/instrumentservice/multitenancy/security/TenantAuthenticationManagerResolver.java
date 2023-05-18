package com.thomasvitale.instrumentservice.multitenancy.security;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.thomasvitale.instrumentservice.multitenancy.TenantSecurityProperties;
import com.thomasvitale.instrumentservice.multitenancy.context.TenantContext;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationManagerResolver;
import org.springframework.security.oauth2.jwt.JwtDecoders;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationProvider;
import org.springframework.stereotype.Component;

@Component
public class TenantAuthenticationManagerResolver implements AuthenticationManagerResolver<HttpServletRequest> {

	private static final Map<String,AuthenticationManager> authenticationManagers = new ConcurrentHashMap<>();

	@Override
	public AuthenticationManager resolve(HttpServletRequest request) {
		return null;
	}

}
