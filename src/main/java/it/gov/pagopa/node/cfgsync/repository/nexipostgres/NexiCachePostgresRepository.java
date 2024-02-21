package it.gov.pagopa.node.cfgsync.repository.nexipostgres;

import it.gov.pagopa.node.cfgsync.repository.model.ConfigCache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NexiCachePostgresRepository<T extends ConfigCache> extends JpaRepository<T, String> { }