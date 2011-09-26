/* Generated By:JavaCC: Do not edit this line. ARQParserConstants.java */
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
package com.hp.hpl.jena.sparql.lang.arq ;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ARQParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 6;
  /** RegularExpression Id. */
  int WS = 7;
  /** RegularExpression Id. */
  int WSC = 8;
  /** RegularExpression Id. */
  int IRIref = 9;
  /** RegularExpression Id. */
  int PNAME_NS = 10;
  /** RegularExpression Id. */
  int PNAME_LN = 11;
  /** RegularExpression Id. */
  int BLANK_NODE_LABEL = 12;
  /** RegularExpression Id. */
  int VAR1 = 13;
  /** RegularExpression Id. */
  int VAR2 = 14;
  /** RegularExpression Id. */
  int LANGTAG = 15;
  /** RegularExpression Id. */
  int A2Z = 16;
  /** RegularExpression Id. */
  int A2ZN = 17;
  /** RegularExpression Id. */
  int KW_A = 18;
  /** RegularExpression Id. */
  int BASE = 19;
  /** RegularExpression Id. */
  int PREFIX = 20;
  /** RegularExpression Id. */
  int SELECT = 21;
  /** RegularExpression Id. */
  int DISTINCT = 22;
  /** RegularExpression Id. */
  int REDUCED = 23;
  /** RegularExpression Id. */
  int DESCRIBE = 24;
  /** RegularExpression Id. */
  int CONSTRUCT = 25;
  /** RegularExpression Id. */
  int ASK = 26;
  /** RegularExpression Id. */
  int LIMIT = 27;
  /** RegularExpression Id. */
  int OFFSET = 28;
  /** RegularExpression Id. */
  int ORDER = 29;
  /** RegularExpression Id. */
  int BY = 30;
  /** RegularExpression Id. */
  int BINDINGS = 31;
  /** RegularExpression Id. */
  int UNDEF = 32;
  /** RegularExpression Id. */
  int ASC = 33;
  /** RegularExpression Id. */
  int DESC = 34;
  /** RegularExpression Id. */
  int NAMED = 35;
  /** RegularExpression Id. */
  int FROM = 36;
  /** RegularExpression Id. */
  int WHERE = 37;
  /** RegularExpression Id. */
  int AND = 38;
  /** RegularExpression Id. */
  int GRAPH = 39;
  /** RegularExpression Id. */
  int OPTIONAL = 40;
  /** RegularExpression Id. */
  int UNION = 41;
  /** RegularExpression Id. */
  int MINUS_P = 42;
  /** RegularExpression Id. */
  int BIND = 43;
  /** RegularExpression Id. */
  int SERVICE = 44;
  /** RegularExpression Id. */
  int LET = 45;
  /** RegularExpression Id. */
  int FETCH = 46;
  /** RegularExpression Id. */
  int EXISTS = 47;
  /** RegularExpression Id. */
  int NOT = 48;
  /** RegularExpression Id. */
  int AS = 49;
  /** RegularExpression Id. */
  int GROUP = 50;
  /** RegularExpression Id. */
  int HAVING = 51;
  /** RegularExpression Id. */
  int SEPARATOR = 52;
  /** RegularExpression Id. */
  int AGG = 53;
  /** RegularExpression Id. */
  int COUNT = 54;
  /** RegularExpression Id. */
  int MIN = 55;
  /** RegularExpression Id. */
  int MAX = 56;
  /** RegularExpression Id. */
  int SUM = 57;
  /** RegularExpression Id. */
  int AVG = 58;
  /** RegularExpression Id. */
  int STDDEV = 59;
  /** RegularExpression Id. */
  int SAMPLE = 60;
  /** RegularExpression Id. */
  int GROUP_CONCAT = 61;
  /** RegularExpression Id. */
  int FILTER = 62;
  /** RegularExpression Id. */
  int BOUND = 63;
  /** RegularExpression Id. */
  int COALESCE = 64;
  /** RegularExpression Id. */
  int IN = 65;
  /** RegularExpression Id. */
  int IF = 66;
  /** RegularExpression Id. */
  int BNODE = 67;
  /** RegularExpression Id. */
  int IRI = 68;
  /** RegularExpression Id. */
  int URI = 69;
  /** RegularExpression Id. */
  int CAST = 70;
  /** RegularExpression Id. */
  int CALL = 71;
  /** RegularExpression Id. */
  int STR = 72;
  /** RegularExpression Id. */
  int STRLANG = 73;
  /** RegularExpression Id. */
  int STRDT = 74;
  /** RegularExpression Id. */
  int DTYPE = 75;
  /** RegularExpression Id. */
  int LANG = 76;
  /** RegularExpression Id. */
  int LANGMATCHES = 77;
  /** RegularExpression Id. */
  int IS_URI = 78;
  /** RegularExpression Id. */
  int IS_IRI = 79;
  /** RegularExpression Id. */
  int IS_BLANK = 80;
  /** RegularExpression Id. */
  int IS_LITERAL = 81;
  /** RegularExpression Id. */
  int IS_NUMERIC = 82;
  /** RegularExpression Id. */
  int REGEX = 83;
  /** RegularExpression Id. */
  int SAME_TERM = 84;
  /** RegularExpression Id. */
  int RAND = 85;
  /** RegularExpression Id. */
  int ABS = 86;
  /** RegularExpression Id. */
  int CEIL = 87;
  /** RegularExpression Id. */
  int FLOOR = 88;
  /** RegularExpression Id. */
  int ROUND = 89;
  /** RegularExpression Id. */
  int CONCAT = 90;
  /** RegularExpression Id. */
  int SUBSTR = 91;
  /** RegularExpression Id. */
  int STRLEN = 92;
  /** RegularExpression Id. */
  int UCASE = 93;
  /** RegularExpression Id. */
  int LCASE = 94;
  /** RegularExpression Id. */
  int ENCODE_FOR_URI = 95;
  /** RegularExpression Id. */
  int CONTAINS = 96;
  /** RegularExpression Id. */
  int STRSTARTS = 97;
  /** RegularExpression Id. */
  int STRENDS = 98;
  /** RegularExpression Id. */
  int YEAR = 99;
  /** RegularExpression Id. */
  int MONTH = 100;
  /** RegularExpression Id. */
  int DAY = 101;
  /** RegularExpression Id. */
  int HOURS = 102;
  /** RegularExpression Id. */
  int MINUTES = 103;
  /** RegularExpression Id. */
  int SECONDS = 104;
  /** RegularExpression Id. */
  int TIMEZONE = 105;
  /** RegularExpression Id. */
  int TZ = 106;
  /** RegularExpression Id. */
  int NOW = 107;
  /** RegularExpression Id. */
  int VERSION = 108;
  /** RegularExpression Id. */
  int MD5 = 109;
  /** RegularExpression Id. */
  int SHA1 = 110;
  /** RegularExpression Id. */
  int SHA224 = 111;
  /** RegularExpression Id. */
  int SHA256 = 112;
  /** RegularExpression Id. */
  int SHA384 = 113;
  /** RegularExpression Id. */
  int SHA512 = 114;
  /** RegularExpression Id. */
  int TRUE = 115;
  /** RegularExpression Id. */
  int FALSE = 116;
  /** RegularExpression Id. */
  int DATA = 117;
  /** RegularExpression Id. */
  int INSERT = 118;
  /** RegularExpression Id. */
  int DELETE = 119;
  /** RegularExpression Id. */
  int INSERT_DATA = 120;
  /** RegularExpression Id. */
  int DELETE_DATA = 121;
  /** RegularExpression Id. */
  int DELETE_WHERE = 122;
  /** RegularExpression Id. */
  int MODIFY = 123;
  /** RegularExpression Id. */
  int LOAD = 124;
  /** RegularExpression Id. */
  int CLEAR = 125;
  /** RegularExpression Id. */
  int CREATE = 126;
  /** RegularExpression Id. */
  int ADD = 127;
  /** RegularExpression Id. */
  int MOVE = 128;
  /** RegularExpression Id. */
  int COPY = 129;
  /** RegularExpression Id. */
  int META = 130;
  /** RegularExpression Id. */
  int SILENT = 131;
  /** RegularExpression Id. */
  int DROP = 132;
  /** RegularExpression Id. */
  int INTO = 133;
  /** RegularExpression Id. */
  int TO = 134;
  /** RegularExpression Id. */
  int DFT = 135;
  /** RegularExpression Id. */
  int ALL = 136;
  /** RegularExpression Id. */
  int WITH = 137;
  /** RegularExpression Id. */
  int USING = 138;
  /** RegularExpression Id. */
  int DIGITS = 139;
  /** RegularExpression Id. */
  int INTEGER = 140;
  /** RegularExpression Id. */
  int DECIMAL = 141;
  /** RegularExpression Id. */
  int DOUBLE = 142;
  /** RegularExpression Id. */
  int INTEGER_POSITIVE = 143;
  /** RegularExpression Id. */
  int DECIMAL_POSITIVE = 144;
  /** RegularExpression Id. */
  int DOUBLE_POSITIVE = 145;
  /** RegularExpression Id. */
  int INTEGER_NEGATIVE = 146;
  /** RegularExpression Id. */
  int DECIMAL_NEGATIVE = 147;
  /** RegularExpression Id. */
  int DOUBLE_NEGATIVE = 148;
  /** RegularExpression Id. */
  int EXPONENT = 149;
  /** RegularExpression Id. */
  int QUOTE_3D = 150;
  /** RegularExpression Id. */
  int QUOTE_3S = 151;
  /** RegularExpression Id. */
  int ECHAR = 152;
  /** RegularExpression Id. */
  int STRING_LITERAL1 = 153;
  /** RegularExpression Id. */
  int STRING_LITERAL2 = 154;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG1 = 155;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG2 = 156;
  /** RegularExpression Id. */
  int LPAREN = 157;
  /** RegularExpression Id. */
  int RPAREN = 158;
  /** RegularExpression Id. */
  int NIL = 159;
  /** RegularExpression Id. */
  int LBRACE = 160;
  /** RegularExpression Id. */
  int RBRACE = 161;
  /** RegularExpression Id. */
  int LBRACKET = 162;
  /** RegularExpression Id. */
  int RBRACKET = 163;
  /** RegularExpression Id. */
  int ANON = 164;
  /** RegularExpression Id. */
  int SEMICOLON = 165;
  /** RegularExpression Id. */
  int COMMA = 166;
  /** RegularExpression Id. */
  int DOT = 167;
  /** RegularExpression Id. */
  int EQ = 168;
  /** RegularExpression Id. */
  int NE = 169;
  /** RegularExpression Id. */
  int GT = 170;
  /** RegularExpression Id. */
  int LT = 171;
  /** RegularExpression Id. */
  int LE = 172;
  /** RegularExpression Id. */
  int GE = 173;
  /** RegularExpression Id. */
  int BANG = 174;
  /** RegularExpression Id. */
  int TILDE = 175;
  /** RegularExpression Id. */
  int COLON = 176;
  /** RegularExpression Id. */
  int SC_OR = 177;
  /** RegularExpression Id. */
  int SC_AND = 178;
  /** RegularExpression Id. */
  int PLUS = 179;
  /** RegularExpression Id. */
  int MINUS = 180;
  /** RegularExpression Id. */
  int STAR = 181;
  /** RegularExpression Id. */
  int SLASH = 182;
  /** RegularExpression Id. */
  int DATATYPE = 183;
  /** RegularExpression Id. */
  int AT = 184;
  /** RegularExpression Id. */
  int ASSIGN = 185;
  /** RegularExpression Id. */
  int VBAR = 186;
  /** RegularExpression Id. */
  int CARAT = 187;
  /** RegularExpression Id. */
  int FPATH = 188;
  /** RegularExpression Id. */
  int RPATH = 189;
  /** RegularExpression Id. */
  int QMARK = 190;
  /** RegularExpression Id. */
  int PN_CHARS_BASE = 191;
  /** RegularExpression Id. */
  int PN_CHARS_U = 192;
  /** RegularExpression Id. */
  int PN_CHARS = 193;
  /** RegularExpression Id. */
  int PN_PREFIX = 194;
  /** RegularExpression Id. */
  int PN_LOCAL = 195;
  /** RegularExpression Id. */
  int VARNAME = 196;
  /** RegularExpression Id. */
  int UNKNOWN = 197;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<SINGLE_LINE_COMMENT>",
    "<WS>",
    "<WSC>",
    "<IRIref>",
    "<PNAME_NS>",
    "<PNAME_LN>",
    "<BLANK_NODE_LABEL>",
    "<VAR1>",
    "<VAR2>",
    "<LANGTAG>",
    "<A2Z>",
    "<A2ZN>",
    "\"a\"",
    "\"base\"",
    "\"prefix\"",
    "\"select\"",
    "\"distinct\"",
    "\"reduced\"",
    "\"describe\"",
    "\"construct\"",
    "\"ask\"",
    "\"limit\"",
    "\"offset\"",
    "\"order\"",
    "\"by\"",
    "\"bindings\"",
    "\"undef\"",
    "\"asc\"",
    "\"desc\"",
    "\"named\"",
    "\"from\"",
    "\"where\"",
    "\"and\"",
    "\"graph\"",
    "\"optional\"",
    "\"union\"",
    "\"minus\"",
    "\"bind\"",
    "\"service\"",
    "\"let\"",
    "\"fetch\"",
    "\"exists\"",
    "\"not\"",
    "\"as\"",
    "\"group\"",
    "\"having\"",
    "\"separator\"",
    "\"agg\"",
    "\"count\"",
    "\"min\"",
    "\"max\"",
    "\"sum\"",
    "\"avg\"",
    "\"stdev\"",
    "\"sample\"",
    "\"group_concat\"",
    "\"filter\"",
    "\"bound\"",
    "\"coalesce\"",
    "\"in\"",
    "\"if\"",
    "\"bnode\"",
    "\"iri\"",
    "\"uri\"",
    "\"cast\"",
    "\"call\"",
    "\"str\"",
    "\"strlang\"",
    "\"strdt\"",
    "\"datatype\"",
    "\"lang\"",
    "\"langmatches\"",
    "\"isURI\"",
    "\"isIRI\"",
    "\"isBlank\"",
    "\"isLiteral\"",
    "\"isNumeric\"",
    "\"regex\"",
    "\"sameTerm\"",
    "\"RAND\"",
    "\"ABS\"",
    "\"CEIL\"",
    "\"FLOOR\"",
    "\"ROUND\"",
    "\"CONCAT\"",
    "\"SUBSTR\"",
    "\"STRLEN\"",
    "\"UCASE\"",
    "\"LCASE\"",
    "\"ENCODE_FOR_URI\"",
    "\"CONTAINS\"",
    "\"strSTARTS\"",
    "\"strENDS\"",
    "\"YEAR\"",
    "\"MONTH\"",
    "\"DAY\"",
    "\"HOURS\"",
    "\"MINUTES\"",
    "\"SECONDS\"",
    "\"TIMEZONE\"",
    "\"TZ\"",
    "\"NOW\"",
    "\"VERSION\"",
    "\"MD5\"",
    "\"SHA1\"",
    "\"SHA224\"",
    "\"SHA256\"",
    "\"SHA384\"",
    "\"SHA512\"",
    "\"true\"",
    "\"false\"",
    "\"data\"",
    "\"insert\"",
    "\"delete\"",
    "<INSERT_DATA>",
    "<DELETE_DATA>",
    "<DELETE_WHERE>",
    "\"modify\"",
    "\"load\"",
    "\"clear\"",
    "\"create\"",
    "\"add\"",
    "\"move\"",
    "\"copy\"",
    "\"meta\"",
    "\"silent\"",
    "\"drop\"",
    "\"into\"",
    "\"to\"",
    "\"default\"",
    "\"all\"",
    "\"with\"",
    "\"using\"",
    "<DIGITS>",
    "<INTEGER>",
    "<DECIMAL>",
    "<DOUBLE>",
    "<INTEGER_POSITIVE>",
    "<DECIMAL_POSITIVE>",
    "<DOUBLE_POSITIVE>",
    "<INTEGER_NEGATIVE>",
    "<DECIMAL_NEGATIVE>",
    "<DOUBLE_NEGATIVE>",
    "<EXPONENT>",
    "\"\\\"\\\"\\\"\"",
    "\"\\\'\\\'\\\'\"",
    "<ECHAR>",
    "<STRING_LITERAL1>",
    "<STRING_LITERAL2>",
    "<STRING_LITERAL_LONG1>",
    "<STRING_LITERAL_LONG2>",
    "\"(\"",
    "\")\"",
    "<NIL>",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "<ANON>",
    "\";\"",
    "\",\"",
    "\".\"",
    "\"=\"",
    "\"!=\"",
    "\">\"",
    "\"<\"",
    "\"<=\"",
    "\">=\"",
    "\"!\"",
    "\"~\"",
    "\":\"",
    "\"||\"",
    "\"&&\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"^^\"",
    "\"@\"",
    "\":=\"",
    "\"|\"",
    "\"^\"",
    "\"->\"",
    "\"<-\"",
    "\"?\"",
    "<PN_CHARS_BASE>",
    "<PN_CHARS_U>",
    "<PN_CHARS>",
    "<PN_PREFIX>",
    "<PN_LOCAL>",
    "<VARNAME>",
    "<UNKNOWN>",
  };

}
