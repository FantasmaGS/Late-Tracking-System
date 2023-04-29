import java.awt.*;
import javax.swing.JFrame;//This can make the "X" button work, (close the window function)

public class LTS extends JFrame {
   static String fileName = "records.txt";             // fileNAme = "records.txt"
   final int MAX = 20;                    // Set MAX number of records
   String rows [] = new String[MAX];      // Store max 20 records
   String info[][] = new String[MAX][6];  // Store records in 2d array
   ReadData rd = new ReadData();          // Instantiate the class ReadData
   Records re = new Records();           	// Instantiate the class Records
   Sorter s = new Sorter();
   SearchInput si = new SearchInput();
   SearchInput2 si2 = new SearchInput2();
   KeyInput ki = new KeyInput();
   NewRecord nr = new NewRecord();
   Output ou = new Output();
   
   String nameArray [ ] = new String[10];
   
   public LTS() {//constructor to prepare window size and menubar
      super("My Window");
      resize(700, 500);//Window Size
      makeMenus();
      show();
   }//end constructor

   public void paint(Graphics g) {//insert text and geometric shapes
      g.setFont(new Font("Helvetica", Font.BOLD, 24)); // Change font, size
      g.setColor(Color.blue);// Change Color
      g.drawString("Late Tracking System.", 160, 100);//Print Text
      g.drawRect(50,50,100,50);  //Draw a rectabkge - x,y,width,height
      g.drawOval(100,100,80,80); //Draw a oval - x,x,width,height
      
      /* inserting image/gif
      Toolkit tk = Toolkit.getDefaultToolkit();
      Image img = tk.getImage("loge.gif"); //get your own logo.gif
      g.drawImage(img, 50, 30, this);
      */
    
   }//end paint

   private void makeMenus() { // instantiate menubar
      MenuBar mb = new MenuBar();
      
      Menu data = new Menu ("Data"); //Create menu1
      data.add(new MenuItem("Load"));
      data.addSeparator();//It adds a line between buttons
      data.add(new MenuItem("List"));
      data.addSeparator();
      data.add(new MenuItem("New"));
      data.addSeparator();
      data.add(new MenuItem("Delete"));
      data.addSeparator();
      data.add(new MenuItem("Print"));
      data.addSeparator();
      data.add(new MenuItem("Quit"));
       
      Menu sort = new Menu ("Sort"); //Create menu2
      sort.add(new MenuItem("Names"));
      sort.addSeparator();
      sort.add(new MenuItem("IDs"));
      sort.addSeparator();
      sort.add(new MenuItem("Homeforms"));
      sort.addSeparator();
      sort.add(new MenuItem("Periods"));
       
      Menu find = new Menu ("Find"); //Create menu3
      find.add(new MenuItem("By Names"));
      find.addSeparator();
      find.add(new MenuItem("By IDs"));
      find.addSeparator();
      find.add(new MenuItem("By Homeforms"));
      find.addSeparator();
      find.add(new MenuItem("By Periods"));
       
      Menu info = new Menu ("Info"); //Create menu4
      info.add(new MenuItem("Help"));
       
      mb.add(data); //add Data to menubar
      mb.add(sort); //add Sort to menubar
      mb.add(find); //add Find to menubar
      mb.add(info); //add Info to menubar
      setMenuBar(mb);
   } // end makeMenus

   public boolean action(Event evt, Object obj) { // Activate menuitem
      if(evt.target instanceof MenuItem) {
         String label = (String) obj;
      //Under Data in the Menubar
      if(label.equals("Quit"))
         System.exit(0); //quit window
      else if (label.equals("Load")) //Activate menuitem
         {
  	         System.out.println("Load coming up!"); //menuItem1_1 works
            rows = rd.readFile(fileName, MAX);
            info = re.getRecords(rows); 
         }
      else if (label.equals("List"))
         {
            System.out.println("List coming up!");
            rows = rd.readFile(fileName, 10);
            info = re.getRecords(rows); 
            for (int i = 0; i < info.length; i++){
               for (int j = 0; j < 6; j++){
                  System.out.println(info[i][j]);
               }
            System.out.println(" ");
            }
         }
      else if (label.equals("New"))
         {
            System.out.println("New coming up!");
            String newData = KeyInput.entries();
            NewRecord.addRecord("records.txt", newData);
         }
      else if (label.equals("Delete"))
         System.out.println("Delete coming up!");
      else if (label.equals("Print"))
         {
            System.out.println("Print coming up!");
            ou.keyIn(info);
         }
         
      //Under Sort in the Menubar
      else if (label.equals("Names"))
         {
            System.out.println("Names coming up!");
            info = s.sort(info, 0);
         }
      else if (label.equals("IDs"))
         {
            System.out.println("IDs coming up!");
            info = s.sort(info, 1);
         }
      else if (label.equals("Homeforms"))
         {
            System.out.println("Homeforms coming up!");
            info = s.sort(info, 2);
         }
      else if (label.equals("Periods"))
         {
            System.out.println("Periods coming up!");
            info = s.sort(info, 5);
         }
      
      //Under Find in the Menubar
      else if (label.equals("By Names"))
         {
            System.out.println("By Names coming up!");
            si.keyInput(fileName, info, 0); // Key in input and confuct a search
            si2.keyInput(fileName, info, 0);
         }
      else if (label.equals("By IDs"))
         {
            System.out.println("By IDs coming up!");
            si.keyInput(fileName, info, 1);
            si2.keyInput(fileName, info, 1);
         }
      else if (label.equals("By Homeforms"))
         {
            System.out.println("By Homeforms coming up!");
            si.keyInput(fileName, info, 3);
            si2.keyInput(fileName, info, 3);          
         }
      else if (label.equals("By Periods"))
         {
            System.out.println("By Periods coming up!");
            si.keyInput(fileName, info, 5);
            si2.keyInput(fileName, info, 5);
         }
      
      //Under Info in the Menubar
      else if (label.equals("Help"))
         {
            System.out.println("Help coming up!");
            System.out.println("\n(1) Select Load from Data menu first.");
        	   System.out.println("(2) Select any menu Item.");
        	   System.out.println("(3) Select List from Data to view results.\n");
         }
      }
      return true;
   } // end action

   public static void main (String str[]) {
      new LTS(); // Instantiate LTS class
      fileName = "records.txt";                                    //Sussy Baka
   } //  end main
} // end class