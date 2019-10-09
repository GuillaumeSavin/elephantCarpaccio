package fr.iut;

public class Item
{
    private final String name;
    private final double price;

    public Item(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Double.compare(item.price, price) != 0) return false;

        return name != null ? name.equals(item.name) : item.name == null;
    }

    @Override
    public int hashCode()
    {
        int result;
        long temp;

        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));

        return result;
    }

    public Double getPrice()
    {
        return this.price;
    }
}
