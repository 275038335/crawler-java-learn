package com.chinaredstar.jc.crawler.proxy.common.page;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * Created by harding on 2016/8/23.
 * <p/>
 * 需要分页查询的bean继承此类
 */
public class ProxyPageParam implements Serializable {

    private static final long serialVersionUID = 2142926093095478252L;

    @Min(value = 0, message = "pageNo必须大于0")
    private Integer pageNo = 0; //前端不传，默认不分页

    @Min(value = 2, message = "pageSize必须大于1")
    private Integer pageSize = 10;//前端不传，默认取10条

    public boolean isPage() {
        return pageNo > 0;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
