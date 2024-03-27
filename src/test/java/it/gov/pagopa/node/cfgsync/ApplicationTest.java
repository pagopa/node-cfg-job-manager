package it.gov.pagopa.node.cfgsync;

import it.gov.pagopa.node.cfgsync.util.Constants;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class ApplicationTest {

  @Test
  void contextLoads() {
    // check only if the context is loaded
    assertTrue(true);
  }

  @Test
  void constantsTest() {
    assertEquals("X-Request-Id", Constants.HEADER_REQUEST_ID);
    assertEquals("X-CACHE-ID", Constants.HEADER_CACHE_ID);
    assertEquals("X-CACHE-TIMESTAMP", Constants.HEADER_CACHE_TIMESTAMP);
    assertEquals("X-CACHE-VERSION", Constants.HEADER_CACHE_VERSION);
  }

  @Test
  void constantsHelperTest() {
    assertEquals("NEXIORACLE", ConstantsHelper.NEXIORACLE_SI);
    assertEquals("NEXIPOSTGRES", ConstantsHelper.NEXIPOSTGRES_SI);
    assertEquals("PAGOPAPOSTGRES", ConstantsHelper.PAGOPAPOSTGRES_SI);
  }

}
