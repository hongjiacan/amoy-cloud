package com.amoy.cloud.common.util;

import com.amoy.cloud.common.util.bcrypt.BCrypt;

/**
 * @description: BCryptUtil
 * @author: hjc
 * @create: 2019-06-20
 */
public class BCryptUtil {

    public static String encrypt(String origin) {

        return BCrypt.hashpw(origin, BCrypt.gensalt());
    }

    public static Boolean check(String origin, String encrypt){

        return BCrypt.checkpw(origin, encrypt);
    }
}
