/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.serverless.arklet.core;

import com.alipay.sofa.ark.api.ArkClient;
import com.alipay.sofa.ark.api.ClientResponse;
import com.alipay.sofa.ark.api.ResponseCode;
import com.alipay.sofa.serverless.arklet.core.command.CommandService;
import com.alipay.sofa.serverless.arklet.core.health.HealthService;
import com.alipay.sofa.serverless.arklet.core.ops.UnifiedOperationService;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

/**
 * @author mingmen
 * @date 2023/9/5
 */
public class BaseTest {
    public static ArkletComponentRegistry componentRegistry;
    public static CommandService          commandService;
    public static UnifiedOperationService operationService;
    public static HealthService           healthService;

    @Before
    public void setup() throws Throwable {
        if (componentRegistry == null) {
            ArkletComponentRegistry registry = new ArkletComponentRegistry();
            registry.initComponents();
            componentRegistry = registry;
            commandService = ArkletComponentRegistry.getCommandServiceInstance();
            operationService = ArkletComponentRegistry.getOperationServiceInstance();
            healthService = ArkletComponentRegistry.getHealthServiceInstance();
        }
    }

}
