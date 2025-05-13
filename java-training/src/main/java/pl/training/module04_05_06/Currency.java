package pl.training.module04_05_06;

public enum Currency {

    PLN, EUR, USD;

    @Override
    public String toString() {
        return switch (this) {
            case PLN -> "zł";
            case EUR -> "€";
            case USD -> "$";
        };
    }
}
