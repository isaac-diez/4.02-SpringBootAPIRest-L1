package cat.itacademy.s04.t02.n01.controller;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitController {

    @Autowired
    private FruitService fruitService;

    @PostMapping("/add")
    public Fruit createFruit(@RequestBody Fruit fruit) {
        return fruitService.createFruit(fruit);
    }

    @GetMapping("getOne/{id}")
    public Fruit getFruitById(@PathVariable int id) {
        return fruitService.getFruitById(id);
    }

    @GetMapping("/getAll")
    public List<Fruit> getAllFruits() {
        return fruitService.getAllFruits();
    }

    @PutMapping("/update")
    public Fruit updateFruit(@RequestBody Fruit fruit) {
        return fruitService.updateFruit(fruit);
    }

    @DeleteMapping("delete/{id}")
    public void deleteFruitById(@PathVariable int id){
        fruitService.deleteFruit(id);
    }
}
