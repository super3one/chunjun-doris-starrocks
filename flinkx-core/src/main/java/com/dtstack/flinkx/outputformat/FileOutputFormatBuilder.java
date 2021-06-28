/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dtstack.flinkx.outputformat;

import com.dtstack.flinkx.conf.BaseFileConf;

/**
 * Date: 2021/06/21
 * Company: www.dtstack.com
 *
 * @author tudou
 */
public abstract class FileOutputFormatBuilder extends BaseRichOutputFormatBuilder{
    protected BaseFileOutputFormat format;

    public void setFormat(BaseFileOutputFormat format) {
        this.format = format;
        super.format = format;
    }

    public void setBaseFileConf(BaseFileConf baseFileConf) {
        super.setConfig(baseFileConf);
        format.baseFileConf = baseFileConf;
    }
}
