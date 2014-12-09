package org.bonitasoft.engine;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ProcessCoverageTest {

    @Test
    public void generateCoverageForProcess(){
        //given
        ProcessCoverage processCoverage = new ProcessCoverage();

        //when
        CoverResult coverResult = processCoverage.computeCoverage(null);

        //then
        assertThat(coverResult).isNotNull();
    }

}
