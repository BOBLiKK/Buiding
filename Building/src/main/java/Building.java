import java.util.ArrayList;

public class Building {
    int members;
    double square;
    int numberoffloors;
    int numberofflats;
    ArrayList<Floor> arr=new ArrayList<Floor>();

    void Floor()
    {
        members=0;
        square=0;
        numberofflats=0;
    }


    public void setarray(Floor obj)
    {
        arr.add(obj);
    }
    public void setsquare()
    {
        for(int i=0;i<arr.size();i++)
        {

            this.square+=arr.get(i).square;
        }
    }
    public void setmembers()
    {
        for(int i=0;i<arr.size();i++) {

            this.members+=arr.get(i).members;
        }
    }

    public void setNumberofflats()
    {
        for(int i=0;i<arr.size();i++) {

            this.numberofflats+=arr.get(i).numberofflats;
        }
    }

    public void setNumberoffloors(int number)
    {
        this.numberoffloors=number;
    }

    public double getsquare()
    {
        return square;
    }
    public int getmembers()
    {
        return members;
    }

    public int getNumberofflats()
    {
        return numberofflats;
    }

    public int getNumberoffloors()
    {
        return numberoffloors;
    }


   void comparefloors(Building obj)
   {
        if (this.numberoffloors>=obj.numberoffloors)
        {
            int a;
            a=this.numberoffloors-obj.numberoffloors;
            System.out.println("В первом здании на " + a + " этажей больше");
        }
        else
        {
            int b;
            b=obj.numberoffloors-this.numberoffloors;
            System.out.println("Во втором здании на " + b + " этажей больше");
        }

   }
    void comparesquare(Building obj)
    {
        if(this.square>=obj.square)
        {
            double a;
            a=this.square/obj.square;
            System.out.println("Площадь первого здания больше в " + a + " раз");
        }
        else
        {
            double b;
            b=obj.square/this.square;
            System.out.println("Площадь второго здания больше в " + b + " раз");

        }
    }
    void comparemembers(Building obj)
    {
        if(this.members>=obj.members)
        {
            double a;
            a=this.members/obj.members;
            System.out.println("В первом здании живёт  в " + a + " раз больше людей");
        }
        else
        {
            double b;
            b=obj.members/this.members;
            System.out.println("Во втором здании живёт  в " + b + " раз больше людей");
        }
    }





}
