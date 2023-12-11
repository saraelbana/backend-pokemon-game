package src;

public class Main{
    public static void main(String[] args) {
        //I guess Pokemon game is not something I'm knowledgeable about :)

        ElectricPokemon pikatchu = new ElectricPokemon("Pikatchu","Thunderberry","Crackling Zap");
        WaterPokemon Squirtle = new WaterPokemon("Squirtle","Aqua Bubbles","Splish-Splash");
        GrassPokemon Bulbasaur = new GrassPokemon("Bulbasaur","Leafy Greenss","Rustling Leaves");
        FirePokemon Charmander = new FirePokemon("Charmander","Ember Berries","Crackle and Pop");
        FireElectroPokemon boltFlame = new FireElectroPokemon("boltFlame","bolt-flame-berries","donderstorm");
        pikatchu.eats(3);
        Squirtle.eats(3);
        Bulbasaur.eats(3);
        Charmander.eats(3);
        boltFlame.eats(2,4);
    }
}
