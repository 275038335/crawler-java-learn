package com.chinaredstar.jc.crawler.biz.param.dict;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by fangjian on 2017/8/29.
 */
public class DictQueryParam2 {

    @NotNull(message = "is null error")
    @Size(min = 1, message = "长度为1~n")
    private List<DictQueryObjParam> objParams;

    public List<DictQueryObjParam> getObjParams() {
        return objParams;
    }

    public void setObjParams(List<DictQueryObjParam> objParams) {
        this.objParams = objParams;
    }
}
