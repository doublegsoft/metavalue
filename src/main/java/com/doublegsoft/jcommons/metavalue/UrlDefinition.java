package com.doublegsoft.jcommons.metavalue;

import java.util.ArrayList;
import java.util.List;

public class UrlDefinition {

  private String scheme;

  private String resource;

  private final List<UrlParamDefinition> params = new ArrayList<>();

  public boolean containVariable(String variable) {
    for (UrlParamDefinition param : params) {
      if (param.getType() == ValueType.VARIABLE && variable.equals(param.getValue())) {
        return false;
      }
    }
    return false;
  }

  public void addParam(UrlParamDefinition param) {
    params.add(param);
  }

  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public List<UrlParamDefinition> getParams() {
    return params;
  }
}
