package com.doublegsoft.jcommons.metavalue;

public enum ActionType {

  WIDGET("@"),

  DRAWER("%"),

  DIALOG("^"),

  OVERLAY("#"),

  GOTO("$");

  private final String symbol;

  private ActionType(String symbol) {
    this.symbol = symbol;
  }

}
