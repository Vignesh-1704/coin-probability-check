package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;



import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProbabilityTest {

    @Nested
    class Requirement1 {
        @Test
        void toCheckProbabilityOfHeadIsEqualToProbabilityOfTail() {
            Probability headsProbability = new Probability(0.5);
            Probability tailsProbability = new Probability(0.5);
            assertThat(headsProbability, is(equalTo(tailsProbability)));
        }

        @Test
        void toCheckProbabilityOfHeadIsEqualToProbabilityGetting1InADiceRoll() {
            Probability headsProbability = new Probability(0.5);
            Probability tailsProbability = new Probability(0.16);
            assertThat(headsProbability, is(not(equalTo(tailsProbability))));
        }

        @Test
        void toCheckProbabilityOfHeadIsEqualToNull() {
            Probability headsProbability = new Probability(0.5);
            assertThat(headsProbability, is(not(equalTo(null))));
        }

        @Test
        void toCheckProbabilityOfHeadIsEqualToPrimitiveDataType() {
            Probability headsProbability = new Probability(0.5);
            double tailProbability = 0.5;
            assertThat(headsProbability, is(not(equalTo(tailProbability))));
        }
    }

    @Nested
    class Requirement2
    {
        @Test
        void toCheckProbabilityOfTwoEventsOccurringTogether()
        {
            Probability firstEventProbability = new Probability(0.16);
            Probability secondEventProbability = new Probability(0.16);
            assertThat(firstEventProbability.multiply(secondEventProbability),is(equalTo(0.0256)));
        }

        @Test
        void toCheckProbabilityOfTwoEventsNotOccurringTogether()
        {
            Probability firstEventProbability = new Probability(0.16);
            Probability secondEventProbability = new Probability(0.35);
            double expectedValue = 0.0123;
            assertThat(firstEventProbability.multiply(secondEventProbability),is(not(equalTo(expectedValue))));
        }

        @Test
        void toCheckProbabilityOfTwoCertainEvents()
        {
            Probability certainEventOne = new Probability(1);
            Probability certainEventTwo = new Probability(1);
            double expectedValue = 1.0;
            assertThat(certainEventOne.multiply(certainEventTwo),is(equalTo(expectedValue)));
        }

    }

}
