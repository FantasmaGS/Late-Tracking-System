import java.io.*;
class Output {
   void keyIn (String data[][]) {
      int item = 0;
      DataInput d = new DataInputStream(System.in);
      String input;
      Slip s = new Slip();
      try {
         System.out.println("Enter name to be printed:");
         input = d.readLine();
         if (input!=null){
            System.out.println("Printing...\n");
            s.printSlip(data, input);
         }// end if
      } catch (IOException ignore) {}
   } // end keyIn
} // end Output
