package ENUMS;

enum ENUMMETHOD  {

    JOHN("GOOD") {
         protected String get() {
            return "shadamota";
        }
    },
    BEN("OK"){
    protected String get() {
        return "kalakola";
    }},

    LUKE("BAD"){
     protected String get() {
        return "bapkabeta";
    }};

    private String quality;
    private ENUMMETHOD(String quality) {
        this.quality=quality;
    }

    abstract String get() ;
}

//@FunctionalInterface
//interface Example {
//    String get();
//}


class main {

    public static void main(String[] args) {
       // System.out.println(ENUMMETHOD.valueOf("JOHN"));

    }
}

