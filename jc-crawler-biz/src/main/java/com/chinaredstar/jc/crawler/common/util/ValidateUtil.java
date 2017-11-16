package com.chinaredstar.jc.crawler.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @version 1.0
 * @Author chaoyue.fan
 * @Date 2016/11/24 18:06
 */
public class ValidateUtil {
    /**
     * @description 手机号码校验  <c>正则匹配</c>
     * @author chaoyue.fan
     * @date 2016/11/24 18:18
     * @param mobiles
     * @return boolean
     * @method isMobileNO
     * @ClassName ValidateUtil
     */
    public static boolean isMobileNO(String mobiles) {
        Pattern p = Pattern.compile("^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0-9]|17[0-9])\\d{8}$");
        Matcher m = p.matcher(mobiles);
        return m.matches();
    }
}
