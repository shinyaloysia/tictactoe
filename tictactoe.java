import java.util.*;
class tictactoe{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String[][] g=new String[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                g[i][j]=" ";
            }
        }
        
        String player="X";
        String result="false";
        //int flag=0;
        int moves=0;
        while(moves<9){
            moves+=1;
            print(g);
            //flag=0;
            System.out.println(player +"'s turn to play");
            boolean f=play(g,player);
            if(f==true){
                print(g);
                System.out.println("\nWINNER IS......... "+player);
                
                result="true";
                break;
            }
            player=(player.equals("X")?"O":"X");
            }
            if(result=="false"){
                System.out.println("MATCH DRAW");
            }
            s.close();
    
        }
        
    
    
        public static boolean play(String[][] g, String p) {
            int flag = 0;
            Scanner sc = new Scanner(System.in);
            int i=0, j=0;
        
            while (flag == 0) {
                System.out.println("Enter i (0, 1, or 2): ");
                if (sc.hasNextInt()) {
                    i = sc.nextInt();
                    if (i < 0 || i > 2) {
                        System.out.println("Invalid input. Please enter a valid integer for i (0, 1, or 2).");
                        continue; 
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid integer for i.");
                    sc.next(); 
                    continue; 
                }
        
                System.out.println("Enter j (0, 1, or 2): ");
                if (sc.hasNextInt()) {
                    j = sc.nextInt();
                    if (j < 0 || j > 2) {
                        System.out.println("Invalid input. Please enter a valid integer for j (0, 1, or 2).");
                        continue; 
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid integer for j.");
                    sc.next(); 
                    continue; 
                }
        
                if (g[i][j].equals(" ")) {
                    g[i][j] = p;
                    flag = 1;
                } else {
                    System.out.println("Invalid move\nEnter a valid position.");
                }
            }
        
            boolean b = res(g, i, j, p);
            return b;
        }
        
    public static boolean res(String[][] g,int i,int j,String p){
        if(g[i][0].equals(p) && g[i][1].equals(p) && g[i][2].equals(p)){
            return true;
        }
        if((g[0][j].equals(p)) && (g[1][j].equals(p)) && g[2][j].equals(p)){
            return true;
        }
        if(g[0][0].equals(p) && g[1][1].equals(p) && g[2][2].equals(p)){
            return true;
        }
        if(g[0][2].equals(p) && g[1][1].equals(p) && g[2][0].equals(p)){
            return true;
        }
        
        //System.out.println("hi");
        return false;
    }

    public static void print(String g[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(g[i][j]+"|");
            }
            System.out.println("\n");
        }
    }
}
