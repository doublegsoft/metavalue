package com.doublegsoft.jcommons.metavalue;

import java.util.ArrayList;
import java.util.List;

public class ActionDefinition {

  private String resource;

  private String path;

  private String method;

  private ActionType type;

  private final List<UrlParamDefinition> params = new ArrayList<>();

  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public ActionType getType() {
    return type;
  }

  public void setType(ActionType type) {
    this.type = type;
  }

  public void addParam(UrlParamDefinition param) {
    params.add(param);
  }

  public List<UrlParamDefinition> getParams() {
    return params;
  }
}
