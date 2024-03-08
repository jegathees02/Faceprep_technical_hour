package LinkedList.String;

import java.util.*;
public class naive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2  =sc.nextLine();
        int n1 = str1.length();
        int  n2 = str2.length();
        int i=0,j=n2-1;
        for( i=0,j=n2-1; j < n1;) {
            if(str2.equals(str1.substring(i,j+1))) System.out.println(i);
        }
        i++;
        j++;
    }
    
}
