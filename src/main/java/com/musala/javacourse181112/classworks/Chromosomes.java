package com.musala.javacourse181112.classworks;

public class Chromosomes {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String gender = sc.nextLine().toLowerCase()
        GenderEnum gender = GenderEnum.FEMALE;
        gender = GenderEnum.MALE;
//        if(args.length > 0 && args[0] != null);{
//            System.out.println("Usage : java ChromosomesApplication male|female");
//            System.exit(1);
//        }
//        final GenderEnum gender = "female".equalsIgnoreCase(args[0]) ? GenderEnum.FEMALE : GenderEnum.MALE;

        if (gender.equals(GenderEnum.MALE) || gender.equals(GenderEnum.FEMALE)) {
            switch (gender) {
                case MALE:
                    System.out.println("y");
                case FEMALE:
                    if (gender.equals(GenderEnum.MALE)) {
                        break;
                    } else {
                        System.out.println("x");
                    }
            }
            System.out.println("x");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
