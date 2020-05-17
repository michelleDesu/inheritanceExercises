package se.lexicon.michelle.vehicles;

public class Truck extends Vehicle{
    private boolean haveTrailer;

    public Truck(String type, String brand, String color, int nrOfWheels, boolean haveTrailer) {
        super( brand, color, nrOfWheels);
        setHaveTrailer(haveTrailer);

    }


    @Override
    public String drive() {
        StringBuilder driving = new StringBuilder();
        driving.append("You are now driving a truck with following traits\n");
        driving.append("Brand: ").append(getBrand()).append("\n");
        driving.append("Color: ").append(getColour()).append("\n");
        driving.append("Nr of wheels: ").append(getNrOfWheels()).append("\n");

        if (haveTrailer) {
            driving.append("Trailer: Yes\n");
        } else{
            driving.append("Trailer: No\n");
        }

        return driving.toString();
    }

    public boolean haveTrailer() {
        return haveTrailer;
    }

    public void setHaveTrailer(boolean haveTrailer) {
        this.haveTrailer = haveTrailer;
    }
}
