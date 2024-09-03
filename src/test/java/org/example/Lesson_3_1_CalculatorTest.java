package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Lesson_3_1_CalculatorTest {

    @BeforeAll
    public static void BeforeAll(){
        System.out.println("Smoke-сообщение начала автотестирования");
    }

    @BeforeEach
    public void BeforeEach(){
        System.out.println("Smoke-сообщение начала теста");
    }

    @AfterAll
    public static void AfterAll(){
        System.out.println("Smoke-сообщение окончания автотестирования");
    }

    @AfterEach
    public void AfterEach(){
        System.out.println("Smoke-сообщение конца теста");
    }

    @Test
    @DisplayName("Проверка сложения")
    @Timeout(10)
    void sum() {

        Lesson_3_1_Calculator Calc = new Lesson_3_1_Calculator();
        int a = -10;
        int b = 10;
        int result = Calc.sum(a, b);
        Assertions.assertEquals(0, result);
    }

    @Test
    @Timeout(10)
    @DisplayName("Проверка вычитания")
    void sub() {

        Lesson_3_1_Calculator Calc = new Lesson_3_1_Calculator();
        int a = 10;
        int b = -10;
        int result = Calc.sub(a, b);
        Assertions.assertEquals(20, result);

    }

    @Test
    @Timeout(10)
    @DisplayName("Проверка умножения")
    void mult() {

        Lesson_3_1_Calculator Calc = new Lesson_3_1_Calculator();
        int a = -10;
        int b = 10;
        int result = Calc.mult(a, b);
        Assertions.assertEquals(-100, result);

    }

    @Test
    @Timeout(10)
    @DisplayName("Проверка деления")
    void div() {

        Lesson_3_1_Calculator Calc = new Lesson_3_1_Calculator();
        int a = -10;
        int b = 10;
        int result = Calc.div(a, b);
        Assertions.assertEquals(-1, result);

    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаемый результат {2}")
    @CsvSource({"1, 1, 2", "2, -2, 0", "0, 0, 0", "-1, -1, -2", "1, 1, 3"})
    @DisplayName("Параметризованные тесты сложения")
    void sum2(int a, int b, int expectedResult) {

        Lesson_3_1_Calculator Calc = new Lesson_3_1_Calculator();
        int result = Calc.sum(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @RepeatedTest(10)
    @DisplayName("Повторяющаяся проверка сложения")
    @Timeout(10)
    void sum3() {

        Lesson_3_1_Calculator Calc = new Lesson_3_1_Calculator();
        int a = -10;
        int b = 10;
        int result = Calc.sum(a, b);
        Assertions.assertEquals(0, result);
    }

}