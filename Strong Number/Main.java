#include <stdio.h>
int main() {
  int number=0,original,sum=0,remainder=0;
  scanf("%d",&original);
  number=original;
  while(number!=0)
  { remainder=number%10;
    int fact=1;
    for(int i=1;i<=remainder;i++)
    { fact=fact*i;
    }
    sum+=fact;
    number=number/10;
  }
  if(original==sum)
    printf("Yes");
  else
    printf("No");
	//Type your code
	return 0;
}