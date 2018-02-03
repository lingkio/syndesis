/*
 * Copyright (C) 2016 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.syndesis.rest.metrics.collector;

import org.junit.Ignore;
import org.junit.Test;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;

/**
 * Unit Tests to check the podMetricsReader
 */
public class PodMetricsReaderTest {

    @Test @Ignore
    public void readTest() {
        String podName = "metrics-test-2-90qwf";
        String integration = "metrics-test";
        String integrationId = "id1";
        String version = "1";
        PodMetricsReader reader = new PodMetricsReader(
                new DefaultKubernetesClient(), 
                podName, 
                integration,
                integrationId,
                version,
                new LogRawMetrics());
        reader.run();
       
    }
}
