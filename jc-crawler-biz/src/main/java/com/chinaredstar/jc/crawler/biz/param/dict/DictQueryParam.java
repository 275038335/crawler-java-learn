package com.chinaredstar.jc.crawler.biz.param.dict;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by fangjian on 2017/8/2.
 */
public class DictQueryParam {

    @NotNull(message = "is null error")
    @Size(min = 1, message = "长度为1~n")
    private List<String> keys;

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }
}
