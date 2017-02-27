package com.huseyinbabal.ebay.sdk.order.model.common;

import java.util.ArrayList;
import java.util.List;

public class Warning {

    private String category;
    private String domain;
    private Integer errorId;
    private List<String> inputRefIds = new ArrayList<>();
    private String longMessage;
    private String message;
    private List<String> outputRefIds = new ArrayList<>();
    private List<Parameter> parameters = new ArrayList<>();

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getErrorId() {
        return errorId;
    }

    public void setErrorId(Integer errorId) {
        this.errorId = errorId;
    }

    public List<String> getInputRefIds() {
        return inputRefIds;
    }

    public void setInputRefIds(List<String> inputRefIds) {
        this.inputRefIds = inputRefIds;
    }

    public String getLongMessage() {
        return longMessage;
    }

    public void setLongMessage(String longMessage) {
        this.longMessage = longMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getOutputRefIds() {
        return outputRefIds;
    }

    public void setOutputRefIds(List<String> outputRefIds) {
        this.outputRefIds = outputRefIds;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }
}
