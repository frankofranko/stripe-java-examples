package com.stripe;

public enum StatusResponse {
    SUCCESS ("Success"),
    ERROR ("Error");

    private String status;
    // constructors, getters

    StatusResponse(final String status) {
        this.status = status;
    }
}
