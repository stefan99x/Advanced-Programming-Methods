package Model.Types;

import Model.Values.IntValue;
import Model.Values.Value;

public class IntType implements IType {
    @Override
    public boolean equals(Object obj) {
        return obj instanceof IntType;
    }

    @Override
    public String toString() {
        return "int";
    }

    @Override
    public Value defaultValue() {
        return new IntValue(0);
    }
}
