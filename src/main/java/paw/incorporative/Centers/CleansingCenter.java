package paw.incorporative.Centers;

import paw.incorporative.Animals.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CleansingCenter extends Center {
    public List<Animal> cleanseAnimals() {
        List<Animal> listForCleanse = new ArrayList<>();
        Iterator<Animal> animalIterator = getAnimalList().iterator();
        while (animalIterator.hasNext()) {
            listForCleanse.add(animalIterator.next());
            animalIterator.remove();
        }
        listForCleanse.forEach(animal -> animal.setCleansingStatus(true));
        return listForCleanse;
    }

}
