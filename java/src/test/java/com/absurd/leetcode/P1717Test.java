package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * P1717Test
 *
 * @author Absurd
 * @version 2023/08/17 23:26
 **/
public class P1717Test {
    @Test
    public void maximumGain(){
        P1717 p1717 = new P1717();
        Assert.assertEquals(19,p1717.maximumGain("cdbcbbaaabab",4,5));
        Assert.assertEquals(20,p1717.maximumGain("aabbaaxybbaabb",5,4));
        String  test3 = "boababbbbkvaaaaaabbexeamamanbbbaabuaublbbababbbcbpbbbbahbbabahyaabbbuaoaqbbavbbbaaabaaaabaabbbbahababbbhajbeaaaabbfbobzabababbablbqaabafaaaiaabbahbtababoabuarzbdbbabhbaatagaaabobbsbdzadaiabfqmuwaabxaebabaaabaaefbaaxabjbabaoabarbzvbabboagbbaaaabbvabaabblabbohoqrtcbebmaaaaabfbunbpabbbbpafbbabaalatbabbabaabyabaihabtkblbmgabaibauzaefbnbabdaapaababbzaaabaaavyaaaaababaabgbababbabbabzdbjzbnbajbbbbkbbbybbcsaabbarmbbabbnbaaayabgbbvairzabagbbaagfaaxbbabzbavbbvabubabbwpaaebaaaknabavabababwabbbaabbbabbsbabeaaablayabhaqbqajkbaabbbwbabbbbbblbabbhaaakawbaobabbfbatbbaanbbpaatbabaababbabbbbbambababbbbobylbbcbbbjbaaabpewabanmapbjbmaabjbbaaabbzabbusbaabbaibaakaxaybaaxaaqydaaabaaaabqavaasdaafaqgbxaatacfbdbabaapaabbbbbpbgaaazahbabaxbpmsavaabpbeabjodaaabaebadabbaabyabaaasababjfbbaamaltbbbdabbbsbeabawhbsdbbzbokwbaba";
        Assert.assertEquals(313944,p1717.maximumGain(test3,1512,2120));
        String test4 = "abbmzgaabtaabsbabhaahabnaeabdbaababbbiabaavababtabwbababzbdabbaaabhbyabdvabbaabbquapaaaaqbbblbuaawlnbbaxaubbbbbpbabbbpaaaacbbaabaaaahbbcoyaauabanqaabpbbbgaawbhabbbbaobsaaababbafbababbbbaaaqbabsbsmabbxqylbbbba";
        Assert.assertEquals(382920,p1717.maximumGain(test4,9421,8003));


    }
}
