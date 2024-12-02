/*
ID: jbsch161
LANG: JAVA
TASK: beads 
*/

import java.io.*;

public class beads {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("beads.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));

        int n = Integer.parseInt(f.readLine());
        String bead = f.readLine();
        
        f.close();

        bead = bead + bead;         
        int res = 0;

        for (int i = 1; i < 2*n; i++) {
            char act = bead.charAt(i);
            char ant = bead.charAt(i-1);
            int cont1 = contDer(act, i, bead, n);
            int cont2 = contIzq(ant, i-1, bead, n);
            res = Math.max(res, cont1+cont2);
        }
        if(res > n)
            res = n;

        out.println(res);

        out.close();
    }    
    public static int contDer(char act, int i, String bead, int n){
        int cont = 1;
        for (int j = i; j < 2*n-1; j++) {
            char sig = bead.charAt(j+1);
            if(act == 'w'){
                cont++;
                if(sig != 'w')
                    act = sig; 
            }else{
                if(act == sig || sig == 'w'){
                    cont++;
                }else{
                    break;
                }
            }
        }

        return cont;
    }
    public static int contIzq(char act, int i, String bead, int n){
        int cont = 1;
        for (int j = i; j > 0; j--) {
            char ant = bead.charAt(j-1);
            if(act == 'w'){
                cont++;
                if(ant != 'w')
                    act = ant; 
            }else{
                if(act == ant || ant == 'w'){
                    cont++;
                }else{
                    break;
                }
            }
        }

        return cont;
    }
}
