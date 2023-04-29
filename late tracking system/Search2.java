import java.io.*;

class Search2 { // returns array after deleting
   void searching2 (String fileName, String data[][], int item, String input) {
      // item:o=name etc
      boolean found = false;
      System.out.println(data.length);
      for (int i = 0; i < data.length; i++) { // Search for records
         if (data[i][item].equals(input)) {
            found = true;
            System.out.println("Record to delete:");
            for (int k = 0; k < 6; k++) {
               System.out.print(data[i][k] + "\t\t"); // Output the entire record data [i][k] =**;
            }
            System.out.println();
         } // end If
      }// end loop
      if (!found)
         System.out.println("No record found!");
      UpdateRecords ur = new UpdateRecords();
      ur.updateFile (fileName, data);
   } //end searching
} // end Search2