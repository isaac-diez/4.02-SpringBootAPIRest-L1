package cat.itacademy.s04.t02.n01.service;

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
        return fruitRepo.findAll();
    }

    public Fruit getFruitById(int id) {
        return fruitRepo.findById(id).orElse(null);
    }

    public Fruit updateFruit(Fruit fruit){
//        fruit.setId(id);
        return fruitRepo.save(fruit);
    }

    public void deleteFruit(int id) {
        fruitRepo.deleteById(id);
    }

    public void deleteFruit(Fruit fruit) {
        fruitRepo.delete(fruit);
    }

}
