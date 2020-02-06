public class Card {

    //En klass PlayingCard som representerar ett vanligt spelkort (alternativt ett motsvarande kort från ett annat kortspel som t ex Uno).
    // PlayingCard ska innehålla/representera (alternativt motsvarande möjliga värden för kort i annat kortspel):
    //- Färg/svit. Dvs spader (♠), hjärter (♥), ruter (♦) och klöver (♣)
    //- Valör. Dvs ess, 2, 3, 4, 5, 6, 7, 8, 9, 10, knekt, dam, kung
    //- Indikerar om ett kort är vänt/dolt eller inte. Dvs, är färg/svit och valör synlig

    private Value value;
    private Colour colour;
    private Boolean isShowing;

    public Card(Value value, Colour colour, Boolean isShowing) {
        this.value = value;
        this.colour = colour;
        this.isShowing = isShowing;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Boolean getShowning() {
        return isShowing;
    }

    public void setShowning(Boolean shown) {
        isShowing = shown;
    }
}
