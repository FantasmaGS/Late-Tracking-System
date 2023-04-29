import java.io.*;

class ReadData { // Read data from external file using readFile() method
   public String[] readFile(String fname, int max) { // fname =" records. txt*
   String data[] = new String[max]; // max = maximum number of records
      for(int k = 0; k < max; k++) // Initialize data array to store max records
         data[k] ="";
      int i = 0; // Start counting records
      try {
         DataInput in = new DataInputStream(new FileInputStream(fname));
         String txt = in.readLine();
         while (txt != null) {
            data[i++] = txt; // Store record In array, data; and Increment I
            txt = in.readLine();
         }//end while
      } catch (Exception e) {};
      return data;	// Return the entire array of records
   } // end readFile
} //end readData
