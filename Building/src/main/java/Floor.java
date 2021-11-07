import java.util.ArrayList;

public class Floor extends Building{
    int members;
    double square;
    int currentfloor;
    int numberofflats;
    ArrayList<Flat> arrr=new ArrayList<Flat>();

    void Floor() {
        members=0;
        square=0;
    }

    /*заполнение массива объектов квартирами*/
    public void setArray(Flat obj) {
        arrr.add(obj);
    }

    public void setCurrentFloor(int number) {
        this.currentfloor=number;
    }

    public void setSquare() {
        for(int i=0;i<arrr.size();i++) {

            this.square+=arrr.get(i).square;
        }
    }

    public void setMembers() {
        for(int i=0;i<arrr.size();i++) {

            this.members += arrr.get(i).members;
        }
    }

    public void setNumberofFlats(int sumnf) {
        this.numberofflats=sumnf;
    }

    public int getCurrentFloor() {
        return currentfloor;
    }

    public double getSquaref() {
        return square;
    }

    public int getMembersf() {
        return members;
    }

    public int getNumberofFlatsf() {
        return numberofflats;
    }

    /*сравнение площади двух этажей*/
    void compareSquare(Floor obj) {
        if(this.square>=obj.square) {
            double a;
            a=this.square/obj.square;
            System.out.println("Площадь первого этажа больше в " + a + " раз");
        }
        else {
            double b;
            b=obj.square/this.square;
            System.out.println("Площадь второго этажа больше в " + b + " раз");

        }
    }

    /*сравнение числа жителей двух разных этажей*/
    void compareMembers(Floor obj) {
        if(this.members>=obj.members) {
            double a;
            a=this.members/obj.members;
            System.out.println("На первом этаже живёт  в " + a + " раз больше людей");
        }
        else {
            double b;
            b=obj.members/this.members;
            System.out.println("На втором этаже живёт  в " + b + " раз больше людей");
        }
    }
}
