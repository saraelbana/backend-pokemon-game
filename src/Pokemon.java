package src;

public class Pokemon {
    private String name;
    private String foodName;
    private String sound;
    private int hungryLevel = 0;
    public Pokemon(){

    }
    public Pokemon(String name, String foodName, String sound) {
        this.name = name;
        this.foodName = foodName;
        this.sound = sound;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String foodName) {
        this.foodName = foodName;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return foodName;
    }

    public String getSound() {
        return sound;
    }

    public void eats(int foodAmount){
        hungryLevel += foodAmount;
    }

    public String speak(){
        return sound;
    }


}
