package ENUMS;

enum ENUMMLAMBDA {

    JOHN("+", (x1, x2) -> x1 + x2),
    BEN("-", (x1, x2) -> x2 - x1),


    LUKE("*", (x1, x2) -> x1 * x2);


    String quality;
    BadName example;

    ENUMMLAMBDA(String quality, BadName example) {
        this.quality = quality;
        this.example = example;
    }

    //abstract String get() ;
}

@FunctionalInterface
interface BadName {
    int get(int x1, int x2);
}


class mainlambda {

    public static void main(String[] args) {
        System.out.println(ENUMMLAMBDA.BEN.example.get(1,2));

    }
}



