class Slip {
   public static void printSlip(String data[][], String input) {
    
   boolean found = false;
   String lastName = "";
   String firstName = "";
   String id = "";
   String homeform = "";
   String date = "";
   String time = "";
   String period = "";
    
   for (int i = 0; i < data.length; i++) {
      if (data[i][0]. equals(input)) {
      found = true; // Check for name
      for (int k = 0; k < 6; k++) {
         switch(k) {
            case 0: { lastName = data[i][k].substring(0, data[i][k]. indexOf(""));
            firstName = data[i][k].substring(data[i][k].indexOf("") + 1);
            break; }
            // Separate first and last name
            case 1: id = data[i][k]; break;
            case 2: homeform = data[i][k]; break;
            case 3: date = data[i][k]; break;
            case 4: time = data[i][k]; break;
            case 5: period = data[i][k]; break;
         } //end switch
      } // end Inner for
      } // end If )
   } // end outer for
    
   if (!found) System.out.println("No record found!\n\n");
    
   else {
      System.out.println("________________________________");
      System.out.println("|                                 	|");
      System.out.println("|Cedarbrae C.I.                        |");
      System.out.println("|-----------------------------------|");
      System.out.println("|Slip Type: SIGN IN "+ period +"    	|");
      System.out.println("|      	: "+ date +"  "+  time +"         |");
      System.out.println("|----------------------------------|");       	
      System.out.println("|Reason: LATE                     	|");
      System.out.println("|----------------------------------|");
      System.out.println("|Student No: "+ id +"               	|");
      System.out.println("|                                            |");
      String line = "|Last Name:" + lastName;
      
      int num = line.length() - 1;
      int space = 36 - num;
      for (int c = 0; c <= num+1; c++) {
         if (c == num + 1)
            for (int s = 0; s <= space; s++)
               System.out.print("");
         else
         System.out.print(line.charAt(c));
      }  // end for
      System.out.println("|");
      String line2 = "|First Name: " + firstName;
      int num2 = line2.length()-1;
      int space2 = 36 - num2;
      for (int c = 0; c <= num2+1; c++) {
         if (c == num2 + 1)
            for (int s = 0; s <= space2; s++)
               System.out.print("");
         else
         System.out.print(line2.charAt(c));
      } // end for
      System.out.println("|");
      System.out.println("|              	|");
      System.out.println("|Home Form: " + homeform+"             	       |");
      System.out.println("________________________________________|");
   } // end else
    
   } // end printSllp ] // end class Slip
}// end class slip