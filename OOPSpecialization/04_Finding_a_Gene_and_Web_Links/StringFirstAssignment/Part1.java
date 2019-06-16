/**
 * Write a description of Part1 here.
 *
 * @author RK
 * @version 1.0
 */

import edu.duke.*;
public class Part1 {
    public String findSimpleGene (String dna) {
      int startCodon = dna.indexOf("ATG");
      int stopCodon = dna.indexOf("TAA",startCodon+3);
      if ( startCodon ==-1){
          return "";
      }
      if (stopCodon == -1){
          return "";
      }
      return dna.substring(startCodon,stopCodon+3);
    }

    public static void main (String[] args){
        Part1 geneFinder = new Part1();
        String dna = "TTTATGZZZZZZTAA";
        System.out.println("Gene found: " + geneFinder.findSimpleGene(dna));
    }
}
