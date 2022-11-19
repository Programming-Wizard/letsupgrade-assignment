#include <stdio.h>

    using namespace std;

    int main() 
    {
    
    int num1, num2 = 0;
        
    for (int i = 2; i < 12; i++) 
    {
      num1 = 1;
    
      for (int j = 2; j <= i / 2 && num1 == 1; j++) 
      {
        if (i % j == 0) 
        {
          num1 = 0;
        }
      }
      
      if (num1 == 1) 
      {
        printf("%5d ", i);
        num2++;
      
        if (num2 % 10 == 0) 
        {
          printf("\n");
        }
      }
    }
    printf("\n");
    return 0;
  }
