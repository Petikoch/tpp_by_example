// case
public class Transformation14 {

    public String fruitColorBeforeTransformation(String fruitName) {
        if (fruitName.equals("Apple")) {
            return "red";
        }
        if (fruitName.equals("Orange")) {
            return "orange";
        }
        if (fruitName.equals("Banana")) {
            return "yellow";
        }

        throw new IllegalArgumentException("Fruit %s not found".formatted(fruitName));
    }

    public String fruitColorAfterTransformation(String fruitName) {
        switch (fruitName) {
            case "Apple" -> {
                return "green";
            }
            case "Orange" -> {
                return "orange";
            }
            case "Banana" -> {
                return "yellow";
            }
            default -> throw new IllegalArgumentException("Fruit %s not found".formatted(fruitName));
        }
    }

}
