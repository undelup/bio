package chapter4.lcs;

import junit.framework.TestCase;

/**
 * Created by mihai.isaroiu on 7/23/15.
 */
public class BacktrackTest extends TestCase {

    public void testCompute() throws Exception {
        System.out.println(Backtrack.compute("AACCTTGG", "ACACTGTGA"));

    }

    public void testComputeExtraDataset() throws Exception {
        System.out.println(Backtrack.compute("ACCGTCTTAGCGATCAACACATTTAACAACGCGCCGCACCCCCCGTCAAACGAGCTTTTGGGCTCTTGTCCTTTTACAAGCTTCACGACGCATACAGCCTTGATCAACGGTTTGATCTGTCTCCCTTCAGCTGGCTTTAAAGGACATACATATGAAGGCCTTAATAAGGTCCGGGAACTCCACATATTCGGTACTGGGCAAACCCCATGAACCACCTCAACATGAAGAGTCCGAGGACTCTCACGATCCACCAATGCAGATCGGAACTGTGCGATCGCGTAATGAGCCGAGTACTTGGTTTGTGTTTAGGTTATGGGGGCCGGGAGCCGGTTCAATATAAGGAAGTAGTTGCAGATTAGTTGTTGCGAACGGTCATAAATTTGATGGGTAAACGTGAACTTAACAAACCGTGATAGCTAATCCTATGCATCCCTTACGTGGATCGACTCGAGTACCCAGGTGAACCGACTACTTGATAACCGGAAATCGCGGTATAAAAGCGCTCACGGTCAGGAGATATACCTCCAAGCAGTAGTCTTTCTGAGCCTAGAGTAGTAAATTACAGGGACGATGTCTTTTACCGAGGCAACATTTTATTGAGAATCACATGAGGCACAGGTAAAGGCGACATCACGATCGAGATCAACCCCTACTTGTTCAAAACATTGAGAACCAGCTCTGTTTTGGAACCTAGAAAGATAACGCATCCGCTTGATATTCCACGGCTTGTCCCTCTTGTGCGGTCCATCTATCGGAGTTTCCTCCGATACGACCCGCAATGTTTCCAGGCGTACGGTACTTTATGAATACACTCGCGCTGTAACCTGTTATGTGAAACACACACGACAGAGCTTCGCGTGGGCCCAGCGACCCGGTAATACTACATCACCGCACACGACCTCGAGCAGTCTTTGCCGGCGTCCGTAAGTAGTCTAAAGTTGTGTTGATGCTTGGGGTTAAAGCTAAATCGTCCGCAGAATACGACTCTCATCCCAAT",
                "TGATGCTTGGGGTTAAAGCTAAATCGTCCGCAGAATACGACTCTCATCCCAATACCCGCACGCGCTTTGGTCTAGATTCTAGCTCCAACTTGCCTGCTAGATACTCTGTTAAAAGATGGTTTTACAACCCCCTCCTCTGTCCCTGGGGTATTATATAATACGTCGGATAGTCAGGTACAAATACAAGTGGGTGGGAATACTTTTCCTCGGATCCTAGACCACGGATTACTGCGTGGTTGACAAGAGTCGGCCCGGAGGGAAACGTGAAGGTTAGTGCAATTAAAGTCTCTAATGTGAAGCCTCCGCGAAGCGAGGAGTTTCTGAGATCGAGTACTATTTAGAGTTCGAAATCACGGCTTAACCTCACTGCCACGCATAACTTGCCGGCAATCCAGTTTTGCAACGATACTTAATTTGTGCAGCTCATCTTTGCTGTCCAGAAATAGAGCTAGTCGATCTCATCTTGCGGGTAGCCAGAAGTCCTACCGTCTCCTCCATGTAGCTTAAAAATTTCGGTGAGGATCAAAAATGATAAACGTGACAGGTAAGCTCCTACGTCTATCCTATGACCCCCGCGGCAGAATAGGTTGGTAGTGTTAGTGCGTGAGCTGGTAGAATAGAGCACACTTAGGGAAACGGGAACCGTTATGTAGGGCTGCGACACACAAAAAAGTGTTCGTTGGTAAGCTGCCTCTCCACTAAACAGGATTTCTCTGGATGATCCCATCGAAGCAAGTTACGCACCACGCCGAGGCGGACCCTGGTACTAGCTGCCCCCCCCTTTATGGGGCGCTCGTACATCAAGATGATCGCGGACTCAACCTGATTACGAGTTGTCCAAGTAGTCCAGGGTAAGAGAAACTGGAGAGA"));

    }

