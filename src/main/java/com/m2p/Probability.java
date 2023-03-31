package com.m2p;

public class Probability {
    private final double tossProbability;

    public Probability(double tossProbability) {
        this.tossProbability = tossProbability;
    }

    @Override
    public boolean equals(Object object)
    {
        if(this == object)
        {
            return true;
        }
        if(object == null || object.getClass() != getClass())
        {
            return false;
        }
        Probability that = (Probability) object;
        return tossProbability == that.tossProbability;
    }

    public Object multiply(Probability secondEventProbability) {
        return tossProbability * secondEventProbability.tossProbability;
    }
}
