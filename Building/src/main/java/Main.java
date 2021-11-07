import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        System.out.println("Выберите действие:");
        System.out.println("Введите 1 для сравнения:");
        System.out.println("Введите 2 для получения информации:");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Введите 1 для сравнения этажей:");
                System.out.println("Введите 2 для сравнения домов:");
                System.out.println("Введите 3 для сравнения квартир:");
                Scanner sc1 = new Scanner(System.in);
                int b = sc1.nextInt();
                switch (b) {
                    case 1:
                        System.out.println("Введите количество квартир на этаже1:");
                        Scanner sc3 = new Scanner(System.in);
                        int nfl = sc3.nextInt();
                        System.out.println("Сперва введите количество жильцов в квартире, после через ентер - жилплощадь:");
                        Floor floor1 = new Floor();
                        floor1.setNumberofFlats(nfl);
                        for (int i = 0; i < nfl; i++) {
                            Flat flat1 = new Flat();
                            Scanner sc31 = new Scanner(System.in);
                            Scanner sc32 = new Scanner(System.in);
                            int sq = sc31.nextInt();
                            double mmb = sc32.nextDouble();
                            flat1.setFlat(sq, mmb);
                            floor1.setArray(flat1);
                            floor1.setCurrentFloor(i + 1);
                        }

                        System.out.println("Введите количество квартир на этаже2:");
                        Scanner sc4 = new Scanner(System.in);
                        int nfl2 = sc4.nextInt();
                        System.out.println("Сперва введите количество жильцов в квартире, после через ентер - жилплощадь:");
                        Floor floor2 = new Floor();
                        floor2.setNumberofFlats(nfl2);
                        for (int i = 0; i < nfl2; i++) {
                            Flat flat2 = new Flat();
                            Scanner sc33 = new Scanner(System.in);
                            Scanner sc34 = new Scanner(System.in);
                            int sq2 = sc33.nextInt();
                            double mmb2 = sc34.nextDouble();
                            flat2.setFlat(sq2, mmb2);
                            floor2.setArray(flat2);
                            floor2.setCurrentFloor(i + 1);
                        }
                        floor1.setMembers();
                        floor1.setSquare();
                        floor2.setMembers();
                        floor2.setSquare();
                        floor1.compareMembers(floor2);
                        floor1.compareSquare(floor2);

                        break;
                    case 2:
                        System.out.println("Введите количество этажей в первом доме:");
                        Scanner sc35 = new Scanner(System.in);
                        int fls1 = sc35.nextInt();
                        Building building1 = new Building();
                        building1.setNumberofFloors(fls1);
                        System.out.println("Введите количество квартир на этаже:");
                        Scanner sc36 = new Scanner(System.in);
                        int fts1 = sc36.nextInt();
                        System.out.println("Сперва введите количество жильцов в квартире, после через ентер - жилплощадь:");
                        for (int i = 0; i < fls1; i++) {
                            Floor floor3 = new Floor();
                            floor3.setNumberofFlats(fts1);
                            int g1=i+1;
                            System.out.println("Этаж " + g1 + " :");
                            for (int j = 0; j < fts1; j++) {
                                Flat flat3 = new Flat();
                                Scanner sc37 = new Scanner(System.in);
                                Scanner sc38 = new Scanner(System.in);
                                int sq3 = sc37.nextInt();
                                double mmb3 = sc38.nextDouble();
                                flat3.setFlat(sq3, mmb3);
                                floor3.setArray(flat3);
                                floor3.setCurrentFloor(i + 1);
                            }

                            floor3.setMembers();
                            floor3.setSquare();
                            building1.setArray(floor3);
                        }

                        System.out.println("Введите количество этажей во втором доме:");
                        Scanner sc39 = new Scanner(System.in);
                        int fls2 = sc39.nextInt();
                        Building building2 = new Building();
                        building2.setNumberofFloors(fls1);
                        System.out.println("Введите количество квартир на этаже:");
                        Scanner sc40 = new Scanner(System.in);
                        int fts2 = sc40.nextInt();
                        System.out.println("Сперва введите количество жильцов в квартире, после через ентер - жилплощадь:");
                        for (int i = 0; i < fls2; i++) {
                            Floor floor4 = new Floor();
                            floor4.setNumberofFlats(fts2);
                            int g2=i+1;
                            System.out.println("Этаж " + g2 + " :");
                            for (int j = 0; j < fts2; j++) {
                                Flat flat4 = new Flat();
                                Scanner sc41 = new Scanner(System.in);
                                Scanner sc42 = new Scanner(System.in);
                                int sq4 = sc41.nextInt();
                                double mmb4 = sc42.nextDouble();
                                flat4.setFlat(sq4, mmb4);
                                floor4.setArray(flat4);
                                floor4.setCurrentFloor(i + 1);
                            }

                            floor4.setMembers();
                            floor4.setSquare();
                            building2.setArray(floor4);
                        }

                        building1.setMembers();
                        building1.setSquare();
                        building1.setNumberofFlats();
                        building2.setMembers();
                        building2.setSquare();
                        building2.setNumberofFlats();

                        building1.compareMembers(building2);
                        building1.compareSquare(building2);
                        building1.compareFloors(building2);

                        break;
                    case 3:
                        System.out.println("Сперва введите количество жильцов в квартире, после через ентер - жилплощадь:");
                        Flat flat21 = new Flat();
                        Scanner sc51 = new Scanner(System.in);
                        Scanner sc52 = new Scanner(System.in);
                        int sq51 = sc51.nextInt();
                        double mmb52 = sc52.nextDouble();
                        flat21.setFlat(sq51, mmb52);

                        System.out.println("Сперва введите количество жильцов в квартире, после через ентер - жилплощадь:");
                        Flat flat22 = new Flat();
                        Scanner sc53 = new Scanner(System.in);
                        Scanner sc54 = new Scanner(System.in);
                        int sq53 = sc53.nextInt();
                        double mmb54 = sc54.nextDouble();
                        flat22.setFlat(sq53, mmb54);

                        flat21.compareSquare(flat22);
                        flat21.compareMembers(flat22);

                        break;
                }
                break;
            case 2:
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Введите 1 для получения информации о этаже:");
                System.out.println("Введите 2 для получения информации о здании:");
                int c = sc2.nextInt();
                switch (c) {
                    case 1:
                        System.out.println("Введите количество квартир на этаже:");
                        Scanner scc = new Scanner(System.in);
                        int nfll = scc.nextInt();
                        System.out.println("Сперва введите количество жильцов в квартире, после через ентер - жилплощадь:");
                        Floor floorr = new Floor();
                        floorr.setNumberofFlats(nfll);
                        for (int i = 0; i < nfll; i++) {
                            Flat flat1 = new Flat();
                            Scanner sc11 = new Scanner(System.in);
                            Scanner sc12 = new Scanner(System.in);
                            int sq11 = sc11.nextInt();
                            double mmb12 = sc12.nextDouble();
                            flat1.setFlat(sq11, mmb12);
                            floorr.setArray(flat1);
                            floorr.setCurrentFloor(i + 1);
                        }
                        floorr.setMembers();
                        floorr.setSquare();
                        int mmbrs1 = floorr.getMembersf();
                        double sqqr1 = floorr.getSquaref();
                        System.out.println("Площадь этажа " + sqqr1);
                        System.out.println("На нём живёт " + mmbrs1 + " человек");
                        break;
                    case 2:
                        System.out.println("Введите количество этажей в  доме:");
                        Scanner scc2 = new Scanner(System.in);
                        int flss2 = scc2.nextInt();
                        Building building11 = new Building();
                        building11.setNumberofFloors(flss2);
                        System.out.println("Введите количество квартир на этаже:");
                        Scanner scc3 = new Scanner(System.in);
                        int ftss2 = scc3.nextInt();
                        System.out.println("Сперва введите количество жильцов в квартире, после через ентер - жилплощадь:");
                        for (int i = 0; i < flss2; i++) {
                            Floor floor33 = new Floor();
                            floor33.setNumberofFlats(ftss2);
                            int g3=i+1;
                            System.out.println("Этаж " + g3 + " :");
                            for (int j = 0; j < ftss2; j++) {
                                Flat flat33 = new Flat();
                                Scanner sc377 = new Scanner(System.in);
                                Scanner sc388 = new Scanner(System.in);
                                int sq33 = sc377.nextInt();
                                double mmb33 = sc388.nextDouble();
                                flat33.setFlat(sq33, mmb33);
                                floor33.setArray(flat33);
                                floor33.setCurrentFloor(i + 1);
                            }

                            floor33.setMembers();
                            floor33.setSquare();
                            building11.setArray(floor33);
                        }
                            building11.setMembers();
                            building11.setSquare();
                            building11.setNumberofFlats();

                            int l1 = building11.getMembers();
                            double l2 = building11.getSquare();
                            int l3 = building11.getNumberofFloors();
                            int l4 = building11.getNumberofFlats();

                            System.out.println("В здании " + l3 + " этажей");
                            System.out.println("В здании " + l4 + " квартир");
                            System.out.println("Его жилплощадь " + l2);
                            System.out.println("Там живёт " + l1 + " человеков" );

                            break;

                        }
                        break;
                }
        }
    }



