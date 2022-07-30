// 백준 2577번_ 숫자의 개수 

import java.util.Scanner;

public class 숫자의 개수 {
  public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);
   int a, b, c = 0;
   
   a = sc.nextInt();
   b = sc.nextInt();
   c = sc.nextInt();
   x = a * b * c
   
   String str = Integer.toString(x);
  
   for (i = 0; i < 10; i++) {
    int count = 0;
    for(j = 0; j < str.length(); j++) {
      if((str.charAt(j)-'0')==i) {
        count++
        }
    }System.out.println(count); 
   } 
  }  
 }   
   
   
  
