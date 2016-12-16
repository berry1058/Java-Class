package examples.ooprogramming;
import java.io.*;
import java.util.*;

public class DateTest {
    public static void main(String args[]) {
        Date now = new Date();
        StringTokenizer st;
        ArrayList list;
        File f;
        BufferedReader br;
        
        System.out.println(now.toString());
        System.out.println(now);

        System.out.print("Day of the Week: ");
        System.out.println(now.getDay());

        System.out.print("Day of the Month: ");
        System.out.println(now.getDate());

        System.out.print("Month: ");
        System.out.println(now.getMonth());

        System.out.print("Year: ");
        System.out.println(now.getYear());

        System.out.print("Time: ");
        System.out.println(now.getTime());
    }
}