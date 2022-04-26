package ru.test.cafe.cafedemo.service.coffeGrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.test.cafe.cafedemo.model.Order;
import ru.test.cafe.cafedemo.repository.OrderPointRepository;

import java.util.List;

@Service
public class OrderPointServiceImpl implements OrderPointService {
    @Autowired
    private OrderPointRepository orderPointRepository;

    public List<Order> list() {return orderPointRepository.findAll();

    }
}
