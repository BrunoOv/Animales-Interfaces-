package Animals;

public class Tortuga extends Animal implements AnimalQueCamina,AnimalQueNada {
    public String toString(){
        return "Tortuga";
    }
    @Override
    public void caminar() {

    }
    @Override
    public void nadar() {

    }
}
