package org.advent.day1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class TestElfShould {
    @Test
    void have_zero_total_calories_when_created() {
        Elf elf = new Elf();
        assertThat(elf.getTotalCalories(), equalTo(0));
    }

    @Test
    void have_1000_total_calories_after_adding_1000() {
        Elf elf = new Elf();
        elf.addCalories(1000);
        assertThat(elf.getTotalCalories(), equalTo(1000));
    }

    @Test
    void compare_return_positive_value_for_elf_with_more_total_calories() {
        Elf bigElf = new Elf();
        bigElf.addCalories(5000);
        Elf smallElf = new Elf();
        smallElf.addCalories(3000);
        assertThat(bigElf.compareTo(smallElf), greaterThan(0));
    }

    @Test
    void compare_zero_for_equal_elf() {
        Elf elf = new Elf();
        elf.addCalories(5000);
        assertThat(elf.compareTo(elf), equalTo(0));
    }
    @Test
    void compare_return_negative_value_for_elf_with_less_total_calories() {
        Elf bigElf = new Elf();
        bigElf.addCalories(5000);
        Elf smallElf = new Elf();
        smallElf.addCalories(3000);
        assertThat(smallElf.compareTo(bigElf), lessThan(0));
    }

    @Test
    void elf1_should_carry_6000_calories() {
        Elf elf1 = new Elf();
        elf1.addCalories(1000);
        elf1.addCalories(2000);
        elf1.addCalories(3000);
        assertThat(elf1.getTotalCalories(), equalTo(6000));
    }

    @Test
    void elf2_should_carry_4000_calories() {
        Elf elf2 = new Elf();
        elf2.addCalories(4000);
        assertThat(elf2.getTotalCalories(), equalTo(4000));
    }

    @Test
    void elf3_should_carry_11000_calories() {
        Elf elf3 = new Elf();
        elf3.addCalories(5000);
        elf3.addCalories(6000);
        assertThat(elf3.getTotalCalories(), equalTo(11000));
    }
}