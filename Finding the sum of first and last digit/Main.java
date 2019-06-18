#include <stdio.h>
int main() {
  int number;
  scanf("%d",&number);
  int last_digit = number %10;
  while(number>10)
  { number=number/10;
  }
  int sum = number + last_digit;
  printf("%d",sum);
	//Type your code
	return 0;
}