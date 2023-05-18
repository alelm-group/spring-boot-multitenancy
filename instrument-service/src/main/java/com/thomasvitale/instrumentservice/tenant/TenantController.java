package com.thomasvitale.instrumentservice.tenant;

import com.thomasvitale.instrumentservice.multitenancy.context.TenantContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tenant")
public class TenantController {

	@GetMapping
	String getTenant() {
		return TenantContext.getTenantId();
	}

}
