package mattern.william;

/**
 * Created by williammattern on 1/18/17.
 */
public class SuperHuman extends Human {

    private String allegiance;
    private String superPower;
    private String superHeroName;

    public void getAllegiance(){
        System.out.println(allegiance);
    }

    public void getSuperPower(){
        System.out.println(superPower);
    }

    public void getSuperHeroName(){
        System.out.println(superHeroName);
    }

    public void setAllegiance(String allegiance){
        this.allegiance = allegiance;
    }

    public void setSuperPower(String superPower){
        this.superPower = superPower;
    }

    public void setSuperHeroName(String superHeroName){
        this.superHeroName = superHeroName;
    }
}
