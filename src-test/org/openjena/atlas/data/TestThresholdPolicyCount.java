/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openjena.atlas.data;

import org.junit.Test ;
import org.openjena.atlas.data.ThresholdPolicyCount;
import org.openjena.atlas.junit.BaseTest ;


public class TestThresholdPolicyCount extends BaseTest
{
    
    @Test
    public void count_01()
    {
        ThresholdPolicyCount<String> policy = new ThresholdPolicyCount<String>(0);
        assertTrue(policy.isThresholdExceeded());
    }
    
    @Test
    public void count_02()
    {
        ThresholdPolicyCount<String> policy = new ThresholdPolicyCount<String>(1);
        assertFalse(policy.isThresholdExceeded());
    }
    
    @Test
    public void count_03()
    {
        ThresholdPolicyCount<String> policy = new ThresholdPolicyCount<String>(1);
        assertFalse(policy.isThresholdExceeded());
        policy.increment("a");
        assertTrue(policy.isThresholdExceeded());
    }
}
