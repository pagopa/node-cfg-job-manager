package it.gov.pagopa.node.cfg_sync.repository.pagopa;

import it.gov.pagopa.node.cfg_sync.repository.model.pagopa.CachePagoPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CacheNodoPagoPAPRepository extends JpaRepository<CachePagoPA, String> { }
