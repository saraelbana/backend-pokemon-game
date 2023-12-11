package src;

public class FireElectroPokemon extends Pokemon{
    private FirePokemon firePokemonCapabilities;
    private ElectricPokemon electricPokemonCapabilities;
    public FireElectroPokemon(String name, String foodName, String sound) {
        super(name, foodName, sound);
        firePokemonCapabilities = new FirePokemon(name,foodName,sound);
        electricPokemonCapabilities = new ElectricPokemon(name,foodName,sound);
    }

    @Override
    public String getSound() {
        return super.getSound();
    }

    @Override
    public String getFood() {
        return super.getFood();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setFood(String foodName) {
        super.setFood(foodName);
    }

    @Override
    public void setSound(String sound) {
        super.setSound(sound);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }


    public void eats(int electricFoodAmount , int fireFoodAmount) {
        firePokemonCapabilities.eats(electricFoodAmount);
        electricPokemonCapabilities.eats(fireFoodAmount);
    }
}