    public void testComputeProblem() throws Exception {
        System.out.println(Backtrack.compute("TTAGGTCGTAATACCCTGCTTCAGAAAGGGCGATGCGTGCAATCGGAGGTAGAAAGTTGATTTCAACTTTAGATTACCGTATAATCAGGCCCTGCCCCCCACATTCTTTTCAGTGATTCGCGTCGGTAAGCGCACGCCGTAGTGCTTTTAGCCCAGAGTGTGCAGTGTAAGCTATCCTTATGTGTAAGCCTCATGCCGGGAGTGAACTCGTCTGCTGGGGGTTCCTTAGACATTGCACTACGCCGTACCTAAACTTAGGATCCCATTCGCCGCACGAGTAAGATACAGTACATCCGTTAAACTTCCGAGCCGCACTAAAGAGCCTACGATAATGGGGCTTCTGGTGAGCCCAACGCCAGTTGCCTCACGACAGCAACACCGCAGCCGGTAACCAATCTCTTTAGGTTGCCAGCTTCCGGAACTGCGTTTTACAGAGATAGCTCCGAAGTGCGGGTGAGAGTTTCTTCAGAATGAGCTATAGGGTATTGCATTCGGGCTCGGTAGATTACTTCATCGGGTGTCAGGGTTGCAGATACTAATGAGTCGCCGCTAATGGCGTATTAACTTCTATAACAGGGTCTGAGTACCTTAGCATCTAGCGAGGAGTGCACATATGCCATTGAAGGTTTCCGGGTTCACACATTAGAGAGAGAACAGGAGCAACGGATCCTCCCAGTCTGTCCACTGCAACTATCGTAAAAGTAGAGCTCTCGCGTAAGCGATCGCTTATTTTACAATGAAGTCTGGTAAGTTTCGGCTGCGGCGAATTAGAGGAAAACCGCTCGAGTCTCACGGCCGTCGTGCCTTGGCTTGCTTCCTCGTCTGCTACTCTAGCACATGGCCCCCGTATCGATTCGGCGTATCGGTACACCCCGCTGGT",
                "CTGGGGAACGTCCGTGGGCTCATTTAGGACGCTGCCATCGGGTCGATACTTCTACACCAACGATCCTAGTATTATCCCCAGCCGAGGTGGACGATAGTAGATACGATTGAAGCTAACTGCCATCCGACTAAAACGTCCGAAAGTAACCTGCACACCGGACAATAGATGCTCGGAGGATCAGGACTGTACGTCGTACGGATGTGTTGATATAGTTAGGGCCCTAGACTTCCGGTTTCTGATTCGCCCAGCATGGACTCGCTACCGATAAGCGGGGCTCACACGCTCATCATTGTGCGCCTAGGCTGCGGCGAAACCTGCGAGGGCCTAGTCCTACGTAGGGGAACTATAAAGAATCTGTCCCTCTCGTTGGCGAGCCGTATAATAATGGGGAGTGGTGCGCTGGCATTGGTGTAGATGTGGACTCCTGCGGAGTAGCGTGTGCAATAAGCCCGTGCCCGGCGCAGCTGTTAGTCTTGCCTTCTGCGTAACGAGGCTTGGTACGATATTAGTATGACGGAGTACCATTGACGACTATTTGCATCTCGCCGTCGGCTGGGGTAGAACTACGTATACTTGCCGTAGGGAACTAGACAATGGGAGCAGAGTAAGTCTATGGCACCGGGCCGCCCAAATCTGGTGTGGGATTCCCTAGCGCCCCACCCCGAAGGCATCTATCTACTTCGCCCCACACTATCCGAATGTATCATCATACTCTGCGCAAGTCCGGCCGAGAGCTCACTCTACTAACACGGGATCGGGCGTTCTTAACGTTCAGAATACGATTTAGTTCGTAAGCTTGGGCTCTCAATTGTAGAATTCCGTGGGATTAGTCAATCGTTCAGTGCAATGGGGTCAAGTCTTTCTATGGTGGCCATATGTCGGGTAGACGTCCCACATATTTTGGGGGTATGATTTAATGACTCAAGCTTATTCAGCACATATCACTATTAGAAAGACAGTCTAGTATATAACGTA"));

    }
}