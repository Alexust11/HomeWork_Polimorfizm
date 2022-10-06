public enum TypeBody {
            SEDAN ("седан"),
            HATCHBACK("хатчбек"),
            COUPE("купе"),
            STATION_WAGON("универсал"),
            SUV("внедорожник"),
            CROSSOVER("кроссовер"),
            PICKUP("пикап"),
            VAN("фургон"),
            MINIVAN("минивэн");
    private String type;

    TypeBody(String type) {
        if (type != null) {
            this.type = type;
        } else {
            this.type = "не задано";
        }

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null) {
            this.type = type;
        } else {
            this.type = "не задано";
        }
    }
}
