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

  public AttributeValueDefinition variabilizeAttribute(String name) {
    AttributeValueDefinition attr = type.getAttributeValue(name);
    if (attr == null) {
      throw new IllegalArgumentException("not found \"" + name + "\" attribute in \"" + type.getName() + "\"");
    }
    AttributeValueDefinition retVal = new AttributeValueDefinition();
    retVal.setValue(attr.getValue());
    retVal.setParent(attr.getParent());
    retVal.setName(attr.getName());
    retVal.setVariable(this);
    return retVal;
  }
}
