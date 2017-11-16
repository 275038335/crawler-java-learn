package com.chinaredstar.jc.crawler.biz.param.dict;


import com.chinaredstar.jc.infras.utils.json.JsonUtil;

/**
 * Created by fangjian on 2017/8/29.
 */
public class DictQueryObjParam {

    private String key;

    private Object data;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 获取data Param
     *
     * @param dictQueryObjParam
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T getParam(DictQueryObjParam dictQueryObjParam, Class<T> clazz) {
        if (null == dictQueryObjParam) {
            return null;
        }
        Object data = dictQueryObjParam.getData();
        if (null == data) {
            return null;
        }
        return JsonUtil.toBean(data, clazz);
    }
}
