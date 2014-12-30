package org.bonitasoft.engine;

import static org.assertj.core.api.Assertions.assertThat;

import org.bonitasoft.engine.test.PlatformTestUtil;
import org.junit.Test;

public class ProcessCoverageIT {

    @Test
    public void generateCoverageForProcess() throws Exception {

        PlatformTestUtil platformTestUtil = new PlatformTestUtil();

        platformTestUtil.createInitializeAndStartPlatformWithDefaultTenant(false);

        //given
        ProcessCoverage processCoverage = new ProcessCoverage();

        //when
        CoverResult coverResult = processCoverage.computeCoverage(null);

        //then
        assertThat(coverResult).isNotNull();
    }

}
