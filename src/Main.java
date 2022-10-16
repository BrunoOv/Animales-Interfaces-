import java.util.List;
import java.util.LinkedList;
import Animals.*;
public class Main {
    public static void main(String[] args){
        List<Animal> animals = new LinkedList<>();
        animals.add(new Aguila());
        animals.add(new Animal());
        animals.add(new Ave());
        animals.add(new Condor());
        animals.add(new Gato());
        animals.add(new Gorrion());
        animals.add(new Halcon());
        animals.add(new Mamifero());
        animals.add(new Pato());
        animals.add(new Perro());
        animals.add(new Pez());
        animals.add(new Raton());
        animals.add(new Salmon());
        animals.add(new Sardina());
        animals.add(new Tilapia());
        animals.add(new Tortuga());
        animals.add(new Trucha());
        for(Animal animal :animals){
            System.out.println(animal.toString());
        }
    }
}
