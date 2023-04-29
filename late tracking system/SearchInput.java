import java.io.*;

class SearchInput { // Prepare keyboard to recelve data
   public void keyInput (String fileName, String data[][], int item) {
      DataInput d = new DataInputStream(System.in);
      String input;
      Search s = new Search();
      System.out.println("\nEnter the criteria to search for: ");
      try {
         input = d.readLine();
         if (input!=null) {
            System.out.println("Searching...\n");
            s.searching(fileName, data, item, input); 
      }
      }  catch (IOException ignored) {}
   } // end keyInput
} // end searchinput