package io.harnesslab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoApplicationTests {

    @Test
    void indexReportsAppName() {
        assertEquals("harness-lab-java", new DemoApplication().index().get("app"));
    }

    @Test
    void healthzIsOk() {
        assertEquals("ok", new DemoApplication().healthz().get("status"));
    }
}
