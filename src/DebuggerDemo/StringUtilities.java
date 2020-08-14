package DebuggerDemo;

public class StringUtilities {
    private StringBuilder stringBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder stringBuilder, char character) {
        stringBuilder.append(character);
        charsAdded++;
    }
}
