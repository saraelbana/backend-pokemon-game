package src;

// a water Pokemon that extends the basic properties and behaviour from Pokemon (Super class)
// most function are overridden
public class WaterPokemon extends Pokemon{
    WaterPokemon(String name, String foodName, String sound) {
        super.setName(name);
        super.setFood(foodName);
        super.setSound(sound);
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSound(String sound) {
        super.setSound(sound);
    }
    @Override
    public void setFood(String foodName) {
        super.setFood(foodName);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getFood() {
        return super.getFood();
    }

    @Override
    public String getSound() {
        return super.getSound();
    }

    @Override
    public String speak() {
        return super.speak();
    }

    @Override
    public void eats(int foodAmount) {
        super.eats(foodAmount);
    }

    //perform Rain dance
    public void rainDance(){}
}
