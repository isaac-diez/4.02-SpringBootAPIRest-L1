package cat.itacademy.s04.t02.n01.service;

import cat.itacademy.s04.t02.n01.exception.EmptyFruitListException;
import cat.itacademy.s04.t02.n01.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.repository.FruitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {

    @Autowired
    private FruitRepo fruitRepo;

    public Fruit createFruit(Fruit fruit){
        return fruitRepo.save(fruit);
    }

    public List<Fruit> getAllFruits() {
        List<Fruit> allFruits = fruitRepo.findAll();
        if (allFruits.isEmpty())
            throw new EmptyFruitListException("No fruits in the DB.");
        return fruitRepo.findAll();
    }

    public Fruit getFruitById(int id) {
        return fruitRepo.findById(id)
                .orElseThrow(() -> new EmptyFruitListException("Fruit not found with id: " + id));
    }

    public Fruit updateFruitByName(Fruit fruit){
        return fruitRepo.save(fruit);
    }

    public void deleteFruit(int id) {

        List<Fruit> allFruits = getAllFruits();
        if (allFruits.size()<id)
            throw new FruitNotFoundException("Fruit not found with id: " + id);
        fruitRepo.deleteById(id);

    }

    public void deleteFruit(Fruit fruit) {
        List<Fruit> allFruits = fruitRepo.findAll();
        for (Fruit foundFruit : allFruits) {
            if (foundFruit.getName().equals(fruit.getName())) {
                fruitRepo.delete(fruit);
            } else {
                throw new FruitNotFoundException("Fruit not found with name: " + fruit.getName());
            }
        }


    }

}
