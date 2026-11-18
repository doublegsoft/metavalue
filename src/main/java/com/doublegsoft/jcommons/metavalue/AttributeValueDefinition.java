package com.doublegsoft.jcommons.metavalue;

public class AttributeValueDefinition {

  private String name;

  private Object value;

  private ObjectValueDefinition parent;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public ObjectValueDefinition getParent() {
    return parent;
  }

  public void setParent(ObjectValueDefinition parent) {
    this.parent = parent;
  }
}
