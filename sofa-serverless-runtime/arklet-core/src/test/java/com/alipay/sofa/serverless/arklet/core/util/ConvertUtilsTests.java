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
package com.alipay.sofa.serverless.arklet.core.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class ConvertUtilsTests {

    @Test
    public void testBytes2Megabyte() {
        final long bytes = 1024 * 1024;
        final double delta = 1e-5;
        Assert.assertEquals(1., ConvertUtils.bytes2Megabyte(bytes), delta);
    }

    @Test
    public void testGetDurationSecond() {
        try {
            final Date date = new Date(System.currentTimeMillis());
            final long millis = 1000;
            final double delta = 1e-2;
            Thread.sleep(millis);
            Assert.assertEquals(millis / 1000., ConvertUtils.getDurationSecond(date), delta);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}