package src;

public class FirePokemon extends Pokemon {

    FirePokemon(String name, String foodName, String sound) {
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
    public void flameThrower(){}
}
