import java.util.ArrayList;

public class Building {
    int members;
    double square;
    int numberoffloors;
    int numberofflats;
    ArrayList<Floor> arr=new ArrayList<Floor>();

    void Floor() {
        members=0;
        square=0;
        numberofflats=0;
    }

    /*заполнение массива объектов данными этажей дома*/
    public void setArray(Floor obj) {
        arr.add(obj);
    }

    public void setSquare() {
        for(int i=0;i<arr.size();i++) {
            this.square+=arr.get(i).square;
        }
    }

    public void setMembers() {
        for(int i=0;i<arr.size();i++) {

            this.members+=arr.get(i).members;
        }
    }

    public void setNumberofFlats() {
        for(int i=0;i<arr.size();i++) {

            this.numberofflats+=arr.get(i).numberofflats;
        }
    }

    public void setNumberofFloors(int number) {
        this.numberoffloors=number;
    }

    public double getSquare() {
        return square;
    }

    public int getMembers() {
        return members;
    }

    public int getNumberofFlats() {
        return numberofflats;
    }

    public int getNumberofFloors() {
        return numberoffloors;
    }

    /*сравнение количества этажей двух домов*/
   void compareFloors(Building obj) {
        if (this.numberoffloors>=obj.numberoffloors) {
            int a;
            a=this.numberoffloors-obj.numberoffloors;
            System.out.println("В первом здании на " + a + " этажей больше");
        }
        else {
            int b;
            b=obj.numberoffloors-this.numberoffloors;
            System.out.println("Во втором здании на " + b + " этажей больше");
        }
   }

   /*сравнение общей жилплощади двух домов*/
    void compareSquare(Building obj) {
        if(this.square>=obj.square) {
            double a;
            a=this.square/obj.square;
            System.out.println("Площадь первого здания больше в " + a + " раз");
        }
        else {
            double b;
            b=obj.square/this.square;
            System.out.println("Площадь второго здания больше в " + b + " раз");
        }
    }

    /*сравнение числа жителей в двух домах*/
    void compareMembers(Building obj) {
        if(this.members>=obj.members) {
            double a;
            a=this.members/obj.members;
            System.out.println("В первом здании живёт  в " + a + " раз больше людей");
        }
        else {
            double b;
            b=obj.members/this.members;
            System.out.println("Во втором здании живёт  в " + b + " раз больше людей");
        }
    }
}
