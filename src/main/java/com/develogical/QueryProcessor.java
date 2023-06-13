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

    if (query.toLowerCase().contains("Which of the following numbers is the largest:")) {
      String[] numbers = query.split(":");
      String[] numbers2 = numbers[1].split(",");
      int a = Integer.parseInt(numbers2[0]);
      int b = Integer.parseInt(numbers2[1]);
      int c = Integer.parseInt(numbers2[2]);

      if(a > b && a > c) {
        return a.toString();
      } else if (b > a && b > c) {
        return b.toString();
      } else if (c > a && c > b) {
        return c.toString();
      }
     
      return "WinningTeam";
    }

    return "";
  }
}
