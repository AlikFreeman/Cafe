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
public class OrderCalcServiceImp {
    @Value("${coffee.delivery}")
    private Integer delivery;
    @Value("${coffee.free.cup}")
    private Integer freeCup;
    @Value("${coffee.free.summ.delivery}")
    private Integer summDelivery;
    @Autowired
    private CoffeeGradeRepository coffeeGradeRepository;


    public HashMap<Integer, Integer> calc(List<OrderPointDto> orderPointDtos) {
        Integer fullPrice = 0;
        Integer possiblePrice = 0;
        List<CoffeeGrade> grades = coffeeGradeRepository.findAll();

        /**
         * Вынести в отдельный метод
         */
        HashMap<Integer, Integer> idPrice = new HashMap<>();
        for (CoffeeGrade coffeGrade : grades) {
            idPrice.put(coffeGrade.getId(), coffeGrade.getPrice());
        }

        for (OrderPointDto orderPointDto : orderPointDtos) {
            /**
             * Сумма заказа по сортам
             */
            int summCupPrice = orderPointDto.getCupCounter() * idPrice.get(orderPointDto.getCoffeeGradeId());
            /**
             * Сумма со скидкой по количеству кружек
             */
            int freeCupCounter = orderPointDto.getCupCounter() / freeCup;
            possiblePrice += (orderPointDto.getCupCounter() - freeCupCounter) * idPrice.get(orderPointDto.getCoffeeGradeId());
            fullPrice += possiblePrice - summCupPrice;
        }
        idPrice.put(possiblePrice, fullPrice);
        return idPrice;
        /**
         * Сумма заказа
         */

    }
}
