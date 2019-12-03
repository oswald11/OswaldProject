package snail.oswald.eckel.chapter6;

class Connection {
    int orderNum;
   Connection(int i){
       orderNum = i;
       System.out.println(orderNum + " Connection is here");
   }

   void printDetails(){
       System.out.println("orderNum = " + orderNum);
   }
}

public class ConnectionManager {
   private static Connection[] connections = new Connection[3];
   private static int usedConnections;

   private ConnectionManager(){
       usedConnections = 0;
   }

   private static ConnectionManager cm = new ConnectionManager();

   public static Connection getConnection(){
       if  (usedConnections < connections.length) {
           connections[usedConnections] = new Connection(usedConnections);
           return connections[usedConnections++];
       } else{
           System.out.println("No more Connections left");
           return null;
       }
   }

    public static void main(String[] argv) {
       for(int i = 0; i < 5; i++){
           Connection c = ConnectionManager.getConnection();
           if (c instanceof Connection) {
               c.printDetails();
           }
       }
    }
}

