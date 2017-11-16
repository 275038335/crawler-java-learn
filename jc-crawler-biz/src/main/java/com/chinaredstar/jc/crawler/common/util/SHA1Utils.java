package com.chinaredstar.jc.crawler.common.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;

import java.util.Formatter;


/**
 * SHA1加密工具类
 * Created by zhuangj on 2017/9/26.
 */
public class SHA1Utils {

    /**
     * SHA1 加密
     * @param str
     * @return
     */
    public static String sha1Encode(String str){
        if(StringUtils.isBlank(str)){
            return StringUtils.EMPTY;
        }
        byte[] bytes=DigestUtils.sha(str);
        return  byteToHex(bytes);
    }


    /**
     * 转16进制输出
     * @param hash
     * @return
     */
    private static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash) {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }
}
