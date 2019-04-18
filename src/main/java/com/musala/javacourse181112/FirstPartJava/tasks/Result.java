package com.musala.javacourse181112.FirstPartJava.tasks;

class Result {
/*
    /*


    public static int entryTime(String s, String keypad) {
        // Write your code here
        int[][] table = new int[3][3];
        int count = 0;
        int result = 0;
        int i,j = 0;


        //for (i=0;i<3;i++){
        //    for (j=0;j<3;j++){
        //        table[i][j] = keypad.charAt(count);
        //    }
        }
        for (i = 0; i< s.length() ; i++){
            int currentInt = keypad.charAt(i);
            int nextInt = keypad.charAt(i+1);

            result += findDistance(keypad, currentInt,nextInt);

        }

        return result;
    }

    private static int findDistance(String keypad, int currentInt, int nextInt) {
        if (isCenter(currentInt,keypad)){
            return 1;
        }
        if (findRollOf(currentInt,keypad) == findRollOf(nextInt,keypad))

        return 0;
    }

    private static boolean isCenter(int currentInt,String keypad) {
        return ((int)keypad.charAt(5) == currentInt);
    }

    private static int findRollOf(int i, String s){
        int count = s.indexOf(i);
        if (count <= 3){
                return 1;
            }else if (count >= 6) {
                return 3;
            }else return 2;
    }

    private static int findCollomOf(int i, String s){
        int count = s.indexOf(i);
        if (count == 1 || count == 4 || count ==7){
            return 1;
        }else if (count == 2 || count == 5 || count ==8) {
            return 2;
        }else return 3;
    }

    public static void main(String[] args) throws IOException {
    //    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "423692";//bufferedReader.readLine();

        String keypad = "923857614";//bufferedReader.readLine();

        int result = Result.entryTime(s, keypad);

     //   bufferedWriter.write(String.valueOf(result));
     //   bufferedWriter.newLine();

      //  bufferedReader.close();
      //  bufferedWriter.close();
    }*/
}
