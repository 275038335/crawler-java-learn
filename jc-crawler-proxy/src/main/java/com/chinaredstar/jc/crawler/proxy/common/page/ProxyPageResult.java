package com.chinaredstar.jc.crawler.proxy.common.page;



import java.io.Serializable;

/**
 * @title :
 * Created by MoXingwang on 2016-08-31 11:00.
 */
public class ProxyPageResult<T> implements Serializable {
    private int totalPage;
    private int currentPage;
    private int showCount;
    private int totalResult;
    private T data;
    private boolean hasNextPage;

    public ProxyPageResult() {
    }

    public ProxyPageResult(T data, int currentPage, int showCount, int totalResult) {
        this.data = data;
        this.currentPage = currentPage;
        this.showCount = showCount;
        this.totalResult = totalResult;
        if (showCount > 0) {
            this.totalPage = totalResult / showCount + (totalResult % showCount > 0 ? 1 : 0);
        }
    }

    public boolean getHasNextPage() {
        if (currentPage >= totalPage) {
            return false;
        }
        return true;
    }

    public int getShowCount() {
        return showCount;
    }

    public void setShowCount(int showCount) {
        this.showCount = showCount;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(int totalResult) {
        this.totalResult = totalResult;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
