package ru.job4j.map;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Класс описывает модель данных пользователя.
 */
public class User {
    private String name;
    private int children;
    private Calendar birthday;
    /**
     * Конструктор класса
     * @param name поле name
     * @param children поле children
     * @param birthday поле дата рождения
     */
    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return children == user.children && Objects.equals(name, user.name) && Objects.equals(birthday, user.birthday);
    }
    /**
    @Override
    public int hashCode() {
        return Objects.hash(name, children, birthday);
    }
    */
}

