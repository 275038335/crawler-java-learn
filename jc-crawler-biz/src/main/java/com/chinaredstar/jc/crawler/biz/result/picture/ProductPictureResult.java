package com.chinaredstar.jc.crawler.biz.result.picture;

import java.io.Serializable;

public class ProductPictureResult implements Serializable{

    private static final long serialVersionUID = 6346424969454201039L;
    /**
     * 图片url
     */
    private String url;

    /**
     * 是否是封面(1:封面,0:非封面)
     */
    private Integer cover;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCover() {
        return cover;
    }

    public void setCover(Integer cover) {
        this.cover = cover;
    }
}
