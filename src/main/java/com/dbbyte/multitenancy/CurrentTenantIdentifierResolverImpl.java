package com.dbbyte.multitenancy;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

import com.dbbyte.multitenancy.util.RequestContextHolderUtils;

/**
 * step_2 - is to provide a mechanism to determine, at runtime, which tenant is
 * accessing to the application instance. To do that, Spring provides an
 * interface to implement it.
 *
 */
@Component
public class CurrentTenantIdentifierResolverImpl implements CurrentTenantIdentifierResolver {

	@Override
	public String resolveCurrentTenantIdentifier() {
		return RequestContextHolderUtils.getCurrentTenantIdentifier();
	}

	@Override
	public boolean validateExistingCurrentSessions() {
		return true;
	}
}