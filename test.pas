program test;
var
  a, sum : integer;
  b : array[1..5] of integer;

BEGIN
  sum := 0;
  for a := 1 to 5 do
    begin
      b[a] := a;

    end;
END.