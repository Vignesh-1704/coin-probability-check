package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CoinProbabilityTest {

    @Nested
    class Requirement1 {
        @Test
        void toCheckProbabilityOfHeadIsEqualToProbabilityOfTail() {
            CoinProbability headsProbability = new CoinProbability(0.5);
            CoinProbability tailsProbability = new CoinProbability(0.5);
            assertThat(headsProbability, is(equalTo(tailsProbability)));
        }

        @Test
        void toCheckProbabilityOfHeadIsEqualToProbabilityGetting1InADiceRoll() {
            CoinProbability headsProbability = new CoinProbability(0.5);
            CoinProbability tailsProbability = new CoinProbability(0.16);
            assertThat(headsProbability, is(not(equalTo(tailsProbability))));
        }

        @Test
        void toCheckProbabilityOfHeadIsEqualToNull() {
            CoinProbability headsProbability = new CoinProbability(0.5);
            assertThat(headsProbability, is(not(equalTo(null))));
        }

        @Test
        void toCheckProbabilityOfHeadIsEqualToPrimitiveDataType() {
            CoinProbability headsProbability = new CoinProbability(0.5);
            double tailProbability = 0.5;
            assertThat(headsProbability, is(not(equalTo(tailProbability))));
        }
    }
}
