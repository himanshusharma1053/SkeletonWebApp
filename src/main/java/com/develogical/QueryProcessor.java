package com.develogical;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("shakespeare")) {
      return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
          + "English poet, playwright, and actor, widely regarded as the greatest "
          + "writer in the English language and the world's pre-eminent dramatist.";
    }

    if (query.toLowerCase().contains("what is your name?")) {
      return "WinningTeam";
    }

    if (query.toLowerCase().contains("which of the following numbers is the largest:")) {
      String[] numbers = query.split(":");
      String[] numbers2 = numbers[1].split(",");
      numbers2[2] = numbers2[2].replace("?", "");
      int a = Integer.parseInt(numbers2[0].strip());
      int b = Integer.parseInt(numbers2[1].strip());
      int c = Integer.parseInt(numbers2[2].strip());

      if(a > b && a > c) {
        return Integer.toString(a);
      } else if (b > a && b > c) {
        return Integer.toString(b);
      } else if (c > a && c > b) {
        return Integer.toString(c);
      }
     
      return "WinningTeam";
    }

    if (query.toLowerCase().contains("what is") && query.toLowerCase().contains("plus")) {
      String[] querySplit = query.split(" ");
      querySplit[4] = querySplit[4].replace("?", "");
      int a = Integer.parseInt(querySplit[2].strip());
      int b = Integer.parseInt(querySplit[4].strip());

      if(a > b) {
        return Integer.toString(a);
      } else if (b > a) {
        return Integer.toString(b);
      };

    }    

    if (query.toLowerCase().contains("what is") && query.toLowerCase().contains("multiplied")) {
      String[] querySplit = query.split(" ");
      querySplit[5] = querySplit[5].replace("?", "");
      int a = Integer.parseInt(querySplit[2].strip());
      int b = Integer.parseInt(querySplit[5].strip());

      return Integer.toString(a * b);
    }

    if (query.toLowerCase().contains("which of the following numbers is both a square and a cube")) {
      String[] querySplit = query.split(":");
      querySplit[1] = querySplit[1].replace("?", "");
      querySplit[1] = querySplit[1].replace(" ", "");
      String[] numbers = querySplit[1].split(",");

      for(int i = 0; i < numbers.length; i++) {
        int temp = Integer.parseInt(numbers[i]);

        if(numbers[i] == 1 || numbers[i] == 64 || numbers[i] == 4096) {
          return Integer.toString(numbers[i]);
        }

      return Integer.toString(a * b);
    }

    return "";
  }
}
