package paw.incorporative.Centers;

import paw.incorporative.Animals.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CastrationCenter extends Center {
    public List<Animal> castrateAnimals() {
        List<Animal> listForCastrate = new ArrayList<>();
        Iterator<Animal> animalIterator = getAnimalList().iterator();
        while (animalIterator.hasNext()) {
            listForCastrate.add(animalIterator.next());
            animalIterator.remove();
        }
        listForCastrate.forEach(animal -> animal.setCastratingStatus(true));
        return listForCastrate;
    }
}
