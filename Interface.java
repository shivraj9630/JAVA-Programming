interface Circle
{
      public final float PI = 3.14f;

      public float CalculateArea(float Radius);
      public float CalculateCircumfarance(float Radius);

}

class Demo implements Circle
{
        public float CalculateArea(float Radius)
        {
              return PI * Radius *Radius;
        }

        public float CalculateCircumfarance(float Radius)
        {
              return 2 * PI * Radius;
        }
}

class Interface
{
     public static void main(String Arg[])
     {
        Demo obj = new Demo();

        float fRet = 0.0f;

        fRet = obj.CalculateArea(15.5f);
        System.out.println("Area of Circle :"+fRet);

        fRet = obj.CalculateCircumfarance(20.5f);
        System.out.println("Circumfarance of Circle :"+fRet);
     }
}