import java.io.*;

class KeyInput {
   static String txt, input;
   static String items[] = new String[6];
   public static String entries() {
      DataInput keyboard = new DataInputStream(System.in);
      try {
         System.out.println("Enter Last Name, First Name");
         input = keyboard.readLine();
         txt = input; // Store name
         items[0] = input;
         int index = 1; // Get next Item; Item Index 1 to 5
         while((input != null) && index < 6) {
            switch (index) {
               case 1: System.out.println("Enter Student ID");
                  break;
               case 2: System.out.println("Enter Homeform");
                  break;
               case 3: System.out.println("Enter Date-mm/dd/yy");
                  break;
               case 4: System.out.println("Enter Time-hh:mm");
                  break;
               case 5: System.out.println("Enter Period-period x");
                  break;
            } // end switch
            input = keyboard.readLine();
            txt += "#" + input;
            items[index] = input;
            index++;
         } // end while
         System.out.println("\nNew record complete.");
         System.out.println(txt);
      } catch(Exception e) {}
      return txt;
   } // end entries
} // end keyInput