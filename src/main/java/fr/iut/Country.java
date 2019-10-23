package fr.iut;

public enum Country
{
    FR(1.196),
    DE(1.19),
    DK(1.25),
    HR(1.25),
    IS(1.255),
    CH(1.08);

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
