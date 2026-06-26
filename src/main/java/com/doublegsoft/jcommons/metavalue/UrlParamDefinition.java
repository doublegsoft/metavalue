package com.doublegsoft.jcommons.metavalue;

public class UrlParamDefinition {

  private String name;

  private String value;

  private ValueType type;

  private String symbol;

  private String comparator;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ValueType getType() {
    return type;
  }

  public void setType(ValueType type) {
    this.type = type;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getComparator() {
    return comparator;
  }

  public void setComparator(String comparator) {
    this.comparator = comparator;
  }
}
