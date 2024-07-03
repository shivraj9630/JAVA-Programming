#include<iostream>
using namespace std;

// Application for specific programming
int AddI(int i, int j)
{
   int result = 0;
   result = i + j;
   return result;
}

float AddF(float i, float j)
{
   float result = 0;
   result = i + j;
   return result;
}

double AddD(double i, double j)
{
   double result = 0;
   result = i + j;
   return result;
}

int main()
{
      int i;
      float f;
      double d;

      i = AddI(11,21);
      cout<<i<<"\n";

      f = AddF(10.0f,20.0f);
      cout<<f<<"\n";

      d = AddD(50.50,60.60);
      cout<<d<<"\n";

      return 0;

}