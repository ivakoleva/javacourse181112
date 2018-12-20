package com.musala.javacourse181112.ForFun;

public class ArrayFest {
    public static final int INT = 44;

    public static void main(String[] args) {
        int[][][][][][] a = new int[10][10][10][10][10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    for(int l=0;l<10;l++){
                        for(int h=0;h<10;h++){
                            for(int g=1;g<10;g++){
                                    a[i][j][k][l][h][g]=a[i][j][k][l][h][g-1]+1;
                            }
                        }
                    }
                }
            }
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    System.out.println();
                    for(int l=0;l<10;l++){
                        for(int h=0;h<10;h++){
                            System.out.println();
                            for(int g=0;g<10;g++){
                                System.out.print(a[i][j][k][l][h][g]);
                            }
                        }
                    }
                }
            }
        }
    }
}
