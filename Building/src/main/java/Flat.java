public class Flat  extends Floor{
    int members;
    double square;
    public void setFlat(int members, double square)
    {
        this.members=members;
        this.square=square;
    }

    void comparesquare(Flat obj)
    {
        if(this.square>=obj.square)
        {
            double a;
            a=this.square/obj.square;
            System.out.println("Площадь первой квартиры больше в " + a + " раз");
        }
        else
        {
            double b;
            b=obj.square/this.square;
            System.out.println("Площадь второй квартиры больше в " + b + " раз");

        }
    }
    void comparemembers(Flat obj)
    {
        if(this.members>=obj.members)
        {
            double a;
            a=this.members/obj.members;
            System.out.println("В первой квартире живёт  в " + a + " раз больше людей");
        }
        else
        {
            double b;
            b=obj.members/this.members;
            System.out.println("Во второй квартире живёт  в " + b + " раз больше людей");
        }
    }

}
