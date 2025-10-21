package hanoitower;
import java.util.ArrayList;

public class HanoiTower {

    public static void main(String args[]) {
        int numOfShells = Integer.parseInt(args[0]);
        moveShell(numOfShells, 'A', 'C', 'B');
    }

    public static void moveShell(int n, char from, char to, char aux) {

        if (n == 0) {
            return;
        }
        moveShell(n - 1, from, aux, to);

        System.out.println("Move shell " + n + " from " + from + " to " + to);
        
        moveShell(n - 1, aux, to, from);
    }





    // public static void main(String args[]) {
    //     int numShells = Integer.parseInt(args[0]);
    //     ArrayList<Integer> peg1 = setup(numShells);
    //     ArrayList<Integer> peg2 = new ArrayList<Integer>();        
    //     ArrayList<Integer> peg3 = new ArrayList<Integer>();

    //     int removedShell = 0;
    //     ArrayList<Integer> end = peg1;
    //     while (peg3 != end) {
    //         removedShell = peg1.remove(0);
    //         if (ruleCheck(peg2, removedShell)){
    //             peg2.add(removedShell);
    //         } else {
    //             break;
    //         }    
            
    //         removedShell = peg1.remove(0);
    //         if (ruleCheck(peg3, removedShell)){
    //             peg3.add(removedShell);
    //         } else {
    //             break;
    //         }  

    //         removedShell = peg2.remove(0);
    //         if (ruleCheck(peg3, removedShell)){
    //             peg3.add(removedShell);
    //         } else {
    //             break;
    //         }

    //     }

    //     if (peg3 != end){
    //         System.out.println("That move can't be made.");
    //     }
    //     System.out.println(peg1);
    //     System.out.println(peg2);
    //     System.out.println(peg3);

    // }
    // public static ArrayList<Integer> setup(int numOfShells) {
    //     ArrayList<Integer> peg = new ArrayList<Integer>();
    //     for (int i = 0; i < numOfShells; i++) {
    //         peg.add(i + 1);
    //     }
    //     return peg;
    // }
    // public static boolean ruleCheck(ArrayList<Integer> peg, int shell) {
    //     if (peg.size() > 0 && shell > peg.get(0)) {
    //         return false;
    //     }
    //     else {
    //         return true;
    //     }
    // }
}
