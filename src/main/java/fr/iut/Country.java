package fr.iut;

public enum Country
{
    France(1.2);

    private final Double taxToApply;

    private Country(Double taxToApply)
    {
        this.taxToApply = taxToApply;
    }

    public Double getTaxToApply()
    {
        return this.taxToApply;
    }
}
