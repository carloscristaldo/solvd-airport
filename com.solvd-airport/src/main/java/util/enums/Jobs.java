package util.enums;

//CAT1: LEADER
//CAT2: REGULAR
//CAT3: TRAINEE

public enum Jobs {
    PILOT("PILOT"),
    COPILOT("COPILOT"),
    ST_CAT1("STEWARDESS_CAT1"),
    ST_CAT2("STEWARDESS_CAT2"),
    ST_CAT3("STEWARDESS_CAT3"),
    OP_CAT1("OPERATOR_CAT1"),
    OP_CAT2("OPERATOR_CAT2"),
    OP_CAT3("OPERATOR_CAT3"),;

    private final String output;

    Jobs(String output){
        this.output = output;
    }

    @Override
    public String toString() {
        return output;

    }
}
