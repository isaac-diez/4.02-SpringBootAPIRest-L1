package cat.itacademy.s04.t02.n01.service;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.repository.FruitRepo;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Transactional
class FruitServiceTest {

    @Autowired
    private FruitService fruitService;

    @Autowired
    private FruitRepo fruitRepo;

    @Test
    void createFruit() {

        Fruit fruit = new Fruit();
        fruit.setName("apple");
        fruit.setWeight(10);

        Fruit savedFruit = fruitService.createFruit(fruit);

        Assertions.assertNotNull(savedFruit.getId(), "The saved fruit should have an auto-generated ID");
        Assertions.assertEquals("apple", savedFruit.getName());
        Assertions.assertEquals(10, savedFruit.getWeight());

        Optional<Fruit> found = fruitRepo.findById(savedFruit.getId());
        Assertions.assertTrue(found.isPresent(), "Fruit should exist in the DB");
        Assertions.assertEquals("apple", found.get().getName());
    }

    @Test
    void getAllFruits() {

    }

    @Test
    void getFruitById() {
    }

    @Test
    void updateFruit() {
    }

    @Test
    void deleteFruit() {
    }

    @Test
    void testDeleteFruit() {
    }
}