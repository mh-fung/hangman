public class HangManDisplay {
    public void printHangMan (int lives) {
        switch (lives) {
            case 7:
                System.out.println("Remaining lives: 7");
                System.out.println("---------------");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("---------------");

                break;
            case 6:
                System.out.println("Remaining lives: 6");
                System.out.println("---------------");
                System.out.println("|        |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("---------------");
                break;
            case 5:
                System.out.println("Remaining lives: 5");
                System.out.println("---------------");
                System.out.println("|        |");
                System.out.println("|        0 ");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("---------------");

                break;
            case 4:
                System.out.println("Remaining lives: 4");
                System.out.println("---------------");
                System.out.println("|        |");
                System.out.println("|        0 ");
                System.out.println("|        |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("---------------");
                break;
            case 3:
                System.out.println("Remaining lives: 3");
                System.out.println("---------------");
                System.out.println("|        |");
                System.out.println("|        0 ");
                System.out.println("|      --|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("---------------");
                break;
            case 2:
                System.out.println("Remaining lives: 2");
                System.out.println("---------------");
                System.out.println("|        |");
                System.out.println("|        0 ");
                System.out.println("|      --|--");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("---------------");
                break;
            case 1:
                System.out.println("Remaining lives: 1");
                System.out.println("---------------");
                System.out.println("|        |        ^^^^^^^^^^^^^^^^^^^^");
                System.out.println("|        0      < I'm dying soon..... >");
                System.out.println("|      --|--      vvvvvvvvvvvvvvvvvvvv");
                System.out.println("|        |");
                System.out.println("|       /");
                System.out.println("|");
                System.out.println("---------------");
                break;
            case 0:
                System.out.println("Remaining lives: 0");
                System.out.println("Adios :P");
                System.out.println("---------------");
                System.out.println("|        |");
                System.out.println("|        0 ");
                System.out.println("|      --|--");
                System.out.println("|        |");
                System.out.println("|       | |");
                System.out.println("|");
                System.out.println("---------------");
                break;
        }

    }
}
