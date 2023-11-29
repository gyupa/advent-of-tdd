package org.advent.day1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestElfShould {
    @Test
    void have_zero_total_calories_when_created() {
        Elf elf = new Elf();
        assertThat(elf.getTotalCalories(), equalTo(0));
    }

    @Test
    void have_1000_total_calories_after_adding_1000() {
        Elf elf = createElfWithCalories(1000);
        assertThat(elf.getTotalCalories(), equalTo(1000));
    }

    @Test
    void compare_return_positive_value_for_elf_with_more_total_calories() {
        Elf elf1 = createElfWithCalories(20);
        Elf elf2 = createElfWithCalories(10);
        assertThat(elf1.compareTo(elf2), greaterThan(0));
    }

    @Test
    void compare_zero_for_equal_elf() {
        Elf elf1 = createElfWithCalories(30);
        Elf elf2 = createElfWithCalories(30);
        assertThat(elf1.compareTo(elf2), equalTo(0));
    }

    @Test
    void compare_return_negative_value_for_elf_with_less_total_calories() {
        Elf elf1 = createElfWithCalories(30);
        Elf elf2 = createElfWithCalories(40);
        assertThat(elf1.compareTo(elf2), lessThan(0));
    }

    private static Elf createElfWithCalories(int calories) {
        Elf elf1 = new Elf();
        elf1.addCalories(calories);
        return elf1;
    }

}
