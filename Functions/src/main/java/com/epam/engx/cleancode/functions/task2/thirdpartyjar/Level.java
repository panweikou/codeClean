package com.epam.engx.cleancode.functions.task2.thirdpartyjar;

import java.util.Objects;

public class Level {

    private String levelId;

    public Level(String s) {
        levelId = s;
    }

    public static Level getDefaultLevel() {
        return new Level("0");
    }


    @Override
    public int hashCode() {
        return Objects.hash(levelId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Level)) return false;
        Level level = (Level) o;
        return Objects.equals(levelId, level.levelId);
    }

}
