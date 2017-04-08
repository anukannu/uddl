grammar SimpleUql ;

start_rule :
  select_statement
  ;

select_statement :
  R_Select o_all R_From table_name EOS
  ;

o_all :
  O_ALL
  ;
  
table_name :
 ID
 ;
 
R_Select :
  [Ss][Ee][Ll][Ee][Cc][Tt]
  ;

O_ALL :
  '*'
  ;

R_From :
  [Ff][Rr][Oo][Mm]
  ;



EOS :
  ';' | EOF
  ;

ID :
 [a-zA-Z0-9_]+ 
 ;


WS :
 (' ' | '\t' | '\r' | '\n')+  {skip();}
    ;
