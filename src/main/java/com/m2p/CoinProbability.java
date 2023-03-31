package com.m2p;

public class CoinProbability {
    private final double tossProbability;

    public CoinProbability(double tossProbability) {
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
        CoinProbability that = (CoinProbability) object;
        return tossProbability == that.tossProbability;
    }

}
