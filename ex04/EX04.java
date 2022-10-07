/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04;

/**
 *
 * @author user
 */
public class EX04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TVShow miraBug = new TVShow("Miraculous LadyBug", 106, 2015);
        TVShow atkOnTan = new TVShow("Attack on Titan", 87, 2013);
        TVShow pacRimBlck = new TVShow("Pacific Rim: The Black", 14, 2021);
        
        Song song1 = new Song("Peanut Butter", "Jelly Sauce", 2021);
        Song song2 = new Song("Honey Battah", "Food Comp", 2013);
        
        song1.Play();
        
        Singer singer1 = new Singer("Delta V", song1);
        Singer singer2 = new Singer ("Gumball", song2);
       
        singer1.perfForAudi(12);
        singer1.perfForAudi(singer2, 5);
        singer1.changeFavSong(song2);
    }
    
}
