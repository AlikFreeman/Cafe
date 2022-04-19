package ru.test.cafe.cafedemo.service.coffeGrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.test.cafe.cafedemo.dto.OrderPointDto;
import ru.test.cafe.cafedemo.model.CoffeeGrade;
import ru.test.cafe.cafedemo.repository.CoffeeGradeRepository;

import java.util.HashMap;
import java.util.List;

/**
 * Метод для расчета стоимости заказов
 */
@Component
public class OrderCalcServiceImpl {
    @Value("${coffee.delivery}")
    private Integer delivery;
    @Value("${coffee.free.cup}")
    private Integer freeCup;
    @Value("${coffee.free.summ.delivery}")
    private Integer summDelivery;
    @Autowired
    private CoffeeGradeRepository coffeeGradeRepository;

    /**
     * Сумма заказа за каждый сорт кофе с учетом скидки по количеству кружек
     */
    public Integer calc(List<OrderPointDto> orderPointDtos) {
        Integer fullPrice = 0;
        List<CoffeeGrade> grades = coffeeGradeRepository.findAll();
        HashMap<Integer, Integer> idPrice = idPrice(grades);

        for (OrderPointDto orderPointDto : orderPointDtos) {
            Integer possiblePrice = (orderPointDto.getCupCounter() - orderPointDto.getCupCounter() / freeCup) * idPrice.get(orderPointDto.getCoffeeGradeId());
            fullPrice += possiblePrice;
        }
        if (fullPrice < summDelivery) {
            fullPrice = fullPrice + delivery;
        }
        return fullPrice;
    }

    /**
     * Таблица цен по сортам кофе
     */
    private HashMap<Integer, Integer> idPrice(List<CoffeeGrade> grades) {
        HashMap<Integer, Integer> idPrice = new HashMap<>();
        for (CoffeeGrade coffeeGrade : grades) {
            idPrice.put(coffeeGrade.getId(), coffeeGrade.getPrice());
        }
        return idPrice;
    }
}
