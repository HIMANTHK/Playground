#include <stdio.h>
int main() {
  int number;
  scanf("%d",&number);
  while(number/10 > 10)
  { number = number /10;}
  printf("%d",number%10);
	//Type your code
	return 0;
}