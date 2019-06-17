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

    // Five DNA strings:
    //  DNA with no “ATG”
    //  DNA with no “TAA”
    //  DNA with no “ATG” or “TAA”
    //  DNA with ATG, TAA and the substring between them is a multiple of 3 (a gene)
    //  DNA with ATG, TAA and the substring between them is not a multiple of 3.
    public void testSimpleGene() {
        String[] dnaArray = {"ZZZTAAZZZ", "ZZZATGZZZ", "ZZZ", "ZZZATGZTAAZZZ", "ZZZATGZZZTAA"};
        for (String dna : dnaArray) {
            System.out.println("Testing DNA string: " + dna);

            String res = findSimpleGene(dna);
            if (res == "") {
                System.out.println("Bummer! No gene is found..");
            } else System.out.println("DNA found: " + res);
        }
    }

    public static void main (String[] args){
        Part1 geneFinder = new Part1();
        String dna = "TTTATGZZZZZZTAA";
        System.out.println("Gene found: " + geneFinder.findSimpleGene(dna));
        geneFinder.testSimpleGene();
    }
}
