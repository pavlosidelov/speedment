/**
 * 
 * Copyright (c) 2006-2016, Speedment, Inc. All Rights Reserved.
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
package com.speedment.runtime.field.internal.predicate.doubles;

import com.speedment.common.tuple.Tuple1;
import com.speedment.runtime.field.internal.predicate.AbstractFieldPredicate;
import com.speedment.runtime.field.predicate.PredicateType;
import com.speedment.runtime.field.trait.HasDoubleValue;

import javax.annotation.Generated;

/**
 * @param <ENTITY> entity type
 * @param <D>      database type
 * 
 * @author Emil Forslund
 * @since  3.0.0
 */
@Generated(value = "Speedment")
public final class DoubleGreaterThanPredicate<ENTITY, D> extends AbstractFieldPredicate<ENTITY, Double, HasDoubleValue<ENTITY, D>> implements Tuple1<Double> {
    
    private final double value;
    
    public DoubleGreaterThanPredicate(HasDoubleValue<ENTITY, D> field, double value) {
        super(PredicateType.GREATER_THAN, field, entity -> field.getAsDouble(entity) >= value);
        this.value = value;
    }
    
    @Override
    public Double get0() {
        return value;
    }
}