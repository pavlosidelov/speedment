/**
 *
 * Copyright (c) 2006-2015, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.orm.config.model.impl;

import com.speedment.orm.config.model.*;
import com.speedment.orm.config.model.aspects.Parent;
import java.util.Optional;

/**
 *
 * @author pemi
 */
public class PrimaryKeyColumnImpl extends AbstractOrdinalConfigEntity implements PrimaryKeyColumn {
    
    private Table parent;

    @Override
    protected void setDefaults() {
        setOrdinalPosition(UNSET);
    }

    @Override
    public void setParentTo(Parent<?> parent) {
        setParentHelper(parent, Table.class)
            .ifPresent(p -> this.parent = p);
    }

    @Override
    public Optional<Table> getParent() {
        return Optional.ofNullable(parent);
    }
}