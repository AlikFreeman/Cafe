package ru.test.cafe.cafedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.test.cafe.cafedemo.model.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
