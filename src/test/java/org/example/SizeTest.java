package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SizeTest {

    @org.junit.jupiter.api.Test
    void size5() {
        Van van1 = new Van(null,null,false);
        Van van2 = new Van(van1,null,true);
        Van van3 = new Van(van2,null,true);
        Van van4 = new Van(van3,null,false);
        Van van5 = new Van(van4,van1,false);
        van1.setPrevious(van5);
        van1.setNext(van2);
        van2.setNext(van3);
        van3.setNext(van4);
        van4.setNext(van5);
        Train train = new Train(van1,van2,van3,van4,van5);

        Assertions.assertEquals(5,train.size());
    }

    @Test
    void size20(){
        Van van1 = new Van(null,null,false);
        Van van2 = new Van(van1,null,false);
        Van van3 = new Van(van2,null,true);
        Van van4 = new Van(van3,null,false);
        Van van5 = new Van(van4,null,false);
        Van van6 = new Van(van5,null,true);
        Van van7 = new Van(van6,null,true);
        Van van8 = new Van(van7,null,false);
        Van van9 = new Van(van8,null,true);
        Van van10 = new Van(van9,null,false);
        Van van11 = new Van(van10,null,false);
        Van van12 = new Van(van11,null,false);
        Van van13 = new Van(van12,null,false);
        Van van14 = new Van(van13,null,false);
        Van van15 = new Van(van14,null,true);
        Van van16 = new Van(van15,null,false);
        Van van17 = new Van(van16,null,false);
        Van van18 = new Van(van17,null,true);
        Van van19 = new Van(van18,null,false);
        Van van20 = new Van(van19,van1,false);
        van1.setNext(van2);
        van1.setPrevious(van20);
        van2.setNext(van3);
        van3.setNext(van4);
        van4.setNext(van5);
        van5.setNext(van6);
        van6.setNext(van7);
        van7.setNext(van8);
        van8.setNext(van9);
        van9.setNext(van10);
        van10.setNext(van11);
        van11.setNext(van12);
        van12.setNext(van13);
        van13.setNext(van14);
        van14.setNext(van15);
        van15.setNext(van16);
        van16.setNext(van17);
        van17.setNext(van18);
        van18.setNext(van19);
        van19.setNext(van20);
        van20.setNext(van1);
        Train train = new Train(van1,van2,van3,van4,van5,van6,van7,van8,van9,van10,van11,van12,
        van13,van14,van15,van16,van17,van18,van19,van20);
        Assertions.assertEquals(20,train.size());
    }
}