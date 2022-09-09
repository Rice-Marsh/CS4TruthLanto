/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01truthlanto;



/**
 *
 * @author TRUTH
 */
public class Ex01TruthLanto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name1 = "Miraculous Ladybug";
        String name2 = "Attack on Titan";
        String name3 = "Pacific Rim: The Black";
        
        int noEp1 = 106;
        int noEp2 = 87;
        int noEp3 = 14;
        
        int relYear1 = 2015;
        int relYear2 = 2013;
        int relYear3 = 2021;
        
        System.out.printf ("Television Show 1: \nTitle: %s \nNumber of Episodes : %d \nRelease Date : %d \n", name1, noEp1, relYear1);
        System.out.println ();
        System.out.printf ("Television Show 2: \nTitle: %s \nNumber of Episodes : %d \nRelease Date : %d \n", name2, noEp2, relYear2);
        System.out.println ();
        System.out.printf ("Television Show 3: \nTitle: %s \nNumber of Episodes : %d \nRelease Date : %d \n", name3, noEp3, relYear3);
       System.out.println ();
       
        int total_EPs = noEp1 + noEp2 + noEp3;
        boolean unarelYear = relYear1 == relYear2;
        boolean moreEps = noEp2 > noEp3;
       
        System.out.printf ("The total number of episodes in the shows is: %d \n", total_EPs);
        System.out.println ();
        System.out.printf ("Attack on Titan and Miraculous Ladybug was released on the same year: " + unarelYear + "\n");
        System.out.println ();
        System.out.printf ("Attack on Titan has more episodes than Pacific Rim: The Black: " + moreEps + "\n");
    }
    
}
