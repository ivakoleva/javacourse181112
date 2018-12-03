package com.musala.javacourse181112.samples.io;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderExample {
  public static void main(String args[]) throws IOException {
    String s = "== == =a";

    char buf[] = new char[s.length()];
    for(int i=0;i<s.length();i++){
      buf[i] = s.charAt(i);
    }
    CharArrayReader in = new CharArrayReader(buf);
    PushbackReader f = new PushbackReader(in);
    int c;
    while ((c = f.read()) != -1) {
      if(65535 == c){
        break;
      }
      switch (c) {
      case '=':
        c = f.read();
	      if (c == '=') {
		      System.out.print(".eq.");
	      } else {
		      System.out.print("=");
		      f.unread(c);
	      }
        break;
      default:
        System.out.print((char) c);
        break;
      }
    }
  }
}