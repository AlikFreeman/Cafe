package ru.test.cafe.cafedemo.service.coffeGrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.test.cafe.cafedemo.model.Orders;
import ru.test.cafe.cafedemo.repository.OrdersRepository;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;

    public List<Orders> list() {
        return ordersRepository.findAll();
    }
}
