package com.musala.javacourse181112;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Test {

class Robot{
  private int currentX=0;
  private int currentY=5;
  private int previousX;
  private int previousY;


    public Robot(int currentX, int currentY) {
        this.previousX=this.currentX;
        this.previousY=this.currentY;
        this.currentX = currentX;
        this.currentY = currentY;
    }
    void moveX(int dx){
        this.previousX=this.currentX;
        this.currentX+=dx;
    }
    void moveY(int dy){
        this.previousY=this.currentY;
        this.currentY+=dy;
    }

    void printCurrentCoordinates(){
        System.out.println("Current Robot cordinates are "
                +"x=" + this.currentX
                +"y=" + this.currentY);
    }


}
}