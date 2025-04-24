package cat.itacademy.s04.t02.n01;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepo extends JpaRepository<Fruit, Integer> {
}
