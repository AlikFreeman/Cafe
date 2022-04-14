package ru.test.cafe.cafedemo.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Component;
import ru.test.cafe.cafedemo.dto.OrderPointDto;
import ru.test.cafe.cafedemo.model.CoffeeGrade;
import ru.test.cafe.cafedemo.repository.CoffeeGradeRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Метод для расчета стоимости заказов
 */
@Component
public class OrderCalcUtil {
    @Value("${coffee.delivery}")
    private Integer delivery;
    @Value("${coffee.free.cup}")
    private Integer freeCup;
    @Value("${coffee.free.summ.delivery}")
    private Integer summDelivery;

    public Integer calc(List<OrderPointDto> orderPointDto) {
        Integer fullPrice = 0;
        Integer possiblePrice = 0;

        for () {
            int freeCupCounter = orderPointDto.cupCounter / freeCup;
            possiblePrice += (cupCounter - freeCupCounter) * coffeeGrade.getPrice();
            fullPrice += cupCounter * coffeeGrade.getPrice();
        }

    }
}
