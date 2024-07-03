#include<iostream>
using namespace std;

template < class T >
class ShivArray
{
        private:
               T *Arr;
               int iSize;

        public:
              
              ShivArray(int Length)
              {
                  cout<<"Inside Const..."<<"\n";
                  iSize = Length;
                  Arr = new T[iSize];

              }
               
              ~ShivArray()
              {
                  cout<<"Inside Dest..."<<"\n";
                  delete []Arr;
              }
              
              void Accept()
              {
               cout<<"Enter The Values..."<<"\n";
               for(int i = 0; i < iSize; i++)
               {
                  cin>>Arr[i];
               }

              }
              
              void Display()
              {
               cout<<"Element of Array..."<<"\n";
               for(int i = 0; i < iSize; i++)
               {
                  cout<<Arr[i]<<"\n";
               }
              }
              
               T Addition()
              {
                 T iSum = 0;
                for(int i = 0; i < iSize; i++)
                {
                    iSum = iSum + Arr[i];
                }
                return iSum;

              }

};

int main()
{
      ShivArray <int>sobj1(6);
      ShivArray <float>sobj2(4);

      sobj1.Accept();
      sobj1.Display();

      sobj2.Accept();
      sobj2.Display();

      int iRet = 0;

      iRet = sobj1.Addition();
      cout<<"Addition of Array 1..."<<iRet<<"\n";

      float fRet = 0.0f;
      fRet = sobj2.Addition();
      cout<<"Addition of Array2..."<<fRet<<"\n";


}