//package String;

import java.util.*;
import java.lang.*;
import java.io.*;

public class reversestr {
  public static void main(String args[]) {
    String str = "Indira";

    // conversion from string object to string buffer

    StringBuffer sb = new StringBuffer(str);

    // To reverse the string

    sb.reverse();
    System.out.println(sb);
  }

}
