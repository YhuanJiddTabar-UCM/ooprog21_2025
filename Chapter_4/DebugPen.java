class DebugPen {
    private String color;
    private String point;

    
    public DebugPen() {
        color = "black";
        point = "fine";
    }

    // constructor with parameter
    public DebugPen(String color, String point) {
        this.color = color;   // originally was color = color; fixed into this.color = color;  
        this.point = point;   // originally was point = point; fixed into this.point = point;  
    }

    //Getter 
    public String getColor() {
        return color;
    }

    
    public String getPoint() {
        return point;
    }
}

