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

package org.apache.shardingsphere.data.pipeline.core.job;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.data.pipeline.common.context.PipelineContextKey;
import org.apache.shardingsphere.data.pipeline.common.job.PipelineJobId;
import org.apache.shardingsphere.data.pipeline.common.job.type.PipelineJobType;

/**
 * Abstract pipeline job id.
 */
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public abstract class AbstractPipelineJobId implements PipelineJobId {
    
    public static final String CURRENT_VERSION = "02";
    
    private final PipelineJobType jobType;
    
    private final PipelineContextKey contextKey;
    
    @Override
    public String getFormatVersion() {
        return CURRENT_VERSION;
    }
}
