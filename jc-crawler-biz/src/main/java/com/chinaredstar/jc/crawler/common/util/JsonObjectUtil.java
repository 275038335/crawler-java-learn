package com.chinaredstar.jc.crawler.common.util;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.JavaIdentifierTransformer;

/**
 *
 * Created by zhuangj on 2017/9/22.
 */
public class JsonObjectUtil {

    public   static <T> T JsonLowCaseFirstChart(String content,Class<T> clazz){
        JSONObject jsonObj1 = JSONObject.fromObject(content);
        JsonConfig config = new JsonConfig();
        config.setJavaIdentifierTransformer(new JavaIdentifierTransformer() {

            @Override
            public String transformToJavaIdentifier(String str) {
                char[] chars = str.toCharArray();
                chars[0] = Character.toLowerCase(chars[0]);
                return new String(chars);
            }

        });
        config.setRootClass(clazz);
        return  (T)JSONObject.toBean(jsonObj1, config);
    }

}
