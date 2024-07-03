abstract class RBI
{
     public abstract float CalculateROI();

     public void DisplayRules()
     {
        System.out.println("You Have Submit Your Adhar Card & Pan Card.");
        System.out.println("Minimun Balance is.");
     }

}

class SBI extends RBI
{
      public float CalculateROI()
      {
           return 7.7f;
      }

}

class BOM extends RBI
{ 
    public float CalculateROI()
    {
          return 8.8f;
    }

}


class Abstract
{
    public static void main(String Arg[])
    {
         SBI sobj = new SBI();
         BOM bobj = new BOM();

         sobj.DisplayRules();
         bobj.DisplayRules();

         float fRet = 0.0f;

         fRet = sobj.CalculateROI();
         System.out.println("ROI of SBI :"+fRet);

         fRet = bobj.CalculateROI();
         System.out.println("ROI of BOM :"+fRet);

    }
}