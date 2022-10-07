public enum LoadCapacity {
    N1 ("до 3,5 тонн"),
    N2("от 3,5 до 12 тонн"),
    N3("свыше 12 тонн");
    private String capacity;

    LoadCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
