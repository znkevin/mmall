package com.mmall.common;

import com.google.common.collect.Sets;

import java.io.StringReader;
import java.util.Set;

public class Const {
    public static final String CURRENT_USER = "current_User";
    public static final String EMALL = "email";
    public static final String USERNAEM = "username";

    public interface ProductListOrderBy {
        Set PRICE_ASC_DESC = Sets.newHashSet("price_asc", "price_desc");
    }

    /**
     * 用   户  0
     * 管理员   1
     */
    public interface Role {
        int ROLE_CUSTOMER = 0;
        int ROLE_ADMIN = 1;
    }

    public enum productStatusEnum {
        ON_SALE(1, "在售");
        private int code;
        private String desc;

        productStatusEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }


    public interface Cart {
        int CHECKED = 1;  //购物车选中状态
        int UN_CHECKED = 0;//购物车未选中状态
        String LIMIT_NUM_FAIL="LIMIT_NUM_FAIL";
        String LIMIT_NUM_SUCCESS="LIMIT_NUM_SUCCESS";
    }
}
