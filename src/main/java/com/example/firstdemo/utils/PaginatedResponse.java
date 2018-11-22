package com.example.firstdemo.utils;

import java.util.List;

public class PaginatedResponse extends SuccessResponse {
    private long pageNumber;
    private long numberOfObjects;
    private long totalObjects;
    private long pageSize;
    private boolean hasNextPage;
    private boolean hasPreviousPage;
    public PaginatedResponse(int statusCode, long numberOfObjects, long pageNumber, List objects, long totalObjects, long pageSize, boolean hasNextPage, boolean hasPreviousPage) {
        super(statusCode, objects);
        this.pageNumber=pageNumber;
        this.totalObjects = totalObjects;
        this.pageSize=pageSize;
        this.hasNextPage = hasNextPage;
        this.hasPreviousPage = hasPreviousPage;
        this.numberOfObjects=numberOfObjects;
    }

    public long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public long getTotalObjects() {
        return totalObjects;
    }

    public void setTotalObjects(long totalObjects) {
        this.totalObjects = totalObjects;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public boolean isHasPreviousPage() {
        return hasPreviousPage;
    }

    public void setHasPreviousPage(boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }
}
