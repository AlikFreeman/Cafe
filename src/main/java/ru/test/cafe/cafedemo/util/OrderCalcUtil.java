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
//        private final CoffeeGradeRepository coffeeGradeRepository;
//
//        public HashMap<Integer, Integer> calcPossiblePrice (HashMap < Integer, Integer > selectedItems){
//            Integer fullPrice = 0;
//            Integer possiblePrice = 0;
//            HashMap<Integer, Integer> possiblePricePromotion = new HashMap<>();
//            for (Map.Entry<Integer, Integer> entry : selectedItems.enrySet()) {
//                Integer gradeId = entry.getKey();
//                Integer cupCounter = entry.getValue();
//                int freeCupCounter = cupCounter / freeCup;
//                CoffeeGrade coffeeGrade = coffeeGradeRepository.findById(gradeId).orElseThrow(() -> new NotFoundException("{coffee grade not found by Id" + gradeId + "}"));
//                possiblePrice += (cupCounter - freeCupCounter) * coffeGrade.getPrice();
//            }
//            possiblePricePromotion.put(possiblePrice, fullPrice);
//            return possiblePricePromotion;
//        }
//    }

}
