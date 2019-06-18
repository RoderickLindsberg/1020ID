
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    
    private boolean validateDNA (String dna) {
        if (dna.length() % 3 == 0) {
            return true;
        } else return false;
    }

    private String findSimpleGene(String dna, String startCodon, String stopCodon) {
        // start codon is ATG
        // stop codon is TAA
        int pos;
        int indexStartCodon = dna.indexOf(startCodon);
        if (indexStartCodon == -1) {
            return "";
        }

        int indexStopCodon = dna.indexOf(stopCodon, indexStartCodon + 3);
        if (indexStopCodon == -1) {
            return "";
        }

        String gene = dna.substring(indexStartCodon, indexStopCodon + 3);
        if (!validateDNA(gene)) {
            return "";
        }

        return gene;
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

            // calling findSimpleGene() to get gene
            String res = findSimpleGene(dna, "ATG", "TAA");
            
            if (res == "") {
                System.out.println("Bummer! No gene is found..");
            } else System.out.println("DNA found: " + res);
        }
    }
}
