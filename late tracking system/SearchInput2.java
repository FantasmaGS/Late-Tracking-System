import java.io.*;

class SearchInput2 { // Prepare keyboard to receive data
   public void keyInput (String fileName, String data[][], int item) {
      DataInput d = new DataInputStream(System.in);
      String input;
      Search2 s = new Search2();
      try {
         input = d.readLine();
         if (input != null) {
            System.out.println("Searching...\n");
            s.searching2(fileName, data, item, input);
         }
      } catch (IOException ignored) { }
   } // end keyInput
} // end SearchInput