#include<iostream>
using namespace std;

class ShivArray
{
        private:
               int *Arr;
               int iSize;

        public:
              ShivArray(int Length)
              {
                  cout<<"Inside Const..."<<"\n";
                  iSize = Length;
                  Arr = new int[iSize];

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

              int Addition()
              {
                 int iSum = 0;
                for(int i = 0; i < iSize; i++)
                {
                    iSum = iSum + Arr[i];
                }
                return iSum;

              }

};

int main()
{
      ShivArray sobj1(6);
      ShivArray sobj2(4);

      sobj1.Accept();
      sobj1.Display();

      sobj2.Accept();
      sobj2.Display();

      int iRet = 0;

      iRet = sobj1.Addition();
      cout<<"Addition of Array 1..."<<iRet<<"\n";

      iRet = sobj2.Addition();
      cout<<"Addition of Array2..."<<iRet<<"\n";


}