package ru.test.cafe.cafedemo.service.coffeGrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.test.cafe.cafedemo.model.CoffeeGrade;
import ru.test.cafe.cafedemo.repository.CoffeeGradeRepository;

import java.util.List;


@Service
public class CafeGradeServiceImpl implements CafeGradeService {
    @Autowired
    private CoffeeGradeRepository coffeeGradeRepository;

    @Override
    public List<CoffeeGrade> list() {
        return coffeeGradeRepository.findAll();
    }
}
