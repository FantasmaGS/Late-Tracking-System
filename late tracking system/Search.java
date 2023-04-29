import java.io.*;

class Search {
   void searching (String fileName,String data[][], int item, String input) {
      // Item = part to be found
      boolean found = false;
      for (int i = 0; i < data.length; i++) { // Search for records
         if (data[i][item].equals(input)) {
            found = true;
            for (int k = 0; k < 6; k++)
               System.out.print(data[i][k] + "\t\t"); // Output entire record  System.out.println();
         } // end if
      } // end loop
      if (!found)
      System.out.println("No record found!");
   } // end searching
} // end Search