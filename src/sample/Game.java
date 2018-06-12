package sample;

import java.util.Arrays;
import java.util.Random;

import static sample.Main.numbers;


public class Game {

    public static int LENGTH = 9;
    public static int count = 0;
    public static boolean check = false;
    public static boolean check1 = false;
    public static String FinalRoute = "";
    public static String OrderRoute = "";

    public static void order() {
        int count = 1;
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                numbers[i][x] = count;
                count++;
                if (i == 2 && x == 2) {
                    numbers[i][x] = 0;
                }
            }
        }
    }

    public static void move(String direction) {
        int row = 0;
        int column = 0;
        int value = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int x = 0; x < numbers.length; x++) {
                if (numbers[i][x] == 0) {
                    row = i;
                    column = x;
                    //System.out.println(row + " "+ column);
                }
            }
        }

        if (direction == "up") {
            value = numbers[row - 1][column];
            numbers[row][column] = value;
            numbers[row - 1][column] = 0;
            //System.out.println(Arrays.deepToString(numbers));

        } else if (direction == "down") {
            value = numbers[row + 1][column];
            numbers[row][column] = value;
            numbers[row + 1][column] = 0;
            //System.out.println(Arrays.deepToString(numbers));
        } else if (direction == "right") {
            value = numbers[row][column + 1];
            numbers[row][column] = value;
            numbers[row][column + 1] = 0;
            //System.out.println(Arrays.deepToString(numbers));

        } else if (direction == "left") {
            value = numbers[row][column - 1];
            numbers[row][column] = value;
            numbers[row][column - 1] = 0;
            //System.out.println(Arrays.deepToString(numbers));

        } else {
            System.out.println("Error");
        }

    }


    public static boolean isOrdered(int[][] array, String identify) {

        if (identify.equals("CreateRoute")) {
            return false;
        }
        else if (identify.equals("Trace")) {
            int count = 1;

            for (int i = 0; i < array.length; i++) {
                for (int x = 0; x < array.length; x++) {
                    if (array[i][x] == count) {
                        count++;
                    } else if (count == 9) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;


    }

    public static int xLocation(int[][] array, int num) {
        int X = num;
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                if (num == array[x][y]) {
                    X = x;
                }
            }
        }
        return X;
    }

    public static int yLocation(int[][] array, int num) {
        int Y = num;
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                if (num == array[x][y]) {
                    Y = y;
                }
            }
        }
        return Y;
    }


    public static void trace(int[][] array, String identify, String level) {
        Random rand = new Random();
        int position = 0;
        if(identify.equals("CreateRoute")) {
            if (LENGTH == 5) {
                position = rand.nextInt(16) + 1;
            }
            else if (LENGTH == 7) {
                position = rand.nextInt(40) + 1;
            }
            else if (LENGTH == 8) {
                position = rand.nextInt(67) + 1;
            }
            else if (LENGTH == 9) {
                position = rand.nextInt(136) + 1;
            }
            else if (LENGTH == 10) {
                position = rand.nextInt(188) + 1;
            }
            else if (LENGTH == 11) {
                position = rand.nextInt(376) + 1;
            }
            else if (LENGTH == 12) {
                position = rand.nextInt(596) + 1;
            }
            else if (LENGTH == 15) {
                position = rand.nextInt(3448) + 1;
                System.out.println("Position: "+position);
            }
        }

        if (identify.equals("CreateRoute")) {
            order();
        }
        trace(array, " ", xLocation(array, 0), yLocation(array, 0), isOrdered(array, identify), identify, position);

    }

    public static void trace(int[][] array, String path, int x, int y, boolean ordered, String identify, int position) {
        if (path.length() == LENGTH || ordered) {
            //System.out.println(path);
            count++;
            //System.out.println("c: "+c);
            if (isOrdered(array, identify)) {
                System.out.println(Arrays.deepToString(numbers));
                if( check1 == false) {
                    check1 = true;
                    OrderRoute = path;
                    //System.out.println("Path: " +path);
                }
                else if(path.length() < OrderRoute.length()){
                    OrderRoute = path;
                }
            } else if (identify.equals("CreateRoute")) {
                //System.out.println(Arrays.deepToString(numbers));
                //System.out.println(count);
                if (count == position) {
                    FinalRoute = path;
                }

            }

        } else {
            //up
            if ((x <= array.length && x > 0) && path.charAt(path.length() - 1) != 'D') {
                move("up");
                String trace = path + "U";

                trace(array, trace, xLocation(array, 0), yLocation(array, 0), isOrdered(array, identify), identify, position);

                trace = trace.substring(0, trace.length() - 1);
                move("down");

            }

            //down
            if ((x >= 0 && x < array.length - 1) && path.charAt(path.length() - 1) != 'U') {
                move("down");
                String trace = path + "D";

                trace(array, trace, xLocation(array, 0), yLocation(array, 0), isOrdered(array, identify), identify, position);

                trace = trace.substring(0, trace.length() - 1);
                move("up");
            }

            //left
            if ((y < array.length && y > 0) && path.charAt(path.length() - 1) != 'R') {
                move("left");
                String trace = path + "L";

                trace(array, trace, xLocation(array, 0), yLocation(array, 0), isOrdered(array, identify), identify, position);

                trace = trace.substring(0, trace.length() - 1);
                move("right");
            }

            //right
            if ((y >= 0 && y < array.length - 1) && path.charAt(path.length() - 1) != 'L') {
                move("right");
                String trace = path + "R";

                trace(array, trace, xLocation(array, 0), yLocation(array, 0), isOrdered(array, identify), identify, position);

                trace = trace.substring(0, trace.length() - 1);
                move("left");
            }

        }
    }

    public static void newArray(int[][] numbers) {
        order();
        String direction = FinalRoute;

        for (int i = 0; i < direction.length(); i++) {
            if (direction.charAt(i) == 'L') {
                move("left");
            } else if (direction.charAt(i) == 'R') {
                move("right");
            } else if (direction.charAt(i) == 'D') {
                move("down");
            } else if (direction.charAt(i) == 'U') {
                move("up");
            }
        }
    }

    public static void moveTrack(int x, int y){

        int num = numbers[x][y];

        int xposition = xLocation(numbers, 0);
        int yposition = yLocation(numbers, 0);

        int xTarget = xLocation(numbers, num);
        int yTarget = yLocation(numbers, num);

        check = false;

        if((xposition - 1 == xTarget) && (yposition == yTarget)){
            move("up");
            check = true;
        }
        else if((xposition + 1 == xTarget) && (yposition == yTarget)){
            move("down");
            check = true;
        }
        else if((xposition == xTarget) && (yposition - 1 == yTarget)){
            move("left");
            check = true;
        }
        else if((xposition == xTarget) && (yposition + 1 == yTarget)){
            move("right");
            check = true;
        }
        else{
            System.out.println("NONE");
        }
        //B1.setdisable
        System.out.println(Arrays.deepToString(numbers));

    }

    public static String hint(int num){
        if(num == 1 && OrderRoute.length() > 1){
            String letter = Character.toString(OrderRoute.charAt(1));
            if(letter.equals("L")){
                return "Move Left";
            }
            else if (letter.equals("R")) {
                return "Move Right";
            }
            else if(letter.equals("D")){
                return "Move Down";
            }
            else if(letter.equals("U")){
                return "Move Up";
            }
        }
        return OrderRoute;

    }
}


