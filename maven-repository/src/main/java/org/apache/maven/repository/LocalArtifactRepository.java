package org.apache.maven.repository;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.repository.DefaultArtifactRepository;

public abstract class LocalArtifactRepository
    extends DefaultArtifactRepository
{   
    public static final String IDE_WORKSPACE = "ide-workspace";

    public abstract Artifact find( Artifact artifact );
    
    /** 
     * If an artifact is found in this repository and this method returns true the search is over. This would
     * be the case if we look for artifacts in the reactor or a IDE workspace. We don't want to search any
     * further.
     * 
     * @return
     */
    // workspace or reactor
    public abstract boolean isAuthoritative();
    
    public abstract boolean hasLocalMetadata();    
}