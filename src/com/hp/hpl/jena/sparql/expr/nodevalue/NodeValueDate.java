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

package com.hp.hpl.jena.sparql.expr.nodevalue;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype ;
import com.hp.hpl.jena.datatypes.xsd.XSDDateTime ;
import com.hp.hpl.jena.graph.Node ;
import com.hp.hpl.jena.sparql.expr.ExprException ;
import com.hp.hpl.jena.sparql.expr.NodeValue ;

/** XSD Date (which is unrelated to XSD dateTime in the datatype hierarchy) */ 

public class NodeValueDate extends NodeValue
{
    XSDDateTime date ;      // The initial point of the XSD:date, ie. at 00:00:00 
    
    public NodeValueDate(XSDDateTime dt)
    { 
        date = dt ;
//        dt.getHours() ;
//        dt.getMinutes() ;
//        dt.getSeconds() ;
//        dt.getFullSeconds() ;
        if ( dt.getTimePart() != 0 ) 
            throw new ExprException("Illegal date: "+dt) ;
    }
    
    public NodeValueDate(XSDDateTime dt, Node n) { super(n) ; date = dt ; }
    
    @Override
    public boolean isDate() { return true ; }
    @Override
    public XSDDateTime getDateTime()     { return date ; }
    
    @Override
    protected Node makeNode()
    {
        String lex = date.toString() ;
        return Node.createLiteral(lex, null, XSDDatatype.XSDdate) ;
    }
    
    @Override
    public void visit(NodeValueVisitor visitor) { visitor.visit(this) ; }

}
