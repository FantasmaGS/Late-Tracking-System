import java.awt.*;
//This is Optional?
public class SubMenus extends Frame {
   public SubMenus() { // constructor
      super("SUB-MENUS");
      resize(200, 200);
      makeMenus();
      show();
   }
   private void makeMenus() {
      MenuBar mb = new MenuBar(); // Instantiate menubar
      Menu mi = new Menu("Info"); // Get new menu - Info
      Menu ms = new Menu ("Sort"); // Creata Sort as a menu liam
      ms.add(new MenuItem("Phones")); // submenu inside Sort
      ms.add(new MenuItem("Names")); // submenu Inside Sort
      mi.add(ms); // add Sort menu Inside Info
      mi.add(new MenuItem("Quit")); //I Add Quit menu Item
      Menu mf = new Menu("Find"); //I get new menu- Data
      mf.add(new MenuItem("Clients")); // menu item
      mf.add(new MenuItem("DVDs")); // menu item
      mb.add(mi); // Add Info to menubar mb.add(mf); // Add Find to menubar
      setMenuBar(mb); // show menubar
   }    
   public boolean action (Event evt, Object obj) {
      if(evt.target instanceof MenuItem) {
         String label = (String) obj;
         if (label.equals("Quit"))
            System.exit(0);
         else if (label.equals ("Phones" ))
            System.out.println( "Phone checked !");
         else if ( label.equals("Names") )
            System.out.println( "Client names here!");
         else if ( label.equals("Clients") )
            System.out.println( "CIlents here|");
         else if ( label.equals("DVDs") )
            System.out. println( "DVDs here!" );
      }
      return true;
   }      
   public static void main() {
      new SubMenus();
   }      
}