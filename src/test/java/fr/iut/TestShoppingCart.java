package fr.iut;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestShoppingCart
{
    @Test
    public void addItem()
    {
        final ShoppingCart shoppingCart = new ShoppingCart();
        final Item carrot = new Item("Carot", 2.5);

        shoppingCart.addItem(carrot, 1);

        Assert.assertEquals(shoppingCart.getContent(), new HashMap<Item, Integer>()
        {{
            put(carrot, 1);
        }});
    }

    @Test
    public void computePriceWithoutTaxes()
    {
        final ShoppingCart shoppingCart = new ShoppingCart();
        final Item carrot = new Item("Carot", 2.5);

        shoppingCart.addItem(carrot, 1);
        shoppingCart.addItem(new Item("Apple", 1), 25);
        shoppingCart.addItem(new Item("Bananas 1Kg", 5), 3);

        Assert.assertEquals(shoppingCart.getPriceWithoutTaxes(), 42.5, 0.0001);
    }

    @Test
    public void computePriceWithTaxes()
    {
        final ShoppingCart shoppingCart = new ShoppingCart();
        final Item carrot = new Item("Carot", 2.5);

        shoppingCart.addItem(carrot, 1);
        shoppingCart.addItem(new Item("Apple", 1), 25);
        shoppingCart.addItem(new Item("Bananas 1Kg", 5), 3);

        Assert.assertEquals(shoppingCart.getPriceWithTaxes(Country.FR), 51, 0.0001);
        Assert.assertEquals(shoppingCart.getPriceWithTaxes(Country.DE), 51, 0.0001);
    }
}
