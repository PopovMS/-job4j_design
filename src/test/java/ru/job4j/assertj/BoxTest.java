package ru.job4j.assertj;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class BoxTest {

    @Test
    void isThisSphere() {
        Box box = new Box(0, 10);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Sphere")
                        .isNotEmpty();
    }

    @Test
    void isThisUnknown() {
        Box box = new Box(9, 10);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Unknown object")
                .isNotEmpty();
    }

    @Test
    void getNumberOfVerticesTest() {
        Box box = new Box(4, 10);
        int numb = box.getNumberOfVertices();
        assertThat(numb).isEqualTo(4)
                .isGreaterThan(-1);
    }

    @Test
    void isExistTrueTest() {
        Box box = new Box(4, 10);
        boolean rsl = box.isExist();
        assertThat(rsl).isTrue();
    }

    @Test
    void isExistFalseTest() {
        Box box = new Box(5, 10);
        boolean rsl = box.isExist();
        assertThat(rsl).isFalse();
    }

    @Test
    void getAreaTest() {
        Box box = new Box(8, 8);
        double rsl = box.getArea();
        assertThat(rsl).isEqualTo(384.0d)
                .isNotZero();
    }

    @Test
    void getAreaTest2() {
        Box box = new Box(0, 2);
        double rsl = box.getArea();
        assertThat(rsl).isEqualTo(50.0d, withPrecision(0.3d))
                .isNotZero();
    }
}