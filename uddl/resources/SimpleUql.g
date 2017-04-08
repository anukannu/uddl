grammar SimpleUql ;

start_rule :
  select_statement
  ;

select_statement :
  R_Select O_all R_From Identifier EOS
  ;

R_Select :
  [Ss][Ee][Ll][Ee][Cc][Tt]
  ;

O_all :
  '*'
  ;

R_From :
  [Ff][Rr][Oo][Mm]
  ;



EOS :
  ';' | EOF
  ;

Identifier :
 ('a'..'z' | 'A'..'Z')+ 
 ;


WS :
 (' ' | '\t' | '\r' | '\n')+  {skip();}
    ;
