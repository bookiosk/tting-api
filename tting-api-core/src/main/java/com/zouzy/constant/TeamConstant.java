package com.zouzy.constant;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class TeamConstant {

    public enum TeamStatusEnum {
        PUBLIC(0, "公开"),
        PRIVATE(1, "私有"),
        ENCRYPTION(2, "加密"),
        ;

        private Integer value;

        private String name;

        TeamStatusEnum(Integer value, String name) {
            this.value = value;
            this.name = name;
        }

        public Integer getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

        private static final Map<Integer, TeamStatusEnum> lookup = new HashMap<>();

        static {
            for (TeamStatusEnum e : EnumSet.allOf(TeamStatusEnum.class)) {
                lookup.put(e.value, e);
            }
        }

        public static TeamStatusEnum find(Integer value) {
            return lookup.get(value);
        }
    }
}
