package chapter6;

public class Month {

  public static String getMonth(int month) {
      switch (month) {
          case 1:
              return "january";
          case 2:
              return "february";
          case 3:
              return "march";
          case 4:
              return "april";
          case 5:
              return "may";
          case 6:
              return "june";
          case 7:
              return "july";
          default: return "Invalid month number";
      }
  }
      public static int getMonth(String month){
          switch (month)
          {
              case "january": return 1;
              case "february": return 2;
              case "march": return 3;
              case "april": return 4;
              case "may": return 5;
              case "june": return 6;
              case "july": return 7;
              default: return -1;
          }
      }
  }

