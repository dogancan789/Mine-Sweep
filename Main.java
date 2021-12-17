import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısı giriniz");
        int line = input.nextInt();
        System.out.println("Sütun sayısı giriniz");
        int row = input.nextInt();
        SweepGenerator sweep1 = new SweepGenerator(line, row);
        char[][] mainSweep = sweep1.generate(line, row);


        char[][] mainSweep2 = SweepGenerator.fill(mainSweep);
        char[][] mainSweep3 = SweepGenerator.copyLarger(mainSweep);
        SweepGenerator.printArray(mainSweep);    //print the main sweep
        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        System.out.println("Sorgulanmak istenen satır numarasını giriniz");
        int questionedLine = input.nextInt();
        System.out.println("Sorgulanmak istenen sütun numarasını giriniz");
        int questionedRow = input.nextInt();
        //SweepGenerator.printArray(mainSweep);
        while (true) {
            if (mainSweep[questionedLine][questionedRow] == '*') {
                System.out.println("oyunu kaybettiniz");
                SweepGenerator.printArray(mainSweep);
                break;
            }/*else if(seeArea.win(mainSweep)){
                System.out.println("oyunu kazandınız!!!!");
            }*/
            else {
                mainSweep2[questionedLine][questionedRow] = seeArea.open(mainSweep3, questionedLine, questionedRow);


                if (seeArea.open(mainSweep3, questionedLine, questionedRow) == '0') {
                    for (int i = questionedLine; i < 10; i++) {
                        if (seeArea.open(mainSweep3, questionedLine, questionedRow) == '0') {
                            for (int j = questionedRow; j < 10; j++) {
                                if (seeArea.open(mainSweep3, i, j) == '0') {
                                    mainSweep2[i][j] = seeArea.open(mainSweep3, i, j);
                                } else {
                                    break;
                                }

                            }

                            for (int j = questionedRow; j >= 0; j--) {
                                if (seeArea.open(mainSweep3, i, j) == '0') {
                                    mainSweep2[i][j] = seeArea.open(mainSweep3, i, j);
                                } else {
                                    break;
                                }

                            }
                        } else {
                            break;
                        }


                    }
                    for (int i = questionedLine; i >= 0; i--) {
                        if (seeArea.open(mainSweep3, questionedLine, questionedRow) == '0') {
                            for (int j = questionedRow; j < 10; j++) {
                                if (seeArea.open(mainSweep3, i, j) == '0') {
                                    mainSweep2[i][j] = seeArea.open(mainSweep3, i, j);
                                } else {
                                    break;
                                }
                            }
                            for (int j = questionedRow; j >= 0; j--) {
                                if (seeArea.open(mainSweep3, i, j) == '0') {
                                    mainSweep2[i][j] = seeArea.open(mainSweep3, i, j);
                                } else {
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                }


            }
            System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
            SweepGenerator.printArray(mainSweep2);

            System.out.println("Sorgulanmak istenen satır numarasını giriniz");
            questionedLine = input.nextInt();
            System.out.println("Sorgulanmak istenen sütun numarasını giriniz");
            questionedRow = input.nextInt();
        }


    }
}
