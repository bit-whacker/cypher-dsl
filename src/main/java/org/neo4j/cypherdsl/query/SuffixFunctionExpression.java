/**
 * Licensed to Neo Technology under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Neo Technology licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.neo4j.cypherdsl.query;

import org.neo4j.cypherdsl.expression.Expression;

/**
 * Expresses all functions of the form "exp f", such as "exp is null"
 */
public class SuffixFunctionExpression
        extends AbstractExpression
{
    public final String name;
    public final Expression expression;

    public SuffixFunctionExpression( String name, Expression expression )
    {
        this.name = name;
        this.expression = expression;
    }

    @Override
    public void asString( StringBuilder builder )
    {
        expression.asString( builder );
        builder.append( name );
    }
}
