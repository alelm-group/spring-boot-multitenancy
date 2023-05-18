package com.thomasvitale.instrumentservice.multitenancy.data.hibernate;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.hibernate.cfg.AvailableSettings;
import org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider;

import org.springframework.boot.autoconfigure.orm.jpa.HibernatePropertiesCustomizer;
import org.springframework.stereotype.Component;

@Component
public class ConnectionProvider implements MultiTenantConnectionProvider, HibernatePropertiesCustomizer {

	@Override
	public Connection getAnyConnection() throws SQLException {
		return null;
	}

	@Override
	public void releaseAnyConnection(Connection connection) throws SQLException {

	}

	@Override
	public Connection getConnection(String tenantIdentifier) throws SQLException {
		return null;
	}

	@Override
	public void releaseConnection(String tenantIdentifier, Connection connection) throws SQLException {

	}

	@Override
	public boolean supportsAggressiveRelease() {
		return false;
	}

	@Override
	public boolean isUnwrappableAs(Class<?> unwrapType) {
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> unwrapType) {
		return null;
	}

	@Override
	public void customize(Map<String, Object> hibernateProperties) {

	}

}
