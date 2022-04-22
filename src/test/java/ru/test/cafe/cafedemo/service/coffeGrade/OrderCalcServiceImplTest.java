package ru.test.cafe.cafedemo.service.coffeGrade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.test.cafe.cafedemo.dto.OrderPointDto;
import java.util.List;
import java.util.stream.Stream;

@SpringBootTest
class OrderCalcServiceImplTest {
    @Autowired
    private OrderCalcServiceImpl service;
    @ParameterizedTest
    @MethodSource("createTestData")
    void firstTest (List<OrderPointDto> orderPointDtos, Integer resultSum) {
        Integer results = service.calc(orderPointDtos);
        Assertions.assertEquals(results, resultSum);
    }
    private static Stream<Arguments> createTestData() {
        return Stream.of(Arguments.of(List.of(createOrderPointDto()), 6));
    }

    private static OrderPointDto createOrderPointDto() {
        OrderPointDto dto = new OrderPointDto();
        dto.setCoffeeGradeId(1);
        dto.setCupCounter(5);
        return dto;
    }

}