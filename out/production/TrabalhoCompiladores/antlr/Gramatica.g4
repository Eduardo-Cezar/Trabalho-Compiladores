grammar Gramatica;

@header{
    package antlr;
}

inicio: (declaracao_func)? declaracao_main EOF #NInicio;
declaracao_main: FUN TIPO MAIN AP FP AC declaracao_vars algoritmo FC #BlocoDeclaracaoMain;
declaracao_func: FUN TIPO ID AP(TIPO ID)*FP AC declaracao_vars algoritmo FC #BlocoDeclaracaoFunc;
declaracao_vars: (VAR AC (TIPO ID DEL)* FC)? #BlocoDeclaracaoVars;
chamada_func: CALL FUN ID AP (ID | operacao_aritmetica | operacao_relacional | operacao_logica)* FP DEL #ChamadaFunc;
chamada_funcSemPV: CALL FUN ID AP (ID | operacao_aritmetica | operacao_relacional | operacao_logica)* FP #ChamadaFuncSemPV;
acao: (entrada_dados | saida_dados | operacao_logica | chamada_func | retorno_de_funcao) #NAcao;
estruturas: (repeticao | condicional | atribuicao) #NEstruturas;
operacao_relacional: (operando) OPREL (operando | operacao_relacional | AP operacao_relacional FP | chamada_funcSemPV) #OperacaoRelacional;
operacao_logica: (operando) OPLOGI (operando | operacao_logica | AP operacao_logica FP | chamada_funcSemPV) #OperacaoLogica;
operacao_aritmetica: (operando) OPARIT (operando | AP operacao_aritmetica FP | operacao_aritmetica | chamada_funcSemPV) #OperacaoAritmetica;
condicional_senao: ELSE AC algoritmo FC #CondicionalSeNao;
condicional: IF AP (operacao_relacional | operacao_logica)+ FP THEN AC algoritmo FC (condicional_senao)? #CondicionalIf;
operando: ID | NUM #Operando;
repeticao: WHI AP (operacao_relacional)+ FP AC algoritmo FC #NRepeticao;
atribuicao: ID ATR (operacao_aritmetica | ID | CSTR) DEL #NAtribuicao;
entrada_dados: IN AP (ID) FP DEL #EntradaDados;
saida_dados: OUT AP (ID | (operacao_aritmetica)* | chamada_funcSemPV | CSTR) FP DEL #Saida;
algoritmo: (acao | estruturas)* #NAlgoritmo;
retorno_de_funcao: RET (NUM | ID |  CSTR | operacao_aritmetica | operacao_relacional | operacao_logica | chamada_funcSemPV) DEL #RetornoDeFuncao;

AP: '(';
FP: ')';
AC: '{';
FC: '}';
ASP: '"';
DEL: ';';
VAR: 'vars';
ATR: '=';
IN: 'in';
OUT: 'out';
CSTR: ASP(LETRA | DIGITO | ' ')*ASP;
TIPO: 'integer' | 'float' | 'boolean' | 'str';
FUN: 'func';
CALL: 'call';
MAIN: 'main';
RET: 'return';
OPLOGI: '&&' | '||';
OPARIT: '+' | '-' | '*' | '/';
OPREL: '>' | '<' | '>=' | '<=' | '!=' | '==';
WHI: 'while';
IF: 'if';
THEN: 'then';
ELSE: 'else';
ID: LETRA(DIGITO | LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
WS: [ \r\t\n]+->skip;
COM: '//' (LETRA | DIGITO | ACENTO | ASP)+->skip;
fragment ACENTO: [A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ,'"“ ];
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
