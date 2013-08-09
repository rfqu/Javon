/*
 * Copyright 2013 by Alexei Kaigorodov
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.github.rfqu.javon.parser;

enum Token{
    LPAREN('('), RPAREN(')'), LBRACE('{'), RBRACE('}')
        , LBRACKET('['), RBRACKET(']'), COMMA(','), COLON(':')
        , SPACE(' '), TAB('\t'), NEWL('\n'), QUOTE('"'), QUOTE2('\''), COMMENT('#')
        , EOF(Character.MAX_VALUE)
        , NUMBER((char)(EOF.ch-1))
                , IDENT((char)(NUMBER.ch-1))
                , STRING((char)(IDENT.ch-1));
    
    public final char ch;
    
    Token(char ch) {
        this.ch=ch;
    }
}