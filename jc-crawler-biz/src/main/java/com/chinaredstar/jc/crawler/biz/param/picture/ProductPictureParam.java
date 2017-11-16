package com.chinaredstar.jc.crawler.biz.param.picture;

import java.io.Serializable;

public class ProductPictureParam implements Serializable {

    private static final long serialVersionUID = 1756097229586521238L;
    /**
     * 图片url
     */
    private String url;

    /**
     * 是否是封面(1:封面,0:非封面)
     */
    private Integer cover;

    public ProductPictureParam() {
    }

    public ProductPictureParam(String url, Integer cover) {
        this.url = url;
        this.cover = cover;
    }

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
