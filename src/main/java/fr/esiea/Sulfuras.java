package fr.esiea;

public class Sulfuras extends Item{
    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
    	System.out.println("Quality updated");
    }
}