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

package com.hp.hpl.jena.sparql.lang;

import java.io.FileReader ;
import java.io.InputStream ;
import java.io.Reader ;
import java.io.StringReader ;

import org.openjena.atlas.io.PeekReader ;
import org.openjena.atlas.logging.Log ;
import org.slf4j.LoggerFactory ;

import com.hp.hpl.jena.query.QueryException ;
import com.hp.hpl.jena.query.QueryParseException ;
import com.hp.hpl.jena.shared.JenaException ;
import com.hp.hpl.jena.sparql.lang.sparql_11.SPARQLParser11 ;
import com.hp.hpl.jena.update.UpdateException ;
import com.hp.hpl.jena.update.UpdateRequest ;
import com.hp.hpl.jena.util.FileUtils ;


public class ParserSPARQL11Update extends UpdateParser
{
    @Override
    protected UpdateRequest parse$(UpdateRequest update, String updateString)
    {
        Reader r = new StringReader(updateString) ;
        return _parse(update, r) ;
    }
    
    @Override
    protected UpdateRequest parse$(UpdateRequest update, PeekReader pr)
    {
        return _parse(update, pr) ;
    }
    
    @Override
    public UpdateRequest parse(UpdateRequest update, InputStream in)
    {
        Reader r = FileUtils.asBufferedUTF8(in) ;
        return _parse(update, r) ;
    }

    public UpdateRequest parse(UpdateRequest update, Reader r)
    {
        if ( r instanceof FileReader )
            LoggerFactory.getLogger(this.getClass()).warn("FileReader passed to ParserSPARQL11Update.parse - use a FileInputStream") ;
        return _parse(update, r) ;
    }
    
    private UpdateRequest _parse(UpdateRequest update, Reader r)
    {
        SPARQLParser11 parser = null ;
        try {
            parser = new SPARQLParser11(r) ;
            parser.setUpdateRequest(update) ;
            parser.UpdateUnit() ;
            validateParsedUpdate(update) ;
            return update ;
        }
        catch (com.hp.hpl.jena.sparql.lang.sparql_11.ParseException ex)
        { 
            throw new QueryParseException(ex.getMessage(),
                                          ex.currentToken.beginLine,
                                          ex.currentToken.beginColumn
            ) ; }
        catch (com.hp.hpl.jena.sparql.lang.sparql_11.TokenMgrError tErr)
        {
            // Last valid token : not the same as token error message - but this should not happen
            int col = parser.token.endColumn ;
            int line = parser.token.endLine ;
            throw new QueryParseException(tErr.getMessage(), line, col) ; }

        catch (UpdateException ex) { throw ex ; }
        catch (JenaException ex)  { throw new QueryException(ex.getMessage(), ex) ; }
        catch (Error err)
        {
            // The token stream can throw errors.
            throw new QueryParseException(err.getMessage(), err, -1, -1) ;
        }
        catch (Throwable th)
        {
            Log.fatal(this, "Unexpected throwable: ",th) ;
            throw new QueryException(th.getMessage(), th) ;
        }
    }


}
