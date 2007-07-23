/* Generated By:JavaCC: Do not edit this line. SSE_Parser.java */
/*
 * (c) Copyright 2007 Hewlett-Packard Development Company, LP
 * All rights reserved.
 */

package com.hp.hpl.jena.sparql.sse.parser ;

import com.hp.hpl.jena.sparql.sse.ParserSSEBase ;


public class SSE_Parser extends ParserSSEBase implements SSE_ParserConstants {

// Now has explicit WS control in the grammar.
// Policy - eat trailing WS

// ---- Entry points : check for EOF.
  final public void parse() throws ParseException {
      parseStart() ;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case WS:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      jj_consume_token(WS);
    }
    TermOrList();
    jj_consume_token(0);
      parseFinish() ;
  }

  final public void term() throws ParseException {
      parseStart() ;
    Term();
    jj_consume_token(0);
      parseFinish() ;
  }

// ----
  final public void TermOrList() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IRIref:
    case PNAME:
    case VAR1:
    case VAR2:
    case INTEGER:
    case DECIMAL:
    case DOUBLE:
    case STRING_LITERAL1:
    case STRING_LITERAL2:
    case STRING_LITERAL_LONG1:
    case STRING_LITERAL_LONG2:
    case HOOK:
    case WORD:
    case OP:
      Term();
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case WS:
          ;
          break;
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
        jj_consume_token(WS);
      }
      break;
    case LPAREN:
    case LBRACKET:
      List();
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void List() throws ParseException {
                Token t ;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LPAREN:
      t = jj_consume_token(LPAREN);
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case WS:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_3;
        }
        jj_consume_token(WS);
      }
      listStart(t.beginLine, t.beginColumn) ;
      BareList();
      t = jj_consume_token(RPAREN);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case WS:
          ;
          break;
        default:
          jj_la1[4] = jj_gen;
          break label_4;
        }
        jj_consume_token(WS);
      }
      listFinish(t.beginLine, t.beginColumn) ;
      break;
    case LBRACKET:
      t = jj_consume_token(LBRACKET);
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case WS:
          ;
          break;
        default:
          jj_la1[5] = jj_gen;
          break label_5;
        }
        jj_consume_token(WS);
      }
      listStart(t.beginLine, t.beginColumn) ;
      BareList();
      t = jj_consume_token(RBRACKET);
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case WS:
          ;
          break;
        default:
          jj_la1[6] = jj_gen;
          break label_6;
        }
        jj_consume_token(WS);
      }
      listFinish(t.beginLine, t.beginColumn) ;
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void BareList() throws ParseException {
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IRIref:
      case PNAME:
      case VAR1:
      case VAR2:
      case INTEGER:
      case DECIMAL:
      case DOUBLE:
      case STRING_LITERAL1:
      case STRING_LITERAL2:
      case STRING_LITERAL_LONG1:
      case STRING_LITERAL_LONG2:
      case LPAREN:
      case LBRACKET:
      case HOOK:
      case WORD:
      case OP:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_7;
      }
      TermOrList();
    }
  }

  final public void Term() throws ParseException {
                Token t ;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case WORD:
    case OP:
      Symbol();
      break;
    case IRIref:
      IRIref();
      break;
    case PNAME:
      PrefixedName();
      break;
    case VAR1:
    case VAR2:
    case HOOK:
      Var();
      break;
    case INTEGER:
    case DECIMAL:
    case DOUBLE:
    case STRING_LITERAL1:
    case STRING_LITERAL2:
    case STRING_LITERAL_LONG1:
    case STRING_LITERAL_LONG2:
      Literal();
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Symbol() throws ParseException {
                  Token t ;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case WORD:
      t = jj_consume_token(WORD);
      break;
    case OP:
      t = jj_consume_token(OP);
      break;
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
      emitSymbol(t.beginLine, t.beginColumn, t.image) ;
  }

  final public void IRIref() throws ParseException {
                  Token t ;
    t = jj_consume_token(IRIref);
      emitIRI(t.beginLine, t.beginColumn, stripQuotes(t.image)) ;
  }

  final public void PrefixedName() throws ParseException {
                        Token t ;
    t = jj_consume_token(PNAME);
      emitPName(t.beginLine, t.beginColumn, t.image) ;
  }

  final public void Var() throws ParseException {
               Token t ;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VAR1:
      t = jj_consume_token(VAR1);
      break;
    case VAR2:
      t = jj_consume_token(VAR2);
      break;
    case HOOK:
      t = jj_consume_token(HOOK);
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    emitVar(t.beginLine, t.beginColumn, stripChars(t.image, 1)) ;
  }

  final public void Literal() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRING_LITERAL1:
    case STRING_LITERAL2:
    case STRING_LITERAL_LONG1:
    case STRING_LITERAL_LONG2:
      RDFLiteral();
      break;
    case INTEGER:
    case DECIMAL:
    case DOUBLE:
      NumericLiteral();
      break;
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void BlankNode() throws ParseException {
                     Token t ;
    t = jj_consume_token(BLANK_NODE_LABEL);
      emitBNode(t.beginLine, t.beginColumn, t.image) ;
  }

  final public void RDFLiteral() throws ParseException {
                      Token t = null ; int currLine ; int currColumn ;
                      String lex ; String lang = null ;
                      String dt_iri = null ; String dt_pn = null ;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRING_LITERAL1:
      t = jj_consume_token(STRING_LITERAL1);
                            lex = stripQuotes(t.image) ;
      break;
    case STRING_LITERAL2:
      t = jj_consume_token(STRING_LITERAL2);
                            lex = stripQuotes(t.image) ;
      break;
    case STRING_LITERAL_LONG1:
      t = jj_consume_token(STRING_LITERAL_LONG1);
                                 lex = stripQuotes3(t.image) ;
      break;
    case STRING_LITERAL_LONG2:
      t = jj_consume_token(STRING_LITERAL_LONG2);
                                 lex = stripQuotes3(t.image) ;
      break;
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    currLine = t.beginLine ; currColumn = t.beginColumn ;
    token_source.SwitchTo(LITERAL) ;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case DATATYPE:
    case LANGTAG:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LANGTAG:
        t = jj_consume_token(LANGTAG);
                     lang = stripChars(t.image, 1) ;
        token_source.SwitchTo(DEFAULT) ;
        break;
      case DATATYPE:
        jj_consume_token(DATATYPE);
      token_source.SwitchTo(DEFAULT) ;
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IRIref:
          t = jj_consume_token(IRIref);
                     dt_iri = stripQuotes(t.image) ;
          break;
        case PNAME:
          t = jj_consume_token(PNAME);
                    dt_pn = t.image ;
          break;
        default:
          jj_la1[14] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      default:
        jj_la1[15] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[16] = jj_gen;
      ;
    }
    emitLiteral(currLine, currColumn, lex, lang, dt_iri, dt_pn) ;
  }

  final public void NumericLiteral() throws ParseException {
                          Token t ;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INTEGER:
      t = jj_consume_token(INTEGER);
     emitLiteralInteger(t.beginLine, t.beginColumn, t.image) ;
      break;
    case DECIMAL:
      t = jj_consume_token(DECIMAL);
     emitLiteralDecimal(t.beginLine, t.beginColumn, t.image) ;
      break;
    case DOUBLE:
      t = jj_consume_token(DOUBLE);
     emitLiteralDouble(t.beginLine, t.beginColumn, t.image) ;
      break;
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  public SSE_ParserTokenManager token_source;
  JavaCharStream jj_input_stream;
  public Token token, jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[18];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_0();
      jj_la1_1();
   }
   private static void jj_la1_0() {
      jj_la1_0 = new int[] {0x2,0x2,0xa3e1db0,0x2,0x2,0x2,0x2,0x2200000,0xa3e1db0,0x81e1db0,0x0,0x8000180,0x1e1c00,0x1e0000,0x30,0x30000000,0x30000000,0x1c00,};
   }
   private static void jj_la1_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x180,0x0,0x0,0x0,0x0,0x0,0x180,0x180,0x180,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }

  public SSE_Parser(java.io.InputStream stream) {
     this(stream, null);
  }
  public SSE_Parser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SSE_ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
  }

  public SSE_Parser(java.io.Reader stream) {
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new SSE_ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
  }

  public SSE_Parser(SSE_ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
  }

  public void ReInit(SSE_ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
  }

  final private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  final private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.Vector jj_expentries = new java.util.Vector();
  private int[] jj_expentry;
  private int jj_kind = -1;

  public ParseException generateParseException() {
    jj_expentries.removeAllElements();
    boolean[] la1tokens = new boolean[42];
    for (int i = 0; i < 42; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 18; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 42; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.addElement(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.elementAt(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  final public void enable_tracing() {
  }

  final public void disable_tracing() {
  }

}
