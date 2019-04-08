program test;
const
  limit = 5;

var
  nums : array[1..limit] of integer;
  i, sum : integer;

function factorial (nums : integer) : integer;
begin
  if (nums <= 1) then
    factorial := 1
  else
    factorial := factorial(nums - 1) * nums;
end;

begin
  sum := 0;

  i := 1;
  while i <= limit do
    begin
      write(i + '#: ');
      readln(nums[i]);
      sum := sum + factorial(nums[i]);
      inc(i);
    end;

  WriteLn('Factorial Sum: ' + sum);
  if (sum > 100) then
    writeln('ooh it big!')
  else
    writeln('oh no! it smol');

end.