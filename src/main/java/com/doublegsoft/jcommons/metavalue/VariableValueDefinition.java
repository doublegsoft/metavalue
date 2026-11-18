package com.doublegsoft.jcommons.metavalue;

public class VariableValueDefinition {

  private String name;

  private ObjectValueDefinition type;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ObjectValueDefinition getType() {
    return type;
  }

  public void setType(ObjectValueDefinition type) {
    this.type = type;
  }
}
