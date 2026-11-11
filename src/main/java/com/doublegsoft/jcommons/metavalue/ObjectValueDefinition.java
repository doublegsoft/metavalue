package com.doublegsoft.jcommons.metavalue;

import java.util.ArrayList;
import java.util.List;

public class ObjectValueDefinition {

  private final List<AttributeValueDefinition> attributeValues = new ArrayList<>();

  private String name;

  private AttributeValueDefinition search;

  public List<AttributeValueDefinition> getAttributeValues() {
    return attributeValues;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AttributeValueDefinition getSearch() {
    return search;
  }

  public void setSearch(AttributeValueDefinition search) {
    this.search = search;
  }
}
