package com.doublegsoft.jcommons.metavalue;

public enum ActionType {

  GOTO("@"),

  DRAWER("%"),

  SHEET("^"),

  DIALOG("#"),

  WIDGET("$"),

  API("/");

  private final String symbol;

  private ActionType(String symbol) {
    this.symbol = symbol;
  }

  public String symbol() {
    return symbol;
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
