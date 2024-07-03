#include<iostream>
using namespace std;

// Application for generic programming
template < class T> // Template Header
T Add(T i, T j)      // T - Template Argument
{
     T result;
     result = i + j;
     return result;
}

int main()
{
     int i;
     float f;
     double d;

     i = Add(10,20);
     cout<<i<<"\n";

     f = Add(10.1f,20.1f);
     cout<<f<<"\n";

     d = Add(10.10, 20.20);
     cout<<d<<"\n";

     return 0;

}