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

  public static ActionType getActionType(String symbol) {
    for (ActionType type : values()) {
      if (type.symbol.equals(symbol)) {
        return type;
      }
    }
    return null;
  }

}
